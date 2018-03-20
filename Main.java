import org.antlr.v4.runtime.Token; /* export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" */ 
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		CharStream stream = new ANTLRInputStream(readFile(args[0]));
		VicuschiLexLexer lexer = new VicuschiLexLexer(stream);
		System.out.print("\n");

		Token t = lexer.nextToken();
		
		System.out.println("Posição\tTipo\tToken");
		while(t.getText() != "<EOF>") {
			System.out.printf("%d:%d\t%s\t%s\n", t.getLine(), t.getCharPositionInLine(), lexer.getTokenNames()[t.getType()], t.getText());
			t = lexer.nextToken();
		}

		System.out.println("Análise terminada!");
	}

	public static String readFile(String fileName) {
		String everything = "";
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(fileName));
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		    br.close();
		} catch(FileNotFoundException fe) {
			fe.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return everything;
	}
}
