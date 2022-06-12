parser grammar AffParser;

options { tokenVocab=AffLexer; }

entry: header
    statement*
    ;

header:
    headerLine* '-'
    ;

headerLine:
    IDENTIFIER ':' (INTEGER_LITERAL | FLOAT_LITERAL)
    ;

statement:
    tapStatement
    | holdStatement
    | arcStatement
    | sceneCtrlStatement
    | cameraStatement
    | timingStatement
    | timingGroupStatement
    ;

tapStatement:
    '(' time=INTEGER_LITERAL ',' track=INTEGER_LITERAL ')' ';'
    ;

holdStatement:
    'hold' '(' startTime=INTEGER_LITERAL ',' endTime=INTEGER_LITERAL ',' track=INTEGER_LITERAL ')' ';'
    ;

sceneCtrlStatement:
    'scenecontrol' '(' time=INTEGER_LITERAL ',' type=IDENTIFIER ',' FLOAT_LITERAL ',' INTEGER_LITERAL ')' ';'
    | 'scenecontrol' '(' time=INTEGER_LITERAL ',' type=IDENTIFIER ')' ';'
    ;

cameraStatement:
    'camera' '(' time=INTEGER_LITERAL ',' FLOAT_LITERAL ',' FLOAT_LITERAL ',' FLOAT_LITERAL ',' INTEGER_LITERAL ',' INTEGER_LITERAL ',' INTEGER_LITERAL ',' easing=IDENTIFIER ',' duration=INTEGER_LITERAL ')' ';'
    ;

timingStatement:
    'timing' '(' time=INTEGER_LITERAL ',' bpm=FLOAT_LITERAL ',' beats=FLOAT_LITERAL ')' ';'
    ;

timingGroupStatement:
    'timinggroup' '(' timingGroupModifiers ')' '{' statement* '}' ';'
    ;

timingGroupModifiers: IDENTIFIER? (',' IDENTIFIER)*
    ;

arcStatement:
    'arc' '(' startTime=INTEGER_LITERAL ',' endTime=INTEGER_LITERAL ',' startX=FLOAT_LITERAL
    ',' endX=FLOAT_LITERAL ',' easing=IDENTIFIER ',' startY=FLOAT_LITERAL ',' endY=FLOAT_LITERAL ','
    color=INTEGER_LITERAL ',' fx=IDENTIFIER ',' skyLineBool=BOOL_LITERAL ')' arcTapTail? ';'
    ;

arcTapTail:
    '[' arcTap (',' arcTap)* ']'
    ;

arcTap:
    'arctap' '(' time=INTEGER_LITERAL ')'
    ;