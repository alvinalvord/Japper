parser grammar JapperParser;

options { tokenVocab = JapperLexer; }

compilationUnit: packageDeclaration? importDeclaration* typeDeclaration* EOF;

packageDeclaration: Package variableOrMemberName ';' ;

importDeclaration: Import Static? variableOrMemberName ('.*')? ';' ;

typeDeclaration:
	accessModifiers*
		(classDeclaration | enumDeclaration | interfaceDeclaration)
	| ';' ;

classModifier:
	accessModifiers
	| Native
	| Synchronized
	| Transient
	| Volatile;

accessModifiers:
	Private
	| Protected
	| Public
	| Static
	| Abstract
	| Final
	| Strictfp;

variableModifier: Final;

classDeclaration:
	Class VariableName genericTypes?
	(Extends dataType)?
	(Implements dataTypeList)?
	classBody;

genericTypes: '<' genericType (',' genericType)* '>' ;

genericType: VariableName (Extends typeBound)? ;

typeBound: dataType ('&' dataType)* ;

enumDeclaration: Enum VariableName (Implements dataTypeList)? '{' enumConstants? ','? enumBodyDeclarations? '}' ;

enumConstants: enumConstant (',' enumConstant)* ;

enumConstant: VariableName arguments? classBody? ;

enumBodyDeclarations: ';' classBodyDeclaration* ;

interfaceDeclaration: Interface VariableName genericTypes? (Extends dataTypeList)? interfaceBody ;

classBody: '{' classBodyDeclaration* '}' ;

interfaceBody: '{' interfaceBodyDeclaration* '}' ;

classBodyDeclaration: ';'
	| Static? block
	| classModifier* memberDeclaration;

memberDeclaration:
	functionDeclaration
	| genericFunctionDeclaration
	| fieldDeclaration
	| constructorDeclaration
	| genericConstructorDeclaration
	| interfaceDeclaration
	| classDeclaration
	| enumDeclaration;

functionDeclaration:
	returnTypes
	VariableName functionParameters ('[' ']')*
	(Throws VariableName)?
	functionBody;

functionBody: block | ';' ;

returnTypes: dataType | Void;

genericFunctionDeclaration: genericTypes functionDeclaration;

genericConstructorDeclaration: genericTypes constructorDeclaration;

constructorDeclaration:
	VariableName functionParameters
	(Throws variableOrMemberNameList)?
	constructorBody = block;

fieldDeclaration: variableModifier? dataType variableDeclarators ';' ;

interfaceBodyDeclaration: classModifier* interfaceMemberDeclaration | ';' ;

interfaceMemberDeclaration:
	constDeclaration
	| interfaceFunctionDeclaration
	| genericInterfaceFunctionDeclaration
	| interfaceDeclaration
	| classDeclaration
	| enumDeclaration;

constDeclaration: dataType constantDeclarator (',' constantDeclarator)* ';' ;

constantDeclarator: VariableName ('[' ']')* Gets variableInitializer;

interfaceFunctionDeclaration:
	interfaceFunctionModifier* (returnTypes | genericTypes returnTypes)
	VariableName functionParameters ('[' ']')*
	(Throws variableOrMemberNameList)? functionBody;

interfaceFunctionModifier:
	Public
	| Abstract
	| Default
	| Static
	| Strictfp;

genericInterfaceFunctionDeclaration: genericTypes interfaceFunctionDeclaration;

variableDeclarators: variableDeclarator (',' variableDeclarator)*;

variableDeclarator: variableDeclaratorId (Gets variableInitializer)? ;

variableDeclaratorId: VariableName ('[' ']')* ;

variableInitializer: arrayInit | expression;

arrayInit: '{'
	(variableInitializer (',' variableInitializer)* (',')? )?
	'}' ;

classOrInterfaceType: VariableName typeArguments? ('.' VariableName typeArguments?)* ;

typeArgument: dataType
	| '?' ((Extends | Super) dataType)? ;

variableOrMemberNameList:
	variableOrMemberName (',' variableOrMemberName)*;

functionParameters: '(' functionParameterList? ')' ;

functionParameterList:
	functionParameter
		(',' functionParameter)* (',' lastFunctionParameter)?
	| lastFunctionParameter;

functionParameter: variableModifier* dataType variableDeclaratorId;

lastFunctionParameter: variableModifier* dataType '...' variableDeclaratorId;

variableOrMemberName: VariableName ('.' VariableName)* ;

literal:
	integerLiteral
	| floatLiteral
	| CharVal
	| StringVal
	| BoolVal
	| NullVal;

integerLiteral:
	BinVal
	| QuatVal
	| OctVal
	| DecVal
	| HexVal;

floatLiteral:
	FloatingVal
	| FloatingHexVal;

elementValue: expression
	| elementValueArrayInit;

elementValueArrayInit: '{' (elementValue (',' elementValue)*)? (',')? '}' ;

defaultValue: Default elementValue;

block: '{' blockStatement* '}';

blockStatement:
	localVariableDeclaration ';'
	| statement
	| localTypeDeclaration;

localVariableDeclaration: variableModifier* dataType variableDeclarators;

localTypeDeclaration:
	accessModifiers* (classDeclaration | interfaceDeclaration)
	| ';' ;

