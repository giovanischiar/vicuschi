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
	| unary_expression
	| generic_attribution
	| function_declaration
	| function_call
	| import_declaration;

import_declaration
	: IMPORT WORD;

arith_expr
	: term arith_expr_1;

arith_expr_1
	: (('+' | '-') arith_expr)?;

term
	: factor term_a;

term_a
	: (('*' | '/') term)?;

factor
	: r_arith factor_a;

factor_a
	: ('^' factor)?;

r_arith
	: '(' arith_expr ')' 
	| arith_id 
	| arith_number;

arith_id
	: (UNARY_PLUS | UNARY_MINUS)? ID;

arith_number
	: (UNARY_PLUS | UNARY_MINUS)? NUMBER;


function_call
	: ID '(' params? ')';

function_declaration
	: generic_declaration '(' declaration_params? ')' WS? stmt ENDF;

declaration_params
	: generic_declaration (',' WS? generic_declaration)*;

params
	: attributed (',' WS? attributed)*;

attributed
	: (literal | unary_expression | logic_expr | function_call | arith_expr);

attribution
	: ATTRIBUTION attributed;

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
	: logic_term logic_expr_1;

logic_expr_1
	: (LOGICAL_OR logic_expr)?;

logic_term
	: r_logic logic_term_a;

logic_term_a
	: (LOGICAL_AND logic_term)?;

r_logic
	: '(' logic_expr ')' 
	| '!' logic_expr
	| arith_id 
	| arith_number
	| BOOL
	| not_id
	| (ID | NUMBER) comparator (ID | NUMBER);

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
	: generic_declaration attribution;

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

generic_attribution 
	: (ID | generic_array) attribution;

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
IMPORT : 'import';

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
THEN : '->';

UNARY_PLUS: '+';
UNARY_MINUS: '-';

LOGICAL_AND : '&';
LOGICAL_OR : '|';

SEMICOLON : ';';

INDEX : '[' ID ']' | '[' DIGIT+ ']' | '[]';
EACH : ':';

//literals;
BOOL : 'yes' | 'no';
NUMBER : NUMBERTYPE;
fragment NUMBERTYPE : '.' (DIGIT)+ | (DIGIT)+ '.' (DIGIT)* | DIGIT+;
WORD: '"' (NUMBER | LETTER | WS | SYMBOL)* '"';
ARRAY: '{' VAR (',' WS? VAR)* '}';
INTERVAL : INCLUSIVE_TERMINAL | NONINCLUSIVE_TERMINAL;
fragment INCLUSIVE_TERMINAL : '[' DIGIT+ ',' WS? DIGIT+ ']';
fragment NONINCLUSIVE_TERMINAL : '[' DIGIT+ ',' WS? DIGIT+ ')';
fragment VAR : BOOLEAN | NUMBER | ID;

fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];
fragment SYMBOL : '_' | '!' | '-' | '&' | '+' | '[' | ']' | '{' | '}' | '(' | ')' | '<' | '>' | '=' | '|' | '.' | ',' | ';' | ':' | '/' | 'ˆ' | '*';
ID : LETTER (DIGIT | LETTER)*;

// S_COMMENTARY : '//' (NUMBER | LETTER | [ \t\r] | SYMBOL)* '\n' -> skip;
S_COMMENTARY
	:'//' ~[\r\n]*
	 -> skip;

// M_COMMENTARY : '/*' (NUMBER | LETTER | WS | SYMBOL)* '*/' -> skip;
M_COMMENTARY
    :   '/*' .*? '*/'
        -> skip;

WS : [ \t\r\n]+ -> skip;


