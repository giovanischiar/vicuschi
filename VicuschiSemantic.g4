grammar Vicuschi;

program : stmt;

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
	  { if(lookup(arith_expr_1.type) == lookup(term.type)) {
	        arith_expr.type = lookup(term.type) 
	  }}

arith_expr_1
	: (('+' | '-') arith_expr)?;
	{ arith_expr_1.type = lookup(arith_expr.type) }

term
	: factor term_a;
	  { if(lookup(term_a.type) == lookup(factor.type)) {
	        term.type = lookup(factor.type) 
	  }}

term_a
	: (('*' | '/') term)?;
	{ term_a.type = lookup(term.type) }

factor
	: r_arith factor_a;
	{ if(lookup(factor_a.type) == lookup(r_arith.type)) {
	  	factor.type = lookup(r_arith.type) 
	}}

factor_a
	: ('^' factor)?;
	{ factor_a.type = lookup(factor.type) }

r_arith
	: '(' arith_expr ')' 
	| arith_id 
	  { r_arith.type = lookup(arith_id.type) }
	| arith_number;
	  { r_arith.type = float }

arith_id
	: (UNARY_PLUS | UNARY_MINUS)? ID 
	  { lookup(ID) != null; lookup(ID.hasValue) == true };
	  { arith_id.type = lookup(ID.actualType) }

arith_number
	: (UNARY_PLUS | UNARY_MINUS)? NUMBER;


function_call 
	: ID '(' params? ')' { lookup(ID.nparams) != lookup(params.nparams); lookup(ID) != null }
						{ function_call.type = lookup(ID.actualType) }
	;


function_declaration
	: generic_unary_declaration '(' declaration_params? ')' WS? stmt ENDF
	{ generic_unary_declaration.nparams = lookup(declaration_params.nparams)}
	{ funtion_declaration.type = generic_unary_declaration.type }
	;


declaration_params
	: generic_declaration (',' WS? generic_declaration)*
	{ declaration_params.nparams = count(generic_declaration); }
	;

params
	: attributed (',' WS? attributed)*
	{ params.nparams = count(attributed); }
	;

attributed
	: literal 
	  { attributed.type = lookup(literal.type) }
	| unary_expression 
     	  { attributed.type = lookup(unary_expression.type) }
	| logic_expr 
	  { attributed.type = boolean }
	| function_call 
	  { attributed.type = lookup(function_call.type) }
	| arith_expr;
	  { attributed.type = lookup(arith_expr.type) }

attribution
	: ATTRIBUTION attributed;
	{ attribution.expectedType = lookup(attributed.type) }
	{ attribution.hasValue = true }

unary_expression 
	: decrement
	  { unary_expression.type = lookup(decrement.type) }
	| increment;
	  { unary_expression.type = lookup(increment.type) }

decrement
	: DECREMENT ID | ID DECREMENT;
	  { lookup(ID) != null }
	  { lookup(ID.hasValue) == true }
	  { decrement.type = lookup(ID.actualType) }

increment
	: INCREMENT ID | ID INCREMENT 
	  { lookup(ID) != null }
	  { lookup(ID.hasValue) == true }
	  { increment.type = lookup(ID.actualType) }

if_declaration
	: IF logic_expr stmt ENDIF;

while_declaration 
	: WHILE logic_expr stmt ENDWHILE;

for_declaration
	: FOR ID? ':' INTERVAL stmt ENDFOR {lookup(ID) != null}; // nao precisa, ele foi declarado aqui mesmo

logic_expr
	: logic_term logic_expr_1;
	{ logic_expr.type = "boolean" }

logic_expr_1
	: (LOGICAL_OR logic_expr)?;

logic_term
	: r_logic logic_term_a;

logic_term_a
	: (LOGICAL_AND logic_term)?;

r_logic
	: '(' logic_expr ')' 
	| '!' logic_expr
	| ID 
	  { lookup(ID.type) == boolean }
	| BOOL
	| ID INDEX //era generic_array
	  { lookup(ID.type) == boolean_array }
	| (ID | NUMBER) comparator (ID | NUMBER);
	  { lookup(ID[1]) != null; lookup(ID[2]) != null; }
	  { lookup(ID[1].hasValue) == true; lookup(ID[2].hasValue) == true }
	  { lookup(ID[1].actualType) == float | int | boolean}; lookup(ID[2].actualType) == float | int | boolean }

not_id : '!' (ID | generic_array);
		 { lookup(ID) != null } 
		 { lookup(ID.hasValue) == true }
		 { lookup(ID.actualType) == boolean}
		 { lookup(generic_array.actualType) == boolean }


