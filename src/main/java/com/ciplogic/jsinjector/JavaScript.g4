grammar JavaScript;


@lexer::members {
    public static final int WHITESPACE = 1;
    public static final int COMMENTS = 2;
}

program : expression*;

expression : function | 
             block |
             comment |
             randomJunk |
             string |
             regexp;

function : anonymousFunction |
           assignedFunction |
           objectFunction |
           namedFunction;

assignedFunction : identifier '=' unnamedFunction;

objectFunction : (string|identifier) ':' unnamedFunction;

anonymousFunction : unnamedFunction;

unnamedFunction : unnamedContextFunction | unnamedSimpleFunction;

unnamedContextFunction : '(' 'function' '(' functionParams? ')' block ')' invocationExpressions;

invocationExpressions : '(' expressions ')';

expressions : expression*;

unnamedSimpleFunction : 'function' '(' functionParams? ')' block;

namedFunction : 'function' identifier '(' functionParams? ')' block;

functionParams : functionParameter (',' functionParameter)*;

functionParameter : WORD;

block : '{' expression* '}';

comment : LINE_COMMENT | MULTILINE_COMMENT;

identifier : WORD;

regexp : REGEXP;

randomJunk : WORD | SYMBOL | COMMA | EQ | COLON | LP | RP;

string : SINGLE_QUOTE_STRING | DOUBLE_QUOTE_STRING;

DOUBLE_QUOTE_STRING : '"' (ESC|.)*? '"';
SINGLE_QUOTE_STRING : '\'' (ESC|.)*? '\'';

ESC : '\\\'' | '\\"';

LINE_COMMENT : '//' .*? '\n' -> channel(COMMENTS);

MULTILINE_COMMENT : '/*' .*? '*/' -> channel(COMMENTS);

REGEXP : '/' (REGEXP_ESC|~'\n')+? '/';

REGEXP_ESC : '\\/';

FUNCTION : 'function';

WORD : (LETTER|DIGIT)+;

LETTER : [a-zA-Z_$];

DIGIT : [0-9];

START_BLOCK : '{';

END_BLOCK : '}';

COMMA : ',';

LP : '(';

RP : ')';

EQ : '=';

COLON : ':';

WS : [ \r\n\t]+ -> channel(WHITESPACE);

SYMBOL : .;
