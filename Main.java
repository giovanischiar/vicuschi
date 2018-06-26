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



		// String programName = args[0];
		// String code = ".class public " + programName + "\n.super java/lang/Object\n\n.method public static main([Ljava/lang/String;)V\n    .limit stack 100\n    .limit locals 100\n    getstatic java/lang/System/out Ljava/io/PrintStream;\n    ldc \"hello\"\n    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n    return\n.end method";
		String generatedCode = listener.getGeneratedCode();
		if(generatedCode.length() != 0) {
			System.out.println(generatedCode);
		}
		
	}
}
