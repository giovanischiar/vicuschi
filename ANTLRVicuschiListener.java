import java.util.Map;
import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ANTLRVicuschiListener extends VicuschiBaseListener {
	private Map<String, Attribute> attributeTable = new HashMap<>();
	private Map<String, ParserRuleContext> nodeTable = new HashMap<>();

	private Map<ParserRuleContext, String> actualType = new HashMap<>();

	@Override public void enterFunction_declaration(VicuschiParser.Function_declarationContext ctx) { 
		String functionName = ctx.generic_unary_declaration().integer_declaration().ID().getText();
		System.out.println(functionName);
	}

	@Override public void exitProgram(VicuschiParser.ProgramContext ctx) {
		System.out.println(attributeTable);
		System.out.println(nodeTable);
		System.out.println(actualType);
	}

	@Override public void exitFunction_declaration(VicuschiParser.Function_declarationContext ctx) {
	
		String id = ctx.getChild(0).getChild(0).getChild(1).getText();
		Attribute a = attributeTable.get(id);

		nodeTable.put(a.name, ctx);
		//System.out.println("tipo passado para cima: "+a.type);
		System.out.println("function_declaration: "+id+". Nodo: "+ctx);	
	}

	@Override public void exitGeneric_declaration(VicuschiParser.Generic_declarationContext ctx) {	
		String id_name = ctx.getChild(0).getChild(0).getChild(1).getText();
		if(ctx.getChild(0).getChild(0).getChild(1) instanceof VicuschiParser.Generic_arrayContext) {
			id_name = ctx.getChild(0).getChild(0).getChild(1).getChild(1).getChild(1).getText();
		}
		
		addAttributeAtNodeTable(id_name, ctx);
	}

	@Override public void exitGeneric_attribution(VicuschiParser.Generic_attributionContext ctx) {	
		// buscamos o tipo pelo qual a variavel foi declarada

		String id_name = "";
		if (ctx.attribuition_id() != null){
			id_name = ctx.attribuition_id().ID().getText();
		} else { // atribuicao de array
			id_name = ctx.attribuition_array().generic_array().ID().getText();
		}
		

		Attribute a = attributeTable.get(id_name);

		System.out.println(id_name+" eh do tipo: "+a.type);

		actualType.put(ctx, a.type);

		// agora buscamos o tipo de seu neto "attribution", para comparacao
		String expected_type = "";
		if (ctx.attribuition_id() != null){
			expected_type = actualType.get(ctx.attribuition_id().attribution());
		} else { // attribuicao de array
			expected_type = actualType.get(ctx.attribuition_array().attribution());
		}
		
		if(!a.type.equals(expected_type)) {
			System.out.println("Error: cannot assign " + expected_type + " to " + a.type);
		} else {
			// TODO atribuir a.value
		}
	}

	private void addAttributeAtNodeTable(String id, ParserRuleContext ctx) {
		//System.out.println(attributeTable);
		if(attributeTable.containsKey(id)) {
			Attribute a = attributeTable.get(id);
			nodeTable.put(a.name, ctx);
		} else {
			System.out.println("Warning: " + id + " doesn't exist at  symbol table (failed to be declared)");
		}
	}
	@Override public void exitAttribution(VicuschiParser.AttributionContext ctx) {
		String expected_type = actualType.get(ctx.attributed());

		actualType.put(ctx, expected_type);
		//addAttributeAtNodeTable(id, ctx);
	}

	@Override public void exitAttributed(VicuschiParser.AttributedContext ctx) {
		//String expected_type = actualType.get(ctx.attributed());

		String expected_type = "meu tipo bonitinho";

		if(ctx.literal() != null) {
			expected_type = actualType.get(ctx.literal());
		} else if(ctx.unary_expression() != null) {
			expected_type = actualType.get(ctx.unary_expression());
		} else if(ctx.logic_expr() != null) {
			expected_type = actualType.get(ctx.logic_expr());
		} else if(ctx.function_call() != null) {
			expected_type = actualType.get(ctx.function_call());
		} else {
			expected_type = actualType.get(ctx.arith_expr());
		}

		actualType.put(ctx, expected_type);
		//addAttributeAtNodeTable(id, ctx);
	}

	@Override public void exitLiteral(VicuschiParser.LiteralContext ctx) {
		String expected_type = "meu tipo bonitinho";

		if(ctx.ARRAY() != null) {
			expected_type = "array";
		} else if(ctx.INT_NUMBER() != null) {
			expected_type = "int";
		} else if(ctx.FLOAT_NUMBER() != null) {
			expected_type = "float";
		} else if(ctx.WORD() != null) {
			expected_type = "string";
		} else {
			expected_type = "boolean";
		}
		actualType.put(ctx, expected_type);
	}

	@Override public void exitUnary_expression(VicuschiParser.Unary_expressionContext ctx) {
		if(ctx.decrement() != null) {
			String id = ctx.decrement().ID().getText();
			if(!attributeTable.get(id)) {
				System.out.println("Error: " + id + " doesn't exist at symbol table (failed to be declared)");
				return;
			} else {
				expected_type = attributeTable.get(id).type;
			}
		} else {
			String id = ctx.increment().ID().getText();
			if(!attributeTable.get(id)) {
				System.out.println("Error: " + id + " doesn't exist at symbol table (failed to be declared)");
				return;
			} else {
				expected_type = attributeTable.get(id).type;
			}
		}
		actualType.put(ctx, expected_type);
	}

	@Override public void exitGeneric_unary_declaration(VicuschiParser.Generic_unary_declarationContext ctx) {
		String id = ctx.getChild(0).getChild(1).getText();
		//System.out.println("generic_unary_declaration: "+id);
		addAttributeAtNodeTable(id, ctx);
		//System.out.println("tipo passado para cima: "+a.type);
		//System.out.println("generic_unary_declaration: "+id+". Nodo: "+ctx);
	}

	@Override public void exitString_declaration(VicuschiParser.String_declarationContext ctx) {
		Attribute<String> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "string";
		attribute.value = null;
		if(attributeTable.containsKey(attribute.name)) {
			System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		attributeTable.put(attribute.name, attribute);
		nodeTable.put(attribute.name, ctx);
	}

	@Override public void exitInteger_declaration(VicuschiParser.Integer_declarationContext ctx) { 
		Attribute<Integer> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "int";
		attribute.value = null;
		if(attributeTable.containsKey(attribute.name)) {
			System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		attributeTable.put(attribute.name, attribute);
		nodeTable.put(attribute.name, ctx);
	}

	@Override public void exitFloat_declaration(VicuschiParser.Float_declarationContext ctx) { 
		Attribute<Float> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "float";
		attribute.value = null;
		if(attributeTable.containsKey(attribute.name)) {
			System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		attributeTable.put(attribute.name, attribute);
		nodeTable.put(attribute.name, ctx);
	}

	@Override public void exitBoolean_declaration(VicuschiParser.Boolean_declarationContext ctx) { 
		Attribute<Boolean> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "boolean";
		attribute.value = null;
		if(attributeTable.containsKey(attribute.name)) {
			System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		attributeTable.put(attribute.name, attribute);
		nodeTable.put(attribute.name, ctx);
	}

	@Override public void exitGeneric_array_declaration(VicuschiParser.Generic_array_declarationContext ctx) {
		String id = ctx.getChild(0).getChild(1).getChild(0).getText();
		//System.out.println("generic_array_declaration: "+id);
		addAttributeAtNodeTable(id, ctx);
		//System.out.println("tipo passado para cima: "+a.type);
		//System.out.println("generic_unary_declaration: "+id+". Nodo: "+ctx);	
	}

	@Override public void exitString_array_declaration(VicuschiParser.String_array_declarationContext ctx) {
		//verificação da presença da declaração do index
		TerminalNode id = ctx.generic_array().index().ID();
		//TerminalNodeImpl id = prc.ID();

		if (id != null){
			if (attributeTable.containsKey(id.getText())){
				if (attributeTable.get(id.getText()).type.equals("int")){
					// Adicionando o nodo
					Attribute<Boolean[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "string[]";
					attribute.value = null;
					if(attributeTable.containsKey(attribute.name)) {
						System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					attributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
				} else {
					System.out.println("Error: array index has to be of type 'int' ");	
				}
			} else{
				System.out.println("Error: undeclared array index: "+id.getText());
			}
		} else { // se o indice eh um numero
					// Adicionando o nodo
					Attribute<Boolean[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "string[]";
					attribute.value = null;
					attribute.size = Integer.parseInt(ctx.generic_array().index().INT_NUMBER().getText());
					//System.out.println(attribute.size);
					if(attributeTable.containsKey(attribute.name)) {
						System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					attributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
		}
	}

	@Override public void exitInteger_array_declaration(VicuschiParser.Integer_array_declarationContext ctx) { 
		//verificação da presença da declaração do index
		TerminalNode id = ctx.generic_array().index().ID();
		//TerminalNodeImpl id = prc.ID();

		if (id != null){
			if (attributeTable.containsKey(id.getText())){
				if (attributeTable.get(id.getText()).type.equals("int")){
					// Adicionando o nodo
					Attribute<Boolean[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "int[]";
					attribute.value = null;
					if(attributeTable.containsKey(attribute.name)) {
						System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					attributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
				} else {
					System.out.println("Error: array index has to be of type 'int' ");	
				}
			} else{
				System.out.println("Error: undeclared array index: "+id.getText());
			}
		} else { // se o indice eh um numero
					// Adicionando o nodo
					Attribute<Boolean[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "int[]";
					attribute.value = null;
					attribute.size = Integer.parseInt(ctx.generic_array().index().INT_NUMBER().getText());
					//System.out.println(attribute.size);
					if(attributeTable.containsKey(attribute.name)) {
						System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					attributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
		}
	}

	@Override public void exitFloat_array_declaration(VicuschiParser.Float_array_declarationContext ctx) { 
		//verificação da presença da declaração do index
		TerminalNode id = ctx.generic_array().index().ID();
		//TerminalNodeImpl id = prc.ID();

		if (id != null){
			if (attributeTable.containsKey(id.getText())){
				if (attributeTable.get(id.getText()).type.equals("int")){
					// Adicionando o nodo
					Attribute<Boolean[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "float[]";
					attribute.value = null;
					if(attributeTable.containsKey(attribute.name)) {
						System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					attributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
				} else {
					System.out.println("Error: array index has to be of type 'int' ");	
				}
			} else{
				System.out.println("Error: undeclared array index: "+id.getText());
			}
		} else { // se o indice eh um numero
					// Adicionando o nodo
					Attribute<Boolean[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "float[]";
					attribute.value = null;
					attribute.size = Integer.parseInt(ctx.generic_array().index().INT_NUMBER().getText());
					//System.out.println(attribute.size);
					if(attributeTable.containsKey(attribute.name)) {
						System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					attributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
		}
	}

	@Override public void exitBoolean_array_declaration(VicuschiParser.Boolean_array_declarationContext ctx) { 
		//System.out.println("exitBoolean_array_declaration");

		//verificação da presença da declaração do index
		TerminalNode id = ctx.generic_array().index().ID();
		//TerminalNodeImpl id = prc.ID();

		if (id != null){
			if (attributeTable.containsKey(id.getText())){
				if (attributeTable.get(id.getText()).type.equals("int")){
					// Adicionando o nodo
					Attribute<Boolean[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "boolean[]";
					attribute.value = null;
					if(attributeTable.containsKey(attribute.name)) {
						System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					attributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
				} else {
					System.out.println("Error: array index has to be of type 'int' ");	
				}
			} else{
				System.out.println("Error: undeclared array index: "+id.getText());
			}
		} else { // se o indice eh um numero
					// Adicionando o nodo
					Attribute<Boolean[]> attribute = new Attribute<>();
					attribute.name = ctx.generic_array().getChild(0).getText();
					attribute.type = "boolean[]";
					attribute.value = null;
					attribute.size = Integer.parseInt(ctx.generic_array().index().INT_NUMBER().getText());
					//System.out.println(attribute.size);
					if(attributeTable.containsKey(attribute.name)) {
						System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.generic_array().ID().getSymbol().getLine() + ":" + ctx.generic_array().ID().getSymbol().getCharPositionInLine());
					}

					attributeTable.put(attribute.name, attribute);
					nodeTable.put(attribute.name, ctx);
		}

		//System.out.println("end exitBoolean_array_declaration");
	}

	class Attribute<T> implements Comparable<Attribute> {
		public String name;
		public String type;
		public T value;
		public int size = 1;
		@Override
		public String toString() {
			return "(" + name + ", " + type + ", " + value + ", " + size + ")";
		}

		@Override
		public int compareTo(ANTLRVicuschiListener.Attribute other) {

			return this.name.equals(other.name) ? 1 : 0;
		}
	}
}