

grammar asiql;

root: expr EOF
    ;

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
    ID function = IS const                                      # functionExpression
    | ID function = (SINCE|UNTIL) DATE                          # functionExpression
    | ID function = (GREATER_THAN | LOWER_THAN) (INT | DECIMAL) # functionExpression
    | '(' expr ')'                                              # parenthesisExpression
    | NOT expr                                                  # negationExpression
    | left = expr conjunction = (AND | OR) right = expr         # infixExpression
    ;

AND: 'and'
    ;

OR: 'or'
    ;

IS: 'is'
    ;

NOT: 'not'
    ;

SINCE: 'since'
    ;

UNTIL: 'until'
    ;

EQUALS: '='
    ;

GREATER_THAN: '>'
    ;

LOWER_THAN: '<'
    ;

COMMA: ','
    ;

QUOTE: '"'
    ;

LBRACKET: '['
    ;

RBRACKET: ']'
    ;

ID: [a-zA-Z_][a-zA-Z_0-9]*
    ;

INT: [0-9]+
    ;

DATE: INT INT '/' INT INT '/' INT INT INT INT
    ;

DECIMAL: INT+ '.' INT+
    ;

STR: QUOTE [a-z-A-Z]+ QUOTE
    ;

WS: [ \t\n\r\f]+ -> skip
    ;