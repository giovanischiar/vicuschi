grammar VicuschiLex;

//lex;

LITERAL : ARRAY | BOOLEAN | NUMBER | STRING;

//reserved words;
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

//primitive types;
INT : 'int';
FLOAT : 'float';
STRING : 'string';
BOOLEAN : 'boolean';

//operators;
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

LOGICAL_AND : '&&';
LOGICAL_OR : '|';

SEMICOLON : ';';


INDEX : '[' ID ']' | '[' DIGIT+ ']';
EACH : ':';

//literals;
BOOL : 'yes' | 'no';
NUMBER : ('+' | '-')? NUMBERTYPE;
fragment NUMBERTYPE : '.' (DIGIT)+ | (DIGIT)+ '.' (DIGIT)* | DIGIT+;
WORD: '"' (NUMBER | LETTER | WS | SYMBOL)* '"';
ARRAY: '{' VAR (',' WS? VAR)* '}';
INTERVAL : INCLUSIVE_TERMINAL | NONINCLUSIVE_TERMINAL;
fragment INCLUSIVE_TERMINAL : '[' DIGIT+ ',' WS? DIGIT+ ']';
fragment NONINCLUSIVE_TERMINAL : '[' DIGIT+ ',' WS? DIGIT+ ')';
fragment VAR : BOOLEAN | NUMBER | ID;

INTEGER_DECLARATION : INT ID;
FLOAT_DECLARATION : FLOAT ID;
STRING_DECLARATION : STRING ID;
BOOLEAN_DECLARATION : BOOLEAN ID;

INTEGER_ARRAY_DECLARATION :  INT GENERIC_ARRAY_DECLARATION;
FLOAT_ARRAY_DECLARATION :  FLOAT GENERIC_ARRAY_DECLARATION;
STRING_ARRAY_DECLARATION : STRING GENERIC_ARRAY_DECLARATION;
BOOLEAN_ARRAY_DECLARATION : BOOLEAN GENERIC_ARRAY_DECLARATION;

GENERIC_DECLARATION : INTEGER_DECLARATION| FLOAT_DECLARATION | STRING_DECLARATION|BOOLEAN_DECLARATION |
INTEGER_ARRAY_DECLARATION|FLOAT_ARRAY_DECLARATION|
STRING_ARRAY_DECLARATION|BOOLEAN_ARRAY_DECLARATION;

GENERIC_ARRAY_DECLARATION : ID '[' ']';

DECLARATION_ATTRIBUITION : GENERIC_DECLARATION '=' LITERAL;
ATTRIBUITION : ID '=' LITERAL;

fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
fragment SYMBOL : '_' | '!' | '-' | '&' | '+' | '[' | ']' | '{' | '}' | '(' | ')' | '<' | '>' | '=' | '|' | '.' | ',' | ';' | ':' | '/' ;
ID : LETTER (DIGIT | LETTER)*;

S_COMMENTARY : '//' (NUMBER | LETTER | [ \t\r] | SYMBOL)* '\n' -> skip;
M_COMMENTARY : '/*' (NUMBER | LETTER | WS | SYMBOL)* '*/' -> skip;
WS : [ \t\r\n]+ -> skip;

r : stmt;

stmt : (simple_stmt ';')+;
simple_stmt : while_declaration | DECLARATION_ATTRIBUITION;
while_declaration : WHILE logic_expr stmt ENDWHILE;

logic_expr : logic_factor | logic_expr ('&&' | '||') logic_factor;
logic_factor : NUMBER | ID | '(' logic_expr ')';