declaration_attribution 
	: generic_declaration attribution;
	{ generic_declaration.hasValue = true }
	{ generic_declaration.actualType == lookup(attribution.expectedType) }


generic_declaration 
	: generic_unary_declaration
	{ generic_unary_declaration.nparams = lookup(generic_declaration.nparams)}
	{ generic_declaration.actualType = lookup(generic_unary_declaration.actualType) }
	| generic_array_declaration
	{ generic_array_declaration.nparams = lookup(generic_declaration.nparams)}
	{ generic_declaration.actualType = lookup(generic_array_declaration.actualType) }
	;

generic_unary_declaration
	: integer_declaration 
	{ integer_declaration.nparams = lookup(generic_unary_declaration.nparams)}
	{ generic_unary_declaration.actualType = integer }
	| float_declaration 
	{ float_declaration.nparams = lookup(generic_unary_declaration.nparams)}
	{ generic_unary_declaration.actualType = float }
	| string_declaration
	{ string_declaration.nparams = lookup(generic_unary_declaration.nparams)}
	{ generic_unary_declaration.actualType = string }
	| boolean_declaration 
	{ boolean_declaration.nparams = lookup(generic_unary_declaration.nparams)}
	{ generic_unary_declaration.actualType = boolean}
	;
	
integer_declaration 
	: INT ID
	{ ID.nparams = lookup(integer_declaration.nparams)}
	{lookup(ID) == null}
	{ ID.actualType = integer };

float_declaration 
	: FLOAT ID {lookup(ID) == null};
	  { ID.nparams = lookup(float_declaration.nparams)}
	  { ID.actualType = float }

string_declaration 
	: STRING ID {lookup(ID) == null}
				{ ID.nparams = lookup(string_declaration.nparams)}
				{ ID.actualType = string };

boolean_declaration 
	: BOOLEAN ID {lookup(ID) == null}
				{ ID.nparams = lookup(boolean_declaration.nparams)}
				{ ID.actualType = boolean };


generic_array_declaration 
	: integer_array_declaration
	{ generic_array_declaration.actualType = integer_array }
	{ integer_array_declaration.expectedType = integer_array }
  	| float_array_declaration
  	{ generic_array_declaration.actualType = float_array }
	{ float_array_declaration.expectedType = float_array }
  	| string_array_declaration
  	{ generic_array_declaration.actualType = string_array }
	{ string_array_declaration.expectedType = string_array }
  	| boolean_array_declaration
  	{ generic_array_declaration.actualType = boolean_array }
	{ boolean_array_declaration.expectedType = boolean_array };
	

integer_array_declaration 
	: INT generic_array {lookup(generic_array.declared) == null}
			    { generic_array.actualType = integer_array };

float_array_declaration 
	: FLOAT generic_array {lookup(generic_array.declared) == null}
				{ generic_array.actualType = float_array };

string_array_declaration 
	: STRING generic_array {lookup(generic_array.declared) == null}
				{ generic_array.actualType = string_array };

boolean_array_declaration 
	: BOOLEAN generic_array {lookup(generic_array.declared) == null}
				{ generic_array.actualType = boolean_array };
	
	
generic_array : ID INDEX;
				{ generic_array.declared = lookup(ID) }
				{ ID.hasValue = lookup(generic_array.hasValue) }
				{ ID.actualType = lookup(generic_array.actualType) } // ao declarar

				// remover?
				// verificar (uso) { if lookup(ID.actualType) != null generic_array.type = lookup(ID.actualType)}


generic_attribution 
	: attribution_array
	{ generic_attribution.hasValue = lookup(attribution_array.hasValue) }
	| attribuition_id;
	{ generic_attribution.hasValue = lookup(attribuition_id.hasValue) }
	
	
attribuition_id
	: ID attribution {lookup(ID) != null };
	  { ID.hasValue = true }
	  { lookup(ID.actualType) == lookup(attribution.expectedType) }

attribuition_array
	: generic_array attribution 
	  { lookup(generic_array.declared) != null;
	    generic_array.hasValue = true 
	    lookup(generic_array.actualType) == lookup(attribution.expectedType)
	    		// tirar? attribuition_array.expectedType = lookup(generic_array.type)
	    };



literal 
	: ARRAY // completar
	| BOOL 
	{ literal.type = boolean }
	| NUMBER 
	{ literal.type = float }
	| WORD
	{ literal.type = string };

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


