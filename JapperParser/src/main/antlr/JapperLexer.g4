lexer grammar JapperLexer;

// Keywords

// Keyword: Try | Catch | Finally | Throw | Throws | Char | Boolean | Bit2 | Byte | Short | Int | Long | Float | Double | Do | While | For | Loop | Until | If | Else | Switch | Case | Default | Assert | Continue | Goto | Return | Break | In | Private | Protected | Public | Const | Enum | Final | Static | Synchronized | Transient | Void | Volatile | Abstract | Class | Extends | Implements | Import | Instanceof | Interface | Native | New | Package | Strictfp | Super | This;

// error handling
Try: T R Y | Y E (E+) T;
Catch: C A T C H | O (O+) F;
Finally: F I N A L L Y | R E E (E+);
Throw: T H R O W | B R O (D I E)? ' '? E R R (O R)?;
Throws: T H R O W S | P W E D S ' '? M A G ' '? E R R (O R)?;

// data types
Char: C H A R;
Boolean: B O O L (E A N)? | I (N T)? '1';
Bit2: I (N T)? '2';
Byte: B Y T E | I (N T)? '8';
Short: S H O R T | I (N T)? '16';
Int: I (N T | (N T)? '32');
Long: L O N G | I (N T)? '64';
Float: F (L O A T | (L O A T)? '32');
Double: D O U B L E | F (L O A T)? '64';

// loops
Do: D O;
While: W H I L E;
For: F O R;
Loop: L O O P;
Until: U N T I L;

// conditions
If: I F | T H O N K I N G (I F)? | K U N G (I F)?;
Else: E L S E;
Switch: S W I T C H;
Case: C A S E;
Default: D E F A U L T;

// control
Assert: A S S E R T;
Continue: C O N T I N U E | G O ' '? O N;
Goto: G O T O;
Return: R E T U R N | B B+;
Break: B R E A K | Y A M E T E;
In: I N;
Println: P R I N T;
Readln: R E A D;

// access modifiers
Private: P R I V A T E | C E N S O R E D;
Protected: P R O T E C T E D | P R O T E C C+;
Public: P U B L? I C | U N C E N S O R E D;

//type modifiers
Const: C O N S T;
Enum: E N U M;
Final: F I N A L | L A S T ' '? N A;
Static: S T A T I C;
Synchronized: S Y N C H R O N I Z E D;
Transient: T R A N S I E N T;
Void: V O I D | W A L A;
Volatile: V O L A T I L E;

// object oriented
Abstract: A B S T R A C T | C O N C E P T | (G | B) F ' ' M O;
Class: C L A S S | S C H O O L;
Extends: E X T E N D S | P A R E N T | (M | P) A (M | P) A ' '? M O;
Implements: I M P L E M E N T S | A N C E S T O R | L O L (O | A) ' '? M O;
Import: I M P O R T | T A K E | Y U N G ' ' K W A N;
Instanceof: I N S T A N C E O F;
Interface: I N T E R F A C E;
Native: N A T I V E ;
New: N E W | B A G O | P I N A L I T A N;
Package: P A C K A G E | E W ' ' S H I P P I N G ' ' F E E;
Strictfp: S T R I C T F P;
Super: S U P E R | (M | P) A;
This: M Y | M E | M I N E; // this

// Literal Values

// LiteralValue: BinVal | QuatVal | OctVal | DecVal | HexVal | FloatingVal | FloatingHexVal | BoolVal | CharVal | StringVal | NullVal;

BinVal: '0' B Binary L?;
QuatVal: '0' Q Quaternary L?;
OctVal: '0' O Octal L?;
DecVal: ('0' | [1-9] (Decimal? | DigitSep+ Decimal)) L?;
HexVal: '0' X Hexadecimal L?;

FloatingVal:
	(Decimal '.' Decimal? | '.' Decimal) Exponent? (F | D)?
	| Decimal (Exponent (F | D)? | (F | D));

FloatingHexVal:
	'0' X (Hexadecimal '.'? | Hexadecimal? '.' Hexadecimal) P [+-]? Decimal (F | D)?;

BoolVal: True | False;

True: T R U E | Y E S;
False: F A L S E | N O;

