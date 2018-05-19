import java.util.Map;
import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class ANTLRVicuschiListener extends VicuschiBaseListener {
	private Map<String, Attribute> attributeTable = new HashMap<>();
	private Map<String, ParserRuleContext> nodeTable = new HashMap<>();

	private Map<ParserRuleContext, String> actualType = new HashMap<>();

	@Override public void enterFunction_declaration(VicuschiParser.Function_declarationContext ctx) { 
		String functionName = ctx.generic_unary_declaration().integer_declaration().ID().getText();
	}

	@Override public void exitFor_declaration(VicuschiParser.For_declarationContext ctx) {
		Attribute<Integer> attribute = new Attribute<>();

		if(ctx.ID() != null) {
			String id = ctx.ID().getText();
			attribute.name = id;
			attribute.type = "int";
			attribute.maxValue = null;
			attribute.hasValue = true;
		}

		VicuschiParser.Inclusive_intervalContext inclusiveInterval  = ctx.interval().inclusive_interval();
		VicuschiParser.NonInclusive_intervalContext nonInclusiveInterval  = ctx.interval().nonInclusive_interval();

		if(inclusiveInterval != null) {
			attribute.value = Integer.parseInt(inclusiveInterval.INT_NUMBER().get(0).getText());
			attribute.maxValue = Integer.parseInt(inclusiveInterval.INT_NUMBER().get(1).getText());
		} else {
			// is noninclusiveInterval
			attribute.value = Integer.parseInt(nonInclusiveInterval.INT_NUMBER().get(0).getText());
			attribute.maxValue = Integer.parseInt(nonInclusiveInterval.INT_NUMBER().get(1).getText())-1;
		}

		attributeTable.put(attribute.name, attribute);
		addAttributeAtNodeTable(attribute.name, ctx);
	}

	@Override public void exitProgram(VicuschiParser.ProgramContext ctx) {
		System.out.println(attributeTable);
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
		VicuschiParser.AttributionContext attribution;
		if (ctx.attribution_id() != null){
			id_name = ctx.attribution_id().ID().getText();
			attribution = ctx.attribution_id().attribution();
		} else { // atribuicao de array
			id_name = ctx.attribution_array().generic_array().ID().getText();
			attribution = ctx.attribution_array().attribution();
		}
		
		Attribute a = attributeTable.get(id_name);

		System.out.println(id_name+" eh do tipo: "+a.type);

		typeComparation(attribution, a);
	}

	public void typeComparation(VicuschiParser.AttributionContext ctx, Attribute a) {
		actualType.put(ctx, a.type);

		// agora buscamos o tipo de seu neto "attribution", para comparacao
		String expected_type = actualType.get(ctx);

		if(!a.type.equals(expected_type)) {
			System.out.println("Error: cannot assign " + expected_type + " to " + a.type);
		} else {
			a.hasValue = true;
		}
	}

	@Override
	public void exitDeclaration_attribution(VicuschiParser.Declaration_attributionContext ctx) {
		String id_name = ctx.getChild(0).getChild(0).getChild(0).getChild(1).getText();
		addAttributeAtNodeTable(id_name, ctx);
		Attribute a = attributeTable.get(id_name);
		typeComparation(ctx.attribution(), a);
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
		String expected_type = "";

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

	@Override public void exitFunction_call(VicuschiParser.Function_callContext ctx) {
		String id = ctx.ID().getText();
		if(!attributeTable.containsKey(id)) {
			System.out.println("Error: " + id + " doesn't exist at symbol table (failed to be declared)");
			return;
		}

		Attribute attribute = attributeTable.get(id);

		if(ctx.params() != null) {
			int nparams = ctx.params().attributed().size();
			if(nparams != attribute.nparams) {
				System.out.println("Error: number of params in function " + id + " doesn't match (was " +  nparams + ", expect " + attribute.nparams + ")");
			}
		}
	}

	@Override public void exitUnary_expression(VicuschiParser.Unary_expressionContext ctx) {
		String expected_type = "";
		if(ctx.decrement() != null) {
			String id = ctx.decrement().ID().getText();
			if(!attributeTable.containsKey(id)) {
				System.out.println("Error: " + id + " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			if(!attributeTable.get(id).hasValue) {
				System.out.println("Error: " + id + " declared but has no value");
				return;
			}

			expected_type = attributeTable.get(id).type;
		} else if(ctx.increment() != null) {
			String id = ctx.increment().ID().getText();
			if(!attributeTable.containsKey(id)) {
				System.out.println("Error: " + id + " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			if(!attributeTable.get(id).hasValue) {
				System.out.println("Error: " + id + " declared but has no value");
				return;
			}

			expected_type = attributeTable.get(id).type;
		} else {
			String id = ctx.not_id().ID().getText();
			if(!attributeTable.containsKey(id)) {
				System.out.println("Error: " + id + " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			if(!attributeTable.get(id).hasValue) {
				System.out.println("Error: " + id + " declared but has no value");
				return;
			}

			expected_type = attributeTable.get(id).type;
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

	@Override
	public void enterArith_id(VicuschiParser.Arith_idContext ctx) {
		String id = ctx.ID().getText();
		if(!attributeTable.containsKey(id)) {
			System.out.println("Error: " + id + " doesn't exist at symbol table (failed to be declared)");
			return;
		}

		Attribute attribute = attributeTable.get(id);

		if(!attribute.hasValue) {
			System.out.println("Error: " + id + " declared but has no value");
			return;
		}

		nodeTable.put(attribute.name, ctx);
	}

	@Override
	public void enterR_logic(VicuschiParser.R_logicContext ctx) {
		if(ctx.getChild(1) instanceof VicuschiParser.ComparatorContext) {
			String[] id = {ctx.getChild(0).getText(), ctx.getChild(2).getText()};
			if(!attributeTable.containsKey(id[0])) {
				System.out.println("Error: " + id[0] + " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			if(!attributeTable.containsKey(id[1])) {
				System.out.println("Error: " + id[1] + " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			Attribute[] attributes = { attributeTable.get(id[0]), attributeTable.get(id[1]) };

			if(!attributes[0].hasValue) {
				System.out.println("Error: " + id[0] + " declared but has no value");
				return;
			}
			
			if(!attributes[1].hasValue) {
				System.out.println("Error: " + id[1] + " declared but has no value");
				return;
			}

			nodeTable.put(attributes[0].name, ctx);
			nodeTable.put(attributes[1].name, ctx);
			return;
		}

		if(ctx.ID().size() == 1) {
			String id_name = ctx.ID().get(0).getText();
			if(!attributeTable.containsKey(id_name)){
				System.out.println("Error: " + id_name + " doesn't exist at symbol table (failed to be declared)");
				return;
			}

			Attribute attribute = attributeTable.get(id_name);

			if(!attribute.hasValue) {
				System.out.println("Error: " + id_name + " declared but has no value");
				return;
			}

			nodeTable.put(attribute.name, ctx);
		}
	}

	@Override public void exitFunction_declaration(VicuschiParser.Function_declarationContext ctx) {
		String id_name = ctx.getChild(0).getChild(0).getChild(1).getText();
		int nparams = ctx.declaration_params().generic_declaration().size();
		if(!attributeTable.containsKey(id_name)){
			System.out.println("Error: " + id_name + " doesn't exist at symbol table (failed to be declared)");
			return;
		}

		Attribute attribute = attributeTable.get(id_name);
		attribute.nparams = nparams;
		attribute.hasValue = true;
		nodeTable.put(attribute.name, ctx);
	}

	class Attribute<T> implements Comparable<Attribute> {
		public String name;
		public String type;
		public T value;
		public int size = 1;
		public Boolean hasValue = false;
		public Integer nparams;
		public Integer maxValue;

		@Override
		public String toString() {
			return "(name:" + name 
			    + ", type: " + type 
			    + ", value: " + value 
			    + ", size: " + size 
			    + ", hasValue: " + hasValue 
			    + ", nparams: " + nparams 
			    + ", maxValue: " + maxValue + ")";
		}

		@Override
		public int compareTo(ANTLRVicuschiListener.Attribute other) {
			return this.name.equals(other.name) ? 1 : 0;
		}
	}
}