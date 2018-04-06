grammar VicuschiLex;

r : stmt;

//parser

stmt 
	: (simple_stmt ';')+;

simple_stmt 
	: declaration_attribution 
	| while_declaration 
	| for_declaration
	| if_declaration
	| generic_declaration
	| unary_expression;

unary_expression 
	: decrement
	| increment;

decrement
	: DECREMENT ID | ID DECREMENT;

increment
	: INCREMENT ID | ID INCREMENT;

if_declaration
	: IF logic_expr stmt ENDIF;

while_declaration 
	: WHILE logic_expr stmt ENDWHILE;

for_declaration
	: FOR ID? ':' INTERVAL stmt ENDFOR;

logic_expr 
	: logic_factor 
	| logic_expr ('&&' | '||') logic_factor;

logic_factor 
	: NUMBER logic_factor_1
	| ID logic_factor_1
	| '(' logic_expr ')' logic_factor_1
	| BOOL logic_factor_1
	| not_id logic_factor_1;

logic_factor_1
	: (comparator logic_factor logic_factor_1?)*;

not_id : '!' (ID | generic_array);

integer_declaration 
	: INT ID;

float_declaration 
	: FLOAT ID;

string_declaration 
	: STRING ID;

boolean_declaration 
	: BOOLEAN ID;

declaration_attribution 
	: generic_declaration ATTRIBUTION literal;

integer_array_declaration 
	: INT generic_array;

float_array_declaration 
	: FLOAT generic_array;

string_array_declaration 
	: STRING generic_array;

boolean_array_declaration 
	: 'boolean' generic_array;

generic_declaration 
	: integer_declaration 
	| float_declaration 
	| string_declaration
	| boolean_declaration 
	| generic_array_declaration;

generic_array : ID INDEX;

generic_array_declaration 
	: integer_array_declaration
  	| float_array_declaration
  	| string_array_declaration
  	| boolean_array_declaration;

generic_attribuition 
	: (ID | generic_array) ATTRIBUTION literal;

literal 
	: ARRAY 
	| BOOL 
	| NUMBER 
	| STRING;

comparator
 	: MAJOR
	| MINOR
	| EQUALS
	| MAJOR_EQUALS
	| MINOR_EQUALS
	| DIFFERENT;

//lex;

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

fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
fragment SYMBOL : '_' | '!' | '-' | '&' | '+' | '[' | ']' | '{' | '}' | '(' | ')' | '<' | '>' | '=' | '|' | '.' | ',' | ';' | ':' | '/' ;
ID : LETTER (DIGIT | LETTER)*;

S_COMMENTARY : '//' (NUMBER | LETTER | [ \t\r] | SYMBOL)* '\n' -> skip;
M_COMMENTARY : '/*' (NUMBER | LETTER | WS | SYMBOL)* '*/' -> skip;
WS : [ \t\r\n]+ -> skip;


