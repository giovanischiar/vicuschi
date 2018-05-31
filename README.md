# Vicuschi Compiler

## Developed by [JuanCuttle](https://github.com/JuanCuttle), [Giovani Schiar](https://github.com/giovanischiar) and [Luanes](https://github.com/Luanes)

ANTLR4 Java compiler for Vicuschi programming language.


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
		grun Vicuschi r -gui hello.vcs


In these examples, hello.vcs is the code file
Text, code and documentation in English.