CharVal: '\'' (~['\\\r\n] | EscapeCharacters) '\'';
StringVal: '"' (~["\\\r\n] | EscapeCharacters)* '"';

NullVal: N U L L | N O T H I N G | '0';

// Separators

// Separator: OpenPare | ClosePare | OpenSqBrack | CloseSqBrack | OpenCurlyBrack | CloseCurlyBrack | Semicolon | Comma | Dot;

OpenPare: '(';
ClosePare: ')';
OpenSqBrack: '[';
CloseSqBrack: ']';
OpenCurlyBrack: '{';
CloseCurlyBrack: '}';
Semicolon: ';';
Comma: ',';
Dot: '.';

// Operators

// Operator: Gets | PlusEqual | MinusEqual | TimesEqual | DivEqual | ModEqual | AndEqual | OrEqual | XorEqual | ShiftLeftLogicalEqual | ShiftRightLogicalEqual | ShiftRightArithmeticEqual | Negation | Increment | Decrement | Plus | Minus | Times | Divide | Modulo | Greater | GreaterEqual | Less | LessEqual | Equal | NotEqual | And | Or | BitwiseNot | BitwiseAnd | BitwiseOr | BitwiseXor | ShiftLeftLogical | ShiftRightLogical | ShiftRightArithmetic | Question | Colon | RightAngularBrack | LeftAngularBrack | Ampersand | Assign | Pipe | Star Arrow | DoubleColon | At | Ellipsis;

// Assignment Operators

Gets: Assign | '<-' | ' ' G E T S ' ';
PlusEqual: '+=' | P L U S ' '? E Q (U A L)?;
MinusEqual: '-=' | M I N U S ' '? E Q (U A L)?;
TimesEqual: '*=' | T I M E S ' '? E Q (U A L)?;
DivEqual: '/=' | D I V ' '? E Q (U A L)?;
ModEqual: '%=' | M O D ' '? E Q (U A L)?;
AndEqual: '&=' | A N D ' '? E Q (U A L)?;
OrEqual: '|=' | O R ' '? E Q (U A L)?;
XorEqual: '^=' | X O R ' '? E Q (U A L)?;
ShiftLeftLogicalEqual: '<<=' | S L L? ' '? E Q (U A L)?;
ShiftRightLogicalEqual: '>>=' | S R L? ' '? E Q (U A L)?;
ShiftRightArithmeticEqual: '>>>=' | S R A ' '? E Q (U A L)?;

// Unary Operators

Negation: '!' | N O T | W A K;
Increment: '++' | I N C;
Decrement: '--' | D E C;

// Arithmetic Operators

Plus: '+' | P L U S;
Minus: '-' | M I N U S;
Times: Star | T I M E S;
Divide: '/' | D I V;
Modulo: '%' | M O D;

// Logical Operators

Greater: LeftAngularBrack | G T;
GreaterEqual: '>=' | G E;
Less: RightAngularBrack | L T;
LessEqual: '<=' | L E;
Equal: '==' | E Q (U A L S?)?;
NotEqual: '!=' | N E;
And: '&&' | A N D;
Or: '||' | O R;

// Bitwise Operators

BitwiseNot: '~' | B N O T;
BitwiseAnd: Ampersand | B A N D;
BitwiseOr: Pipe | B O R;
BitwiseXor: '^' | B X O R;
ShiftLeftLogical: '<<' | S L L?;
ShiftRightLogical: '>>' | S R L?;
ShiftRightArithmetic: '>>>' | S R A;

// Ternary Operators

Question: '?';
Colon: ':';

// Dual meaning tokens
RightAngularBrack: '<';
LeftAngularBrack: '>';
Ampersand: '&';
Assign: '=';
Pipe: '|';
Star: '*';
DotStar: '.*';

// Extra Tokens
Arrow: '->';
DoubleColon: '::';
At: '@';
Ellipsis: '...';

// Whitespace and comments

Whitespace: [ \t\r\n\u000C]+ -> skip;
MultilineComment: '/*' .*? '*/' -> skip;
InlineComment: '//' ~[\r\n]* -> skip;

// Variable Names

VariableName: Alpha (AlphaNum)*;

// Fragments

fragment A: [Aa];
fragment B: [Bb];
fragment C: [Cc];
fragment D: [Dd];
fragment E: [Ee];
fragment F: [Ff];
fragment G: [Gg];
fragment H: [Hh];
fragment I: [Ii];
fragment J: [Jj];
fragment K: [Kk];
fragment L: [Ll];
fragment M: [Mm];
fragment N: [Nn];
fragment O: [Oo];
fragment P: [Pp];
fragment Q: [Qq];
fragment R: [Rr];
fragment S: [Ss];
fragment T: [Tt];
fragment U: [Uu];
fragment V: [Vv];
fragment W: [Ww];
fragment X: [Xx];
fragment Y: [Yy];
fragment Z: [Zz];

fragment Bin: [01];
fragment Quat: [0-3] | [ACGTacgt];
fragment Oct: [0-7];
fragment Dec: [0-9];
fragment Hex: [0-9a-fA-F];

fragment DigitSep: '_';

fragment Lowercase: [a-z];
fragment Uppercase: [A-Z];
fragment Unicode: 'u'+ Hex Hex Hex Hex;

fragment EscapeCharacters: '\\' ([btnfr"'\\] | Unicode);

fragment Alpha: Lowercase | Uppercase | DigitSep | '$';
fragment AlphaNum: Alpha | Dec;

fragment Binary: Bin ((Bin | DigitSep)* Bin)?;
fragment Quaternary: Quat ((Quat | DigitSep)* Quat)?;
fragment Octal: Oct ((Oct | DigitSep)* Oct)?;
fragment Decimal: Dec ((Dec|DigitSep)* Dec)?;
fragment Hexadecimal: Hex ((Hex | DigitSep)* Hex)?;

fragment Exponent: E [+-]? Decimal;
