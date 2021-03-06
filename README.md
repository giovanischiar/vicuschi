# Vicuschi Compiler

## Developed by [JuanCuttle](https://github.com/JuanCuttle), [Giovani Schiar](https://github.com/giovanischiar) and [Luanes](https://github.com/Luanes)

ANTLR4 Java code analyser with Jasmin code generator for Vicuschi programming language.

Terminal commands for ANTLR4 usage:

	 export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"

	 alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
	 
	 alias grun='java org.antlr.v4.gui.TestRig'

Terminal commands for running our code:
	
	 When generating code from grammar:
		antlr4 VicuschiLex.g4 ;and javac *.java ;and java Main hello.vcs
	
	When not modifying grammar:
		javac *.java ;and java Main hello.vcs	
	
	For generating parse tree:
		grun Vicuschi program -gui hello.vcs

Terminal commands for code generation:

	If not yet compiled:
		javac *.java

	After compiling:
		bash vicuschi.sh file_name

In these examples, hello.vcs is the code file and file_name is the name of the .vcs file to be compiled (without extension. Ex.: lala.vcs would be $bash vicuschi.sh lala)
Text, code and documentation in English.