statement:
	blockLabel=block
	| Assert expression (':' expression)? ';'
	| If parenthesisExpression statement (Else statement)?
	| For '(' forControl ')' statement
	| While parenthesisExpression statement
	| Do statement While parenthesisExpression ';'
	| Loop parenthesisExpression statement
	| Loop statement Until parenthesisExpression
	| Loop '(' forControl ')' statement
	| Try block (catchBlock+ finallyBlock? | finallyBlock)
	| Switch parenthesisExpression '{' switchBlockStatementGroup* switchLabel* '}'
	| Synchronized parenthesisExpression block
	| Return expression? ';'
	| Throw expression ';'
	| Break VariableName? ';'
	| Continue VariableName? ';'
	| ';'
	| statementExpression=expression ';'
	| identifierLabel = VariableName ':' statement;

catchBlock: Catch '(' variableModifier* catchType VariableName ')' block;

catchType: variableOrMemberName ('|' variableOrMemberName)*;

finallyBlock: Finally block;

switchBlockStatementGroup: switchLabel+ blockStatement+;

switchLabel:
	Case
		(constantExpression = expression
		| enumConstantName = VariableName) ':'
	| Default ':';

forControl: forEach
	| forInit? ';' expression? ';' forUpdate=expressionList?;

forInit: localVariableDeclaration | expressionList;

forEach:
	variableModifier* dataType variableDeclaratorId (':' | In) expression;

parenthesisExpression: '(' expression ')';

expressionList: expression (',' expression)*;

functionCall:
    VariableName '(' expressionList? ')'    #variableFunctionCall
	| This '(' expressionList? ')'                #thisFunctionCall
	| Super '(' expressionList? ')'             #superFunctionCall
	| Println '(' expression ')'                    #printFunctionCall
	| Readln '(' ')'                                      #readFunctionCall
	;

expression:
	primary
	| expression bop='.'
		( VariableName
		| functionCall
		| This
		| New nonWildcardTypeArguments? innerCreator
		| Super superSuffix
		| explicitGenericInvocation
		)
	| expression '[' expression ']'
	| functionCall
	| New creator
	| '(' dataType ')' expression
	| expression postfix=(Increment | Decrement)
	| prefix =
		(Increment
		| Decrement
		| Plus
		| Minus
		| Negation
		| BitwiseNot) expression
	| expression bop=(Times | Divide | Modulo) expression
	| expression bop=(Plus | Minus) expression
	| expression (ShiftLeftLogical | ShiftRightLogical | ShiftRightArithmetic) expression
	| expression bop=(Less | LessEqual | Greater | GreaterEqual) expression
	| expression bop=Instanceof dataType
	| expression bop=(Equal | NotEqual) expression
	| expression bop=BitwiseAnd expression
	| expression bop=BitwiseXor expression
	| expression bop=BitwiseOr expression
	| expression bop=And expression
	| expression bop=Or expression
	| expression bop=Question expression Colon expression
	| expression If expression bop=Question expression
	| <assoc=right> expression bop=(
			Gets
			| PlusEqual
			| MinusEqual
			| TimesEqual
			| DivEqual
			| ModEqual
			| AndEqual
			| OrEqual
			| XorEqual
			| ShiftLeftLogicalEqual
			| ShiftRightLogicalEqual
			| ShiftRightArithmeticEqual
		) expression
	| lambdaExpression
	| expression DoubleColon typeArguments? VariableName
	| dataType DoubleColon (typeArguments? VariableName | New)
	| classType DoubleColon typeArguments? New;

lambdaExpression: lambdaParameters Arrow lambdaBody;

lambdaParameters: VariableName
	| '(' functionParameterList? ')'
	| '(' VariableName (',' VariableName)* ')' ;

lambdaBody: expression | block;

primary:
	 '(' expression ')'
	| This
	| Super
	| literal
	| VariableName
	| returnTypes Dot Class
	| nonWildcardTypeArguments (explicitGenericInvocationSuffix | This arguments);

classType: (classOrInterfaceType '.')? VariableName typeArguments?;

creator: nonWildcardTypeArguments createdName classCreatorRest
	| createdName (arrayCreatorRest | classCreatorRest);

createdName: VariableName typeArgumentsOrDiamond? ('.' VariableName typeArgumentsOrDiamond?)*
	| primitiveDataTypes;

innerCreator: VariableName
	nonWildcardTypeArgumentsOrDiamond? classCreatorRest;

arrayCreatorRest:
	'['
		(']'
			('[' ']')* arrayInit | expression ']'
			('[' expression ']')*
			('[' ']')*
		);

classCreatorRest: arguments classBody?;

explicitGenericInvocation:
	nonWildcardTypeArguments explicitGenericInvocationSuffix;

typeArgumentsOrDiamond: '<' '>'
    | typeArguments;

nonWildcardTypeArgumentsOrDiamond: '<' '>'
    | nonWildcardTypeArguments;

nonWildcardTypeArguments: '<' dataTypeList '>';

dataTypeList: dataType (',' dataType)*;

dataType: (classOrInterfaceType | primitiveDataTypes) ('[' ']')*;

primitiveDataTypes: Char
	| Boolean
	| Bit2
	| Byte
	| Short
	| Int
	| Long
	| Float
	| Double;

typeArguments: '<' typeArgument (',' typeArgument)* '>';

superSuffix: arguments
    | '.' VariableName arguments?;

explicitGenericInvocationSuffix: Super superSuffix
    | VariableName arguments;

arguments: '(' expressionList? ')';
