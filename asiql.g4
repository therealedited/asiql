


grammar asiql;

root: expr EOF;

identifier: ID;
const:
    INT                        # integerConstant
    | STR                      # stringConstant
    | DECIMAL                  # decimalConstant
    | DATE                     # dateConstant
    | INT (COMMA INT)+         # arrayIntegerConstant
    | STR (COMMA STR)+         # arrayStringConstant
    | DECIMAL (COMMA DECIMAL)+ # arrayDecimalConstant
;

expr:
    left = identifier function = (IS | SINCE | UNTIL | GREATER_THAN | LESS_THAN) right = const # functionExpression
    | '(' expr ')'                                                      # parenthesisExpression
    | NOT expr                                                          # negationExpression
    | left = expr conjunction = (AND | OR) right = expr                 # infixExpression
;

AND: 'and';

OR: 'or';

IS: 'is';

NOT: 'not';

SINCE: 'since';

UNTIL: 'until';

EQUALS: '=';

GREATER_THAN: '>';

LESS_THAN: '<';

COMMA: ',';

QUOTE: '"';

LBRACKET: '[';

RBRACKET: ']';

ID: [a-zA-Z_][a-zA-Z_0-9]*;

INT: ('-')? [0-9]+;

DATE: INT INT '/' INT INT '/' INT INT INT INT;

DECIMAL: INT+ '.' INT+;

STR: QUOTE [a-z-A-Z]+ QUOTE;

WS: [ \t\n\r\f]+ -> skip;