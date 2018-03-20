grammar VicuschiLex;

r : IF NUMBER BOOLEAN;

<<<<<<< HEAD

=======
>>>>>>> 3336c29dc7c50ef6c49cbcfb7f2a54f8012850bf
//reserved words
IF : 'if';
ENDIF : 'endif';
FOR : 'for';
ENDFOR : 'endfor';
CASE : 'case';
WHEN : 'when';
WHILE : 'while';
ENDWHILE : 'endwhile';
ENDCASE : 'endcase';
CONTINUE : 'continue';
ENDF : 'endf';
RETURN : 'return';

//primitive types
INT : 'int';
FLOAT : 'float';
STRING : 'string';
BOOLEAN : 'boolean';

//operators
NOT_ID : '!' ID;
MAJOR : '>';
MINOR : '<';
EQUALS : '==';
MAJOR_EQUALS : '>=';
MINOR_EQUALS : '<=';
DIFFERENT : '!=';
ATTRIBUTION : '=';
INCREMENT : '++';
DECREMENT : '--';

<<<<<<< HEAD
LOGICAL_AND : '&&';
LOGICAL_OR : '|';

SEMICOLON : ';';



=======
SEMICOLON : ';';
>>>>>>> 3336c29dc7c50ef6c49cbcfb7f2a54f8012850bf
INDEX : '[' ID ']' | '[' DIGIT+ ']';
EACH : ':'; 

//literals
BOOL : 'yes' | 'no';
NUMBER : ('+' | '-')? NUMBERTYPE;
fragment NUMBERTYPE : '.' (DIGIT)+ | (DIGIT)+ '.' (DIGIT)* | DIGIT+;
WORD: '"' (NUMBER | LETTER | WS | SYMBOL)* '"';
ARRAY: '{' VAR (',' WS? VAR)* '}';
INTERVAL : INCLUSIVE_TERMINAL | NONINCLUSIVE_TERMINAL;
fragment INCLUSIVE_TERMINAL : '[' DIGIT+ ',' WS? DIGIT+ ']';
fragment NONINCLUSIVE_TERMINAL : '[' DIGIT+ ',' WS? DIGIT+ ')';
fragment VAR : BOOLEAN | NUMBER | ID;



fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
<<<<<<< HEAD
fragment SYMBOL : '_' | '!' | '-' | '&' | '+' | '[' | ']' | '{' | '}' | '(' | ')' | '<' | '>' | '=' | '|' | '.' | ',' | ';' | ':' | '/' ; 
ID : LETTER (DIGIT | LETTER)*;

S_COMMENTARY : '//' (NUMBER | LETTER | [ \t\r] | SYMBOL)* '\n' -> skip;
M_COMMENTARY : '/*' (NUMBER | LETTER | WS | SYMBOL)* '*/' -> skip;
WS : [ \t\r\n]+ -> skip;

=======
fragment SYMBOL : '_' | '!' | '-' | '&' | '+' | '[' | ']' | '{' | '}' | '(' | ')' | '<' | '>' | '\'' | '\'' | '=' | '|' | '.' | ',' | ';' | ':'; 
ID : LETTER (DIGIT | LETTER)*;
WS : [ \t\r\n]+ -> skip;
>>>>>>> 3336c29dc7c50ef6c49cbcfb7f2a54f8012850bf
