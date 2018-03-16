import org.antlr.v4.runtime.Token; /* export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" */ 
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;

public class Main {

	public static void main(String[] args) {
		String program = "int luan = 5;\n" +
						  "string = \"peixe fora da agua\";\n" +
						  "if a>=3\n" +
						  "endif\n";
		CharStream stream = new ANTLRInputStream(program);
		VicuschiLexLexer lexer = new VicuschiLexLexer(stream);
		System.out.print("\n");

		Token t = lexer.nextToken();
		
		System.out.println("Posição\tTipo\tToken");
		while(t.getText() != "<EOF>") {
			System.out.printf("%d\t%d\t%s\n", t.getCharPositionInLine(), t.getType(), t.getText());
			t = lexer.nextToken();
		}

		System.out.println("Análise terminada!");
	}
}