grammar obfuscation;

file: spaces function*;

function:
    type identifier
    openParen (type variable (comma type variable)*)? closeParen
    openCurlyBrace
    statements
    (returnStatement)?
    closeCurlyBrace
    ;

statements: statement*;

statement:
    type variable (comma variable)* semicolon
    | ifStatement
    | functionCall semicolon
    | (type)? variable eq expr semicolon
    ;

ifStatement:
    'if' spaces openParen expr closeParen openCurlyBrace statements closeCurlyBrace elseStatement?;

elseStatement: 'else' spaces openCurlyBrace statements closeCurlyBrace;

returnStatement: 'return' spaces expr semicolon;

expr:
    expr equals compare
    | expr notEquals compare
    | compare
    ;

compare:
    compare moreStrict addOrSub
    | compare moreOrEq addOrSub
    | compare lessStrict addOrSub
    | compare lessOrEq addOrSub
    | addOrSub
    ;

addOrSub:
    addOrSub plus term
    | addOrSub minus term
    | term
    ;
term:
    term mul subexpr
    | term div subexpr
    | subexpr
    ;
subexpr:
    openParen addOrSub closeParen
    | number
    | string
    | (reference)? functionCall
    | (reference)? variable
    ;
functionCall: identifier openParen (expr (comma expr)*)? closeParen;
identifier: IDENTIFIER spaces;
variable: identifier;
eq: EQ spaces;
equals: EQUALS spaces;
notEquals: NOT_EQUALS spaces;
semicolon: ';' spaces;
openParen: '(' spaces;
closeParen: ')' spaces;
openCurlyBrace: '{' spaces;
closeCurlyBrace: '}' spaces;
comma: ',' spaces;
plus: PLUS spaces;
minus: MINUS spaces;
mul: MUL spaces;
div: DIV spaces;
moreStrict: MORE_STRICT spaces;
moreOrEq: MORE_OR_EQ spaces;
lessStrict: LESS_STRICT spaces;
lessOrEq: LESS_OR_EQ spaces;
number: NUMBER spaces;
string: STRING spaces;
reference: '&' spaces;
type: TYPE;
spaces: SPACE*;

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];

EQ: '=';
EQUALS: '==';
NOT_EQUALS: '!=';
SEMICOLON: ';';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MORE_STRICT: '>';
MORE_OR_EQ: '>=';
LESS_STRICT: '<';
LESS_OR_EQ: '<=';

TYPE: ('int' | 'float' | 'double' | 'string' | 'void') SPACE+;

NUMBER: DIGIT+ ('.' DIGIT+)?;
STRING: '"' ~('\n' | '"')* '"';
IDENTIFIER: (LETTER | '_') (LETTER | DIGIT | '_')*;
SPACE: [\t\n ];
