.class public lala
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
	.limit stack 100
	.limit locals 100
getstatic java/lang/System/out Ljava/io/PrintStream;
 ldc "yes, vamos tirar 10.0/10!!!"
 invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

getstatic java/lang/System/out Ljava/io/PrintStream;
 ldc "isso mesmo, 10"
 invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V


return
.end method
