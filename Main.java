import org.antlr.v4.runtime.Token; /* export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" */ 
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.io.FileInputStream;
import java.lang.StringBuilder;

import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException, FileNotFoundException, UnsupportedEncodingException {
		// if(args.length == 0) {
		// 	System.out.println("Sem arquivo de entrada!");
		// 	return; 
		// }
		CharStream input = CharStreams.fromFileName(args[0]);
	    VicuschiLexer lexer = new VicuschiLexer(input);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    VicuschiParser parser = new VicuschiParser(tokens);
	    ParseTree programContext = parser.program();
	    ParseTreeWalker walker = new ParseTreeWalker();
	    ANTLRVicuschiListener listener = new ANTLRVicuschiListener();
	    String fileNameWithoutExtenstion = args[0].split("\\.")[0];
	    listener.setFileName(fileNameWithoutExtenstion);
	    walker.walk(listener, programContext);



		String generatedCode = listener.getGeneratedCode();
		
		if (generatedCode.length() > 0){
			PrintWriter writer = new PrintWriter(fileNameWithoutExtenstion+".j", "UTF-8");
			writer.println(generatedCode);
			writer.close();
		}
	}
}
