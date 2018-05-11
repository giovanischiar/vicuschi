import java.util.Map;
import java.util.HashMap;

public class ANTLRVicuschiListener extends VicuschiBaseListener {
	private Map<String, Attribute> attributeSymbol = new HashMap<>();

	@Override public void enterFunction_declaration(VicuschiParser.Function_declarationContext ctx) { 
		String functionName = ctx.generic_unary_declaration().integer_declaration().ID().getText();
		System.out.println(functionName);
	}

	@Override public void exitProgram(VicuschiParser.ProgramContext ctx) {
		System.out.println(attributeSymbol);
	}

	@Override public void enterString_declaration(VicuschiParser.String_declarationContext ctx) {
		Attribute<String> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "string";
		attribute.value = null;
		if(attributeSymbol.containsKey(attribute.name)) {
			System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		attributeSymbol.put(attribute.name, attribute);
	}

	@Override public void exitInteger_declaration(VicuschiParser.Integer_declarationContext ctx) { 
		Attribute<Integer> attribute = new Attribute<>();
		attribute.name = ctx.ID().getText();
		attribute.type = "int";
		attribute.value = null;
		if(attributeSymbol.containsKey(attribute.name)) {
			System.out.println("Warning: redeclaration of " + attribute.name + " at " + ctx.ID().getSymbol().getLine() + ":" + ctx.ID().getSymbol().getCharPositionInLine());
		}

		attributeSymbol.put(attribute.name, attribute);
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