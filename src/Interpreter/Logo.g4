grammar Logo;


input                    : (command)+;

command                  : procedureDeclare | whileRule | ifRule | repeat | variableDeclare | printCommand | turtleMoveCommand | turtleOtherCommand | procedureExecute;

expresion                : '(' expresion ')'                          #brackets
                         | expresion (STAR|SLASH) expresion           #operation
                         | expresion (PLUS|MINUS) expresion           #operation
                         | expresion MODULO expresion                 #modulo
                         | NUMBER                                     #number
                         | VARIABLE                                   #variableUse
                         ;

printExpresion           : STRING | expresion;

condition                : expresion EQUALS expresion                 #equalsCondition
                         | expresion GREATER_THAN expresion           #greaterThanCondition
                         | expresion SMALLER_THAN expresion           #smallerThanCondition
                         | expresion SMALLER_EQUAL expresion          #smallerEqualCondition
                         | expresion GREATER_EQUAL expresion          #greaterEqualCondition
                         ;

variableDeclare          : MAKE STRING expresion;

repeat                   : REPREAT expresion OPEN_BRACKET input CLOSE_BRACKET;

whileRule                : WHILE OPEN_BRACKET condition CLOSE_BRACKET OPEN_BRACKET input CLOSE_BRACKET;

ifRule                   : IF condition OPEN_BRACKET input CLOSE_BRACKET;

printCommand             : PRINT (printExpresion)+;

turtleMoveCommand        : (FORWARD | BACK | RIGHT | LEFT) expresion;

turtleOtherCommand       : (PENUP | PENDOWN);

procedureDeclare         : TO PROCEDURE_NAME (VARIABLE)* ?(input) END;

procedureExecute         : PROCEDURE_NAME (expresion)*;


EQUALS            : '=';
GREATER_THAN      : '>';
GREATER_EQUAL     : '>=';
SMALLER_THAN      : '<';
SMALLER_EQUAL     : '<=';

PLUS              : '+';
MINUS             : '-';
STAR              : '*';
SLASH             : '/';
MODULO            : '%';

OPEN_BRACKET      : '[';
CLOSE_BRACKET     : ']';

TO                : ('TO' | 'to');
END               : ('END' | 'end');

MAKE              : ('MAKE' | 'make');
IF                : ('IF' | 'if');
WHILE             : ('WHILE' | 'while');
REPREAT           : ('REPEAT' | 'repeat');

PENUP             : ('PENUP' | 'penup' | 'pu');
PENDOWN           : ('PENDOWN' | 'pendown' | 'pd');

FORWARD           : ('FORWARD' | 'forward' | 'fd');
BACK              : ('BACK' | 'back' | 'bk');
RIGHT             : ('RIGHT' | 'right' | 'rt');
LEFT              : ('LEFT' | 'left' | 'lt');

PRINT             : ('PRINT' | 'print');

NUMBER            : [0-9]+;

fragment LETTER_WORD  : ([a-z] | [A-Z])+;

STRING            : '"' (LETTER_WORD | NUMBER | '_')+ ;

VARIABLE          : ':' (LETTER_WORD | NUMBER)+ ;

PROCEDURE_NAME    : LETTER_WORD;

WHITESPACE        : (' ' | '\t' | '\n' | '\r')+ -> skip;