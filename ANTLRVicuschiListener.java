import java.util.Map;
import java.util.HashMap;
import org.antlr.v4.runtime.ParserRuleContext;

public class ANTLRVicuschiListener extends VicuschiBaseListener {
	private Map<String, Attribute> attributeTable = new HashMap<>();
	private Map<String, ParserRuleContext> nodeTable = new HashMap<>();

	@Override public void enterFunction_declaration(VicuschiParser.Function_declarationContext ctx) { 
		String functionName = ctx.generic_unary_declaration().integer_declaration().ID().getText();
		System.out.println(functionName);
	}

	@Override public void exitProgram(VicuschiParser.ProgramContext ctx) {
		System.out.println(attributeTable);
		System.out.println(nodeTable);
	}

	@Override public void exitFunction_declaration(VicuschiParser.Function_declarationContext ctx) {
	
		String id = ctx.getChild(0).getChild(0).getChild(1).getText();
		Attribute a = attributeTable.get(id);

		nodeTable.put(a.name, ctx);
		//System.out.println("tipo passado para cima: "+a.type);
		System.out.println("function_declaration: "+id+". Nodo: "+ctx);	
	}

	@Override public void exitGeneric_declaration(VicuschiParser.Generic_declarationContext ctx) {
	
		String id = ctx.getChild(0).getChild(0).getChild(1).getText();
		Attribute a = attributeTable.get(id);

		nodeTable.put(a.name, ctx);
		//System.out.println("tipo passado para cima: "+a.type);
		System.out.println("generic_declaration: "+id+". Nodo: "+ctx);	
	}

	@Override public void exitGeneric_unary_declaration(VicuschiParser.Generic_unary_declarationContext ctx) {
		
		String id = ctx.getChild(0).getChild(1).getText();
		Attribute a = attributeTable.get(id);

		nodeTable.put(a.name, ctx);
		//System.out.println("tipo passado para cima: "+a.type);
		//System.out.println("generic_unary_declaration: "+id+". Nodo: "+ctx);
	}

	@Override public void exitGeneric_array_declaration(VicuschiParser.Generic_array_declarationContext ctx) {
		
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

	class Attribute<T> implements Comparable<Attribute> {
		public String name;
		public String type;
		public T value;
		@Override
		public String toString() {
			return "(" + name + ", " + type + ", " + value + ")";
		}

		@Override
		public int compareTo(ANTLRVicuschiListener.Attribute other) {

			return this.name.equals(other.name) ? 1 : 0;
		}
	}
}