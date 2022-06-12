lexer grammar AffLexer;

ARC:                'arc';
ARCTAP:             'arctap';
HOLD:               'hold';
SCENE_CTRL:         'scenecontrol';
CAMERA:             'camera';
TIMING:             'timing';
TIMING_GROUP:       'timinggroup';

BOOL_LITERAL: 'true' | 'false'
             ;

IDENTIFIER:         Letter LetterOrDigit*;

LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
COMMA:              ',';
SEMICOLON:          ';';
MINUS:              '-';
COLON:              ':';

INTEGER_LITERAL: '-'? Digits
             ;

FLOAT_LITERAL:  '-'? (Digits '.' Digits?)
             ;

WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);

fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;
fragment LetterOrDigit
    : Letter
    | [0-9]
    ;
fragment Letter
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;