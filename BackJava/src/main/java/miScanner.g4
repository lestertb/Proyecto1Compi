lexer grammar miScanner;

//symbols
PyComa: ';';
COMA: ',';
UNDERSC: '_';
POINT: '.';
COMIDOBLES: '"';

//assigns
ASSIGN: '=';
VIR: '~';
DOSPUN: ':';

//parenthesis
PIZQ: '(';
PDER: ')';
LLAIZQ: '{';
LLADER: '}';
PCIZQ: '[';
PCDER: ']';


//operators
ROPERATOR: '<' |'>' | '==' | '!=' | '<='| '>=';
STYPE : 'boolean' | 'char' | 'int' | 'string';
BTYPE : 'true' | 'false';
AOP: '+' | '-' | 'or';
MOP: '*' | '/' | 'and';
UNARY: '+' | '!' | '-' ;


//reserved words
IF: 'if';
ELSE: 'else';
WHILE: 'while';
LET: 'let';
THEN: 'then';
RETURN: 'return';
CLASS: 'class';
PRINT: 'print';
NEW: 'new';
LENGTH: 'lenght';

ID: UNDERSC | LETTER (UNDERSC | LETTER | DIGIT)*;

PRINTABLE : DIGIT | LETTER |  '#' | '$' | '%' | '&'
                    | '\'' | '?' | '@'  | '^' | '`'
                    |'|'| '\\';

INTLITERAL: DIGIT (DIGIT)*;
REALLITERAL      : DIGIT (DIGIT)* POINT (DIGIT)*
                   | POINT DIGIT (DIGIT)*;
STRINGLITERAL    : COMIDOBLES (PRINTABLE)* COMIDOBLES;
BOOLLITERAL      : BTYPE;

//fragments
fragment DIGIT : '0'..'9';
fragment LETTER: 'a'..'z' | 'A'..'Z';

WS :  (' ' | '\t' | '\n' | '\r' | '\f') -> skip;

