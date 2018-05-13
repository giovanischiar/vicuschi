 antlr4 VicuschiLex.g4 ;and javac *.java ;and java Main hello.vcs

 grun Vicuschi r -gui hello.vcs 

 export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"

 alias antlr4='java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
 
 alias grun='java org.antlr.v4.gui.TestRig'
