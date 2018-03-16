grammar VicuschiLex;

r : IF NUMBER BOOLEAN;

//reserved words
IF : 'if';
ENDIF : 'endif';
FOR : 'for';
ENDFOR : 'endfor';
CASE : 'case';
WHEN : 'when';
ENDCASE : 'endcase';
CONTINUE : 'continue';
ENDF : 'endf';
RETURN : 'return';

//literals
BOOLEAN : 'yes'|'no';
NUMBER : ('+' | '-')? NUMBERTYPE;
fragment NUMBERTYPE : '.' (DIGIT)+ | (DIGIT)+ '.' (DIGIT)* | DIGIT+;
WORD: '"' (NUMBER | LETTER | WS | SYMBOL)* '"';

//operators
ATTRIBUTION : '=';
MAJOR_EQUALS : '>=';

SEMICOLON : ';';

//primitive types
INT : 'int';
FLOAT : 'float';
STRING : 'string';

fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
fragment SYMBOL : '_' | '!' | '-' | '&' | '+' | '[' | ']' | '{' | '}' | '(' | ')' | '<' | '>' | '\'' | '\'' | '=' | '|' | '.' | ',' | ';'; 
ID : LETTER (DIGIT | LETTER)*;
WS : [ \t\r\n]+ -> skip;