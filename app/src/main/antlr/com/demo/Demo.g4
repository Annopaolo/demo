grammar Demo;

@header { package com.demo; }

block: '{' statement* '}';

statement:
	print ';'
	| ifthenelse
	| assignment
	| declaration
	| loop
	| spawn ';'
	| procedurecall ';';

print: 'print' exp;

ifthenelse:
	'if' '(' boolExp ')' then = block 'else' els = block;

assignment: variable '=' exp ';';

declaration: variable ':=' exp ';';

loop: 'while' '(' boolExp ')' block;

spawn: 'spawn' variable;

procedurecall: variable;

exp: arithmExp | boolExp;

arithmExp:
	'(' arithmExp ')'	# baseArithmeticExp
	| '-' arithmExp		# negArithmeticExp
	// why two rules with same name, but different ops?
	| left = arithmExp op = ('*' | '/') right = arithmExp	# binArithmeticExp
	| left = arithmExp op = ('+' | '-') right = arithmExp	# binArithmeticExp
	| variable												# varArithmeticExp
	| integer												# valArithmeticExp;

boolExp:
	'(' boolExp ')'													# baseBoolExp
	| 'NOT' boolExp													# negBoolExp
	| left = boolExp op = ('AND' | 'OR' | 'XOR') right = boolExp	# binBoolExp
	| left = arithmExp op = (
		'=='
		| '!='
		| '>'
		| '<'
		| '>='
		| '<='
	) right = arithmExp # arithmeticComparisonExp
	// why is this after arithmeticComparisonExp?
	| left = boolExp op = ('==' | '!=') right = boolExp	# boolComparisonExp
	| variable											# varBoolExp
	| bool												# valBoolExp;

variable: ID;
integer: NUMBER;
bool: TF;

/*
 * *** LEXER INPUT ***
 */

//IDs
fragment CHAR: 'a' ..'z' | 'A' ..'Z';
ID: CHAR (CHAR | DIGIT)*;

//Numbers
fragment DIGIT: '0' ..'9';
NUMBER: DIGIT+;

//Truth values (What happens if you declare a variable named "true"?)
TF: 'true' | 'false';

//ESCAPE SEQUENCES
WS: (' ' | '\t' | '\n' | '\r') -> skip;
LINECOMMENTS: '//' (~('\n' | '\r'))* -> skip;
BLOCKCOMMENTS:
	'/*' (~('/' | '*') | '/' ~'*' | '*' ~'/' | BLOCKCOMMENTS)* '*/' -> skip;