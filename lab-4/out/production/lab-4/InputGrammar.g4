grammar InputGrammar;

file: nonTerminalRule* terminalRule*;

nonTerminalRule:
    nonTerminal argument? returnsStatement? colon (statement ('|' statement)*) semicolon;

statement
    : (terminal | nonTerminalWithArg)* assignment?
    ;

returnsStatement: 'returns' argument;
nonTerminal: NAME;
nonTerminalWithArg: nonTerminal argument?;

terminalRule
    : currName=terminal colon parsedString=string toSkip=skipToken? semicolon
    | currName=terminal colon parsedRegex=regex toSkip=skipToken? semicolon
    ;
string: STRING;
argument: ARGUMENT;
assignment: ASSIGNMENT;
regex: ARGUMENT ('+' | '*' | '?')?;
terminal: TERMINAL_NAME;
colon: ':';
semicolon: ';';
skipToken: '-> skip';

NAME: [a-z] ([A-Z] | [a-z])*;
TERMINAL_NAME: [A-Z]+;

ASSIGNMENT: '{' ~('}')* '}';
ARGUMENT: '[' ~(']')* ']';
STRING: '\'' ~('\'')* '\'';

SPACE: [ \t\n] -> skip;
