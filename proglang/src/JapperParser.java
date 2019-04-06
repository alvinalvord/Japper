// Generated from C:/Users/user/Desktop/proglang\JapperParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JapperParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Try=1, Catch=2, Finally=3, Throw=4, Throws=5, Char=6, Boolean=7, Bit2=8, 
		Byte=9, Short=10, Int=11, Long=12, Float=13, Double=14, Do=15, While=16, 
		For=17, Loop=18, Until=19, If=20, Else=21, Switch=22, Case=23, Default=24, 
		Assert=25, Continue=26, Goto=27, Return=28, Break=29, In=30, Println=31, 
		Readln=32, Private=33, Protected=34, Public=35, Const=36, Enum=37, Final=38, 
		Static=39, Synchronized=40, Transient=41, Void=42, Volatile=43, Abstract=44, 
		Class=45, Extends=46, Implements=47, Import=48, Instanceof=49, Interface=50, 
		Native=51, New=52, Package=53, Strictfp=54, Super=55, This=56, BinVal=57, 
		QuatVal=58, OctVal=59, DecVal=60, HexVal=61, FloatingVal=62, FloatingHexVal=63, 
		BoolVal=64, True=65, False=66, CharVal=67, StringVal=68, NullVal=69, OpenPare=70, 
		ClosePare=71, OpenSqBrack=72, CloseSqBrack=73, OpenCurlyBrack=74, CloseCurlyBrack=75, 
		Semicolon=76, Comma=77, Dot=78, Gets=79, PlusEqual=80, MinusEqual=81, 
		TimesEqual=82, DivEqual=83, ModEqual=84, AndEqual=85, OrEqual=86, XorEqual=87, 
		ShiftLeftLogicalEqual=88, ShiftRightLogicalEqual=89, ShiftRightArithmeticEqual=90, 
		Negation=91, Increment=92, Decrement=93, Plus=94, Minus=95, Times=96, 
		Divide=97, Modulo=98, Greater=99, GreaterEqual=100, Less=101, LessEqual=102, 
		Equal=103, NotEqual=104, And=105, Or=106, BitwiseNot=107, BitwiseAnd=108, 
		BitwiseOr=109, BitwiseXor=110, ShiftLeftLogical=111, ShiftRightLogical=112, 
		ShiftRightArithmetic=113, Question=114, Colon=115, RightAngularBrack=116, 
		LeftAngularBrack=117, Ampersand=118, Assign=119, Pipe=120, Star=121, DotStar=122, 
		Arrow=123, DoubleColon=124, At=125, Ellipsis=126, Whitespace=127, MultilineComment=128, 
		InlineComment=129, VariableName=130;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_classModifier = 4, RULE_accessModifiers = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_genericTypes = 8, 
		RULE_genericType = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_classBody = 16, RULE_interfaceBody = 17, 
		RULE_classBodyDeclaration = 18, RULE_memberDeclaration = 19, RULE_functionDeclaration = 20, 
		RULE_functionBody = 21, RULE_returnTypes = 22, RULE_genericFunctionDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_constructorDeclaration = 25, 
		RULE_fieldDeclaration = 26, RULE_interfaceBodyDeclaration = 27, RULE_interfaceMemberDeclaration = 28, 
		RULE_constDeclaration = 29, RULE_constantDeclarator = 30, RULE_interfaceFunctionDeclaration = 31, 
		RULE_interfaceFunctionModifier = 32, RULE_genericInterfaceFunctionDeclaration = 33, 
		RULE_variableDeclarators = 34, RULE_variableDeclarator = 35, RULE_variableDeclaratorId = 36, 
		RULE_variableInitializer = 37, RULE_arrayInit = 38, RULE_classOrInterfaceType = 39, 
		RULE_typeArgument = 40, RULE_variableOrMemberNameList = 41, RULE_functionParameters = 42, 
		RULE_functionParameterList = 43, RULE_functionParameter = 44, RULE_lastFunctionParameter = 45, 
		RULE_variableOrMemberName = 46, RULE_literal = 47, RULE_integerLiteral = 48, 
		RULE_floatLiteral = 49, RULE_elementValue = 50, RULE_elementValueArrayInit = 51, 
		RULE_defaultValue = 52, RULE_block = 53, RULE_blockStatement = 54, RULE_localVariableDeclaration = 55, 
		RULE_localTypeDeclaration = 56, RULE_statement = 57, RULE_catchBlock = 58, 
		RULE_catchType = 59, RULE_finallyBlock = 60, RULE_switchBlockStatementGroup = 61, 
		RULE_switchLabel = 62, RULE_forControl = 63, RULE_forInit = 64, RULE_forEach = 65, 
		RULE_parenthesisExpression = 66, RULE_expressionList = 67, RULE_functionCall = 68, 
		RULE_expression = 69, RULE_lambdaExpression = 70, RULE_lambdaParameters = 71, 
		RULE_lambdaBody = 72, RULE_primary = 73, RULE_classType = 74, RULE_creator = 75, 
		RULE_createdName = 76, RULE_innerCreator = 77, RULE_arrayCreatorRest = 78, 
		RULE_classCreatorRest = 79, RULE_explicitGenericInvocation = 80, RULE_typeArgumentsOrDiamond = 81, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 82, RULE_nonWildcardTypeArguments = 83, 
		RULE_dataTypeList = 84, RULE_dataType = 85, RULE_primitiveDataTypes = 86, 
		RULE_typeArguments = 87, RULE_superSuffix = 88, RULE_explicitGenericInvocationSuffix = 89, 
		RULE_arguments = 90;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
			"classModifier", "accessModifiers", "variableModifier", "classDeclaration", 
			"genericTypes", "genericType", "typeBound", "enumDeclaration", "enumConstants", 
			"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "classBody", 
			"interfaceBody", "classBodyDeclaration", "memberDeclaration", "functionDeclaration", 
			"functionBody", "returnTypes", "genericFunctionDeclaration", "genericConstructorDeclaration", 
			"constructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
			"interfaceFunctionDeclaration", "interfaceFunctionModifier", "genericInterfaceFunctionDeclaration", 
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInit", "classOrInterfaceType", "typeArgument", 
			"variableOrMemberNameList", "functionParameters", "functionParameterList", 
			"functionParameter", "lastFunctionParameter", "variableOrMemberName", 
			"literal", "integerLiteral", "floatLiteral", "elementValue", "elementValueArrayInit", 
			"defaultValue", "block", "blockStatement", "localVariableDeclaration", 
			"localTypeDeclaration", "statement", "catchBlock", "catchType", "finallyBlock", 
			"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", 
			"forEach", "parenthesisExpression", "expressionList", "functionCall", 
			"expression", "lambdaExpression", "lambdaParameters", "lambdaBody", "primary", 
			"classType", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
			"classCreatorRest", "explicitGenericInvocation", "typeArgumentsOrDiamond", 
			"nonWildcardTypeArgumentsOrDiamond", "nonWildcardTypeArguments", "dataTypeList", 
			"dataType", "primitiveDataTypes", "typeArguments", "superSuffix", "explicitGenericInvocationSuffix", 
			"arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "';'", "','", "'.'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'?'", "':'", "'<'", "'>'", 
			"'&'", "'='", "'|'", "'*'", "'.*'", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Try", "Catch", "Finally", "Throw", "Throws", "Char", "Boolean", 
			"Bit2", "Byte", "Short", "Int", "Long", "Float", "Double", "Do", "While", 
			"For", "Loop", "Until", "If", "Else", "Switch", "Case", "Default", "Assert", 
			"Continue", "Goto", "Return", "Break", "In", "Println", "Readln", "Private", 
			"Protected", "Public", "Const", "Enum", "Final", "Static", "Synchronized", 
			"Transient", "Void", "Volatile", "Abstract", "Class", "Extends", "Implements", 
			"Import", "Instanceof", "Interface", "Native", "New", "Package", "Strictfp", 
			"Super", "This", "BinVal", "QuatVal", "OctVal", "DecVal", "HexVal", "FloatingVal", 
			"FloatingHexVal", "BoolVal", "True", "False", "CharVal", "StringVal", 
			"NullVal", "OpenPare", "ClosePare", "OpenSqBrack", "CloseSqBrack", "OpenCurlyBrack", 
			"CloseCurlyBrack", "Semicolon", "Comma", "Dot", "Gets", "PlusEqual", 
			"MinusEqual", "TimesEqual", "DivEqual", "ModEqual", "AndEqual", "OrEqual", 
			"XorEqual", "ShiftLeftLogicalEqual", "ShiftRightLogicalEqual", "ShiftRightArithmeticEqual", 
			"Negation", "Increment", "Decrement", "Plus", "Minus", "Times", "Divide", 
			"Modulo", "Greater", "GreaterEqual", "Less", "LessEqual", "Equal", "NotEqual", 
			"And", "Or", "BitwiseNot", "BitwiseAnd", "BitwiseOr", "BitwiseXor", "ShiftLeftLogical", 
			"ShiftRightLogical", "ShiftRightArithmetic", "Question", "Colon", "RightAngularBrack", 
			"LeftAngularBrack", "Ampersand", "Assign", "Pipe", "Star", "DotStar", 
			"Arrow", "DoubleColon", "At", "Ellipsis", "Whitespace", "MultilineComment", 
			"InlineComment", "VariableName"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JapperParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JapperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JapperParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Package) {
				{
				setState(182);
				packageDeclaration();
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(185);
				importDeclaration();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 33)) & ~0x3f) == 0 && ((1L << (_la - 33)) & ((1L << (Private - 33)) | (1L << (Protected - 33)) | (1L << (Public - 33)) | (1L << (Enum - 33)) | (1L << (Final - 33)) | (1L << (Static - 33)) | (1L << (Abstract - 33)) | (1L << (Class - 33)) | (1L << (Interface - 33)) | (1L << (Strictfp - 33)) | (1L << (Semicolon - 33)))) != 0)) {
				{
				{
				setState(191);
				typeDeclaration();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode Package() { return getToken(JapperParser.Package, 0); }
		public VariableOrMemberNameContext variableOrMemberName() {
			return getRuleContext(VariableOrMemberNameContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(Package);
			setState(200);
			variableOrMemberName();
			setState(201);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(JapperParser.Import, 0); }
		public VariableOrMemberNameContext variableOrMemberName() {
			return getRuleContext(VariableOrMemberNameContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public TerminalNode Static() { return getToken(JapperParser.Static, 0); }
		public TerminalNode DotStar() { return getToken(JapperParser.DotStar, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(Import);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(204);
				match(Static);
				}
			}

			setState(207);
			variableOrMemberName();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DotStar) {
				{
				setState(208);
				match(DotStar);
				}
			}

			setState(211);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<AccessModifiersContext> accessModifiers() {
			return getRuleContexts(AccessModifiersContext.class);
		}
		public AccessModifiersContext accessModifiers(int i) {
			return getRuleContext(AccessModifiersContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Private:
			case Protected:
			case Public:
			case Enum:
			case Final:
			case Static:
			case Abstract:
			case Class:
			case Interface:
			case Strictfp:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public) | (1L << Final) | (1L << Static) | (1L << Abstract) | (1L << Strictfp))) != 0)) {
					{
					{
					setState(213);
					accessModifiers();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Class:
					{
					setState(219);
					classDeclaration();
					}
					break;
				case Enum:
					{
					setState(220);
					enumDeclaration();
					}
					break;
				case Interface:
					{
					setState(221);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case Semicolon:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(Semicolon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AccessModifiersContext accessModifiers() {
			return getRuleContext(AccessModifiersContext.class,0);
		}
		public TerminalNode Native() { return getToken(JapperParser.Native, 0); }
		public TerminalNode Synchronized() { return getToken(JapperParser.Synchronized, 0); }
		public TerminalNode Transient() { return getToken(JapperParser.Transient, 0); }
		public TerminalNode Volatile() { return getToken(JapperParser.Volatile, 0); }
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitClassModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitClassModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classModifier);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Private:
			case Protected:
			case Public:
			case Final:
			case Static:
			case Abstract:
			case Strictfp:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				accessModifiers();
				}
				break;
			case Native:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(Native);
				}
				break;
			case Synchronized:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(Synchronized);
				}
				break;
			case Transient:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(Transient);
				}
				break;
			case Volatile:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(Volatile);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifiersContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(JapperParser.Private, 0); }
		public TerminalNode Protected() { return getToken(JapperParser.Protected, 0); }
		public TerminalNode Public() { return getToken(JapperParser.Public, 0); }
		public TerminalNode Static() { return getToken(JapperParser.Static, 0); }
		public TerminalNode Abstract() { return getToken(JapperParser.Abstract, 0); }
		public TerminalNode Final() { return getToken(JapperParser.Final, 0); }
		public TerminalNode Strictfp() { return getToken(JapperParser.Strictfp, 0); }
		public AccessModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterAccessModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitAccessModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitAccessModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifiersContext accessModifiers() throws RecognitionException {
		AccessModifiersContext _localctx = new AccessModifiersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accessModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public) | (1L << Final) | (1L << Static) | (1L << Abstract) | (1L << Strictfp))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(JapperParser.Final, 0); }
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitVariableModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(JapperParser.Class, 0); }
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public GenericTypesContext genericTypes() {
			return getRuleContext(GenericTypesContext.class,0);
		}
		public TerminalNode Extends() { return getToken(JapperParser.Extends, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode Implements() { return getToken(JapperParser.Implements, 0); }
		public DataTypeListContext dataTypeList() {
			return getRuleContext(DataTypeListContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(Class);
			setState(239);
			match(VariableName);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RightAngularBrack) {
				{
				setState(240);
				genericTypes();
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(243);
				match(Extends);
				setState(244);
				dataType();
				}
			}

			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(247);
				match(Implements);
				setState(248);
				dataTypeList();
				}
			}

			setState(251);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericTypesContext extends ParserRuleContext {
		public TerminalNode RightAngularBrack() { return getToken(JapperParser.RightAngularBrack, 0); }
		public List<GenericTypeContext> genericType() {
			return getRuleContexts(GenericTypeContext.class);
		}
		public GenericTypeContext genericType(int i) {
			return getRuleContext(GenericTypeContext.class,i);
		}
		public TerminalNode LeftAngularBrack() { return getToken(JapperParser.LeftAngularBrack, 0); }
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public GenericTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterGenericTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitGenericTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitGenericTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypesContext genericTypes() throws RecognitionException {
		GenericTypesContext _localctx = new GenericTypesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_genericTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(RightAngularBrack);
			setState(254);
			genericType();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(255);
				match(Comma);
				setState(256);
				genericType();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(LeftAngularBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericTypeContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public TerminalNode Extends() { return getToken(JapperParser.Extends, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_genericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(VariableName);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(265);
				match(Extends);
				setState(266);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> Ampersand() { return getTokens(JapperParser.Ampersand); }
		public TerminalNode Ampersand(int i) {
			return getToken(JapperParser.Ampersand, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitTypeBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			dataType();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ampersand) {
				{
				{
				setState(270);
				match(Ampersand);
				setState(271);
				dataType();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(JapperParser.Enum, 0); }
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public TerminalNode OpenCurlyBrack() { return getToken(JapperParser.OpenCurlyBrack, 0); }
		public TerminalNode CloseCurlyBrack() { return getToken(JapperParser.CloseCurlyBrack, 0); }
		public TerminalNode Implements() { return getToken(JapperParser.Implements, 0); }
		public DataTypeListContext dataTypeList() {
			return getRuleContext(DataTypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode Comma() { return getToken(JapperParser.Comma, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(Enum);
			setState(278);
			match(VariableName);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(279);
				match(Implements);
				setState(280);
				dataTypeList();
				}
			}

			setState(283);
			match(OpenCurlyBrack);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VariableName) {
				{
				setState(284);
				enumConstants();
				}
			}

			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(287);
				match(Comma);
				}
			}

			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semicolon) {
				{
				setState(290);
				enumBodyDeclarations();
				}
			}

			setState(293);
			match(CloseCurlyBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitEnumConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			enumConstant();
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(296);
					match(Comma);
					setState(297);
					enumConstant();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(VariableName);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenPare) {
				{
				setState(304);
				arguments();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenCurlyBrack) {
				{
				setState(307);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(Semicolon);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Boolean) | (1L << Bit2) | (1L << Byte) | (1L << Short) | (1L << Int) | (1L << Long) | (1L << Float) | (1L << Double) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Enum) | (1L << Final) | (1L << Static) | (1L << Synchronized) | (1L << Transient) | (1L << Void) | (1L << Volatile) | (1L << Abstract) | (1L << Class) | (1L << Interface) | (1L << Native) | (1L << Strictfp))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (OpenCurlyBrack - 74)) | (1L << (Semicolon - 74)) | (1L << (RightAngularBrack - 74)) | (1L << (VariableName - 74)))) != 0)) {
				{
				{
				setState(311);
				classBodyDeclaration();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(JapperParser.Interface, 0); }
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public GenericTypesContext genericTypes() {
			return getRuleContext(GenericTypesContext.class,0);
		}
		public TerminalNode Extends() { return getToken(JapperParser.Extends, 0); }
		public DataTypeListContext dataTypeList() {
			return getRuleContext(DataTypeListContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(Interface);
			setState(318);
			match(VariableName);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RightAngularBrack) {
				{
				setState(319);
				genericTypes();
				}
			}

			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(322);
				match(Extends);
				setState(323);
				dataTypeList();
				}
			}

			setState(326);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBrack() { return getToken(JapperParser.OpenCurlyBrack, 0); }
		public TerminalNode CloseCurlyBrack() { return getToken(JapperParser.CloseCurlyBrack, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(OpenCurlyBrack);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Boolean) | (1L << Bit2) | (1L << Byte) | (1L << Short) | (1L << Int) | (1L << Long) | (1L << Float) | (1L << Double) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Enum) | (1L << Final) | (1L << Static) | (1L << Synchronized) | (1L << Transient) | (1L << Void) | (1L << Volatile) | (1L << Abstract) | (1L << Class) | (1L << Interface) | (1L << Native) | (1L << Strictfp))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (OpenCurlyBrack - 74)) | (1L << (Semicolon - 74)) | (1L << (RightAngularBrack - 74)) | (1L << (VariableName - 74)))) != 0)) {
				{
				{
				setState(329);
				classBodyDeclaration();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(CloseCurlyBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBrack() { return getToken(JapperParser.OpenCurlyBrack, 0); }
		public TerminalNode CloseCurlyBrack() { return getToken(JapperParser.CloseCurlyBrack, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(OpenCurlyBrack);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Boolean) | (1L << Bit2) | (1L << Byte) | (1L << Short) | (1L << Int) | (1L << Long) | (1L << Float) | (1L << Double) | (1L << Default) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Enum) | (1L << Final) | (1L << Static) | (1L << Synchronized) | (1L << Transient) | (1L << Void) | (1L << Volatile) | (1L << Abstract) | (1L << Class) | (1L << Interface) | (1L << Native) | (1L << Strictfp))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (Semicolon - 76)) | (1L << (RightAngularBrack - 76)) | (1L << (VariableName - 76)))) != 0)) {
				{
				{
				setState(338);
				interfaceBodyDeclaration();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			match(CloseCurlyBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Static() { return getToken(JapperParser.Static, 0); }
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitClassBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Static) {
					{
					setState(347);
					match(Static);
					}
				}

				setState(350);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(351);
						classModifier();
						}
						} 
					}
					setState(356);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(357);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public GenericFunctionDeclarationContext genericFunctionDeclaration() {
			return getRuleContext(GenericFunctionDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_memberDeclaration);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				genericFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(366);
				classDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(367);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public ReturnTypesContext returnTypes() {
			return getRuleContext(ReturnTypesContext.class,0);
		}
		public List<TerminalNode> VariableName() { return getTokens(JapperParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(JapperParser.VariableName, i);
		}
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<TerminalNode> OpenSqBrack() { return getTokens(JapperParser.OpenSqBrack); }
		public TerminalNode OpenSqBrack(int i) {
			return getToken(JapperParser.OpenSqBrack, i);
		}
		public List<TerminalNode> CloseSqBrack() { return getTokens(JapperParser.CloseSqBrack); }
		public TerminalNode CloseSqBrack(int i) {
			return getToken(JapperParser.CloseSqBrack, i);
		}
		public TerminalNode Throws() { return getToken(JapperParser.Throws, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			returnTypes();
			setState(371);
			match(VariableName);
			setState(372);
			functionParameters();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSqBrack) {
				{
				{
				setState(373);
				match(OpenSqBrack);
				setState(374);
				match(CloseSqBrack);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Throws) {
				{
				setState(380);
				match(Throws);
				setState(381);
				match(VariableName);
				}
			}

			setState(384);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionBody);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBrack:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				block();
				}
				break;
			case Semicolon:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(Semicolon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypesContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(JapperParser.Void, 0); }
		public ReturnTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterReturnTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitReturnTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitReturnTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypesContext returnTypes() throws RecognitionException {
		ReturnTypesContext _localctx = new ReturnTypesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnTypes);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
			case VariableName:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				dataType();
				}
				break;
			case Void:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericFunctionDeclarationContext extends ParserRuleContext {
		public GenericTypesContext genericTypes() {
			return getRuleContext(GenericTypesContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public GenericFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterGenericFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitGenericFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitGenericFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericFunctionDeclarationContext genericFunctionDeclaration() throws RecognitionException {
		GenericFunctionDeclarationContext _localctx = new GenericFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			genericTypes();
			setState(395);
			functionDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public GenericTypesContext genericTypes() {
			return getRuleContext(GenericTypesContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitGenericConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitGenericConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			genericTypes();
			setState(398);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public BlockContext constructorBody;
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Throws() { return getToken(JapperParser.Throws, 0); }
		public VariableOrMemberNameListContext variableOrMemberNameList() {
			return getRuleContext(VariableOrMemberNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(VariableName);
			setState(401);
			functionParameters();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Throws) {
				{
				setState(402);
				match(Throws);
				setState(403);
				variableOrMemberNameList();
				}
			}

			setState(406);
			((ConstructorDeclarationContext)_localctx).constructorBody = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public VariableModifierContext variableModifier() {
			return getRuleContext(VariableModifierContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final) {
				{
				setState(408);
				variableModifier();
				}
			}

			setState(411);
			dataType();
			setState(412);
			variableDeclarators();
			setState(413);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitInterfaceBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
			case Default:
			case Private:
			case Protected:
			case Public:
			case Enum:
			case Final:
			case Static:
			case Synchronized:
			case Transient:
			case Void:
			case Volatile:
			case Abstract:
			case Class:
			case Interface:
			case Native:
			case Strictfp:
			case RightAngularBrack:
			case VariableName:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						classModifier();
						}
						} 
					}
					setState(420);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(421);
				interfaceMemberDeclaration();
				}
				break;
			case Semicolon:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(Semicolon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceFunctionDeclarationContext interfaceFunctionDeclaration() {
			return getRuleContext(InterfaceFunctionDeclarationContext.class,0);
		}
		public GenericInterfaceFunctionDeclarationContext genericInterfaceFunctionDeclaration() {
			return getRuleContext(GenericInterfaceFunctionDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitInterfaceMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitInterfaceMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_interfaceMemberDeclaration);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				interfaceFunctionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				genericInterfaceFunctionDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			dataType();
			setState(434);
			constantDeclarator();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(435);
				match(Comma);
				setState(436);
				constantDeclarator();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public TerminalNode Gets() { return getToken(JapperParser.Gets, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> OpenSqBrack() { return getTokens(JapperParser.OpenSqBrack); }
		public TerminalNode OpenSqBrack(int i) {
			return getToken(JapperParser.OpenSqBrack, i);
		}
		public List<TerminalNode> CloseSqBrack() { return getTokens(JapperParser.CloseSqBrack); }
		public TerminalNode CloseSqBrack(int i) {
			return getToken(JapperParser.CloseSqBrack, i);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitConstantDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(VariableName);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSqBrack) {
				{
				{
				setState(445);
				match(OpenSqBrack);
				setState(446);
				match(CloseSqBrack);
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(452);
			match(Gets);
			setState(453);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ReturnTypesContext returnTypes() {
			return getRuleContext(ReturnTypesContext.class,0);
		}
		public GenericTypesContext genericTypes() {
			return getRuleContext(GenericTypesContext.class,0);
		}
		public List<InterfaceFunctionModifierContext> interfaceFunctionModifier() {
			return getRuleContexts(InterfaceFunctionModifierContext.class);
		}
		public InterfaceFunctionModifierContext interfaceFunctionModifier(int i) {
			return getRuleContext(InterfaceFunctionModifierContext.class,i);
		}
		public List<TerminalNode> OpenSqBrack() { return getTokens(JapperParser.OpenSqBrack); }
		public TerminalNode OpenSqBrack(int i) {
			return getToken(JapperParser.OpenSqBrack, i);
		}
		public List<TerminalNode> CloseSqBrack() { return getTokens(JapperParser.CloseSqBrack); }
		public TerminalNode CloseSqBrack(int i) {
			return getToken(JapperParser.CloseSqBrack, i);
		}
		public TerminalNode Throws() { return getToken(JapperParser.Throws, 0); }
		public VariableOrMemberNameListContext variableOrMemberNameList() {
			return getRuleContext(VariableOrMemberNameListContext.class,0);
		}
		public InterfaceFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterInterfaceFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitInterfaceFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitInterfaceFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceFunctionDeclarationContext interfaceFunctionDeclaration() throws RecognitionException {
		InterfaceFunctionDeclarationContext _localctx = new InterfaceFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Default) | (1L << Public) | (1L << Static) | (1L << Abstract) | (1L << Strictfp))) != 0)) {
				{
				{
				setState(455);
				interfaceFunctionModifier();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
			case Void:
			case VariableName:
				{
				setState(461);
				returnTypes();
				}
				break;
			case RightAngularBrack:
				{
				setState(462);
				genericTypes();
				setState(463);
				returnTypes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(467);
			match(VariableName);
			setState(468);
			functionParameters();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSqBrack) {
				{
				{
				setState(469);
				match(OpenSqBrack);
				setState(470);
				match(CloseSqBrack);
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Throws) {
				{
				setState(476);
				match(Throws);
				setState(477);
				variableOrMemberNameList();
				}
			}

			setState(480);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceFunctionModifierContext extends ParserRuleContext {
		public TerminalNode Public() { return getToken(JapperParser.Public, 0); }
		public TerminalNode Abstract() { return getToken(JapperParser.Abstract, 0); }
		public TerminalNode Default() { return getToken(JapperParser.Default, 0); }
		public TerminalNode Static() { return getToken(JapperParser.Static, 0); }
		public TerminalNode Strictfp() { return getToken(JapperParser.Strictfp, 0); }
		public InterfaceFunctionModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceFunctionModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterInterfaceFunctionModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitInterfaceFunctionModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitInterfaceFunctionModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceFunctionModifierContext interfaceFunctionModifier() throws RecognitionException {
		InterfaceFunctionModifierContext _localctx = new InterfaceFunctionModifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceFunctionModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Default) | (1L << Public) | (1L << Static) | (1L << Abstract) | (1L << Strictfp))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceFunctionDeclarationContext extends ParserRuleContext {
		public GenericTypesContext genericTypes() {
			return getRuleContext(GenericTypesContext.class,0);
		}
		public InterfaceFunctionDeclarationContext interfaceFunctionDeclaration() {
			return getRuleContext(InterfaceFunctionDeclarationContext.class,0);
		}
		public GenericInterfaceFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterGenericInterfaceFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitGenericInterfaceFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitGenericInterfaceFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericInterfaceFunctionDeclarationContext genericInterfaceFunctionDeclaration() throws RecognitionException {
		GenericInterfaceFunctionDeclarationContext _localctx = new GenericInterfaceFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_genericInterfaceFunctionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			genericTypes();
			setState(485);
			interfaceFunctionDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			variableDeclarator();
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(488);
				match(Comma);
				setState(489);
				variableDeclarator();
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode Gets() { return getToken(JapperParser.Gets, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			variableDeclaratorId();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Gets) {
				{
				setState(496);
				match(Gets);
				setState(497);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public List<TerminalNode> OpenSqBrack() { return getTokens(JapperParser.OpenSqBrack); }
		public TerminalNode OpenSqBrack(int i) {
			return getToken(JapperParser.OpenSqBrack, i);
		}
		public List<TerminalNode> CloseSqBrack() { return getTokens(JapperParser.CloseSqBrack); }
		public TerminalNode CloseSqBrack(int i) {
			return getToken(JapperParser.CloseSqBrack, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(VariableName);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenSqBrack) {
				{
				{
				setState(501);
				match(OpenSqBrack);
				setState(502);
				match(CloseSqBrack);
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableInitializer);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenCurlyBrack:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				arrayInit();
				}
				break;
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
			case Println:
			case Readln:
			case Void:
			case New:
			case Super:
			case This:
			case BinVal:
			case QuatVal:
			case OctVal:
			case DecVal:
			case HexVal:
			case FloatingVal:
			case FloatingHexVal:
			case BoolVal:
			case CharVal:
			case StringVal:
			case NullVal:
			case OpenPare:
			case Negation:
			case Increment:
			case Decrement:
			case Plus:
			case Minus:
			case BitwiseNot:
			case RightAngularBrack:
			case VariableName:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBrack() { return getToken(JapperParser.OpenCurlyBrack, 0); }
		public TerminalNode CloseCurlyBrack() { return getToken(JapperParser.CloseCurlyBrack, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public ArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterArrayInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitArrayInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitArrayInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayInit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(OpenCurlyBrack);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (OpenCurlyBrack - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
				{
				setState(513);
				variableInitializer();
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(514);
						match(Comma);
						setState(515);
						variableInitializer();
						}
						} 
					}
					setState(520);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(521);
					match(Comma);
					}
				}

				}
			}

			setState(526);
			match(CloseCurlyBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> VariableName() { return getTokens(JapperParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(JapperParser.VariableName, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(JapperParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(JapperParser.Dot, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitClassOrInterfaceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(VariableName);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(529);
				typeArguments();
				}
				break;
			}
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(532);
					match(Dot);
					setState(533);
					match(VariableName);
					setState(535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(534);
						typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode Question() { return getToken(JapperParser.Question, 0); }
		public TerminalNode Extends() { return getToken(JapperParser.Extends, 0); }
		public TerminalNode Super() { return getToken(JapperParser.Super, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeArgument);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
			case VariableName:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				dataType();
				}
				break;
			case Question:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(Question);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends || _la==Super) {
					{
					setState(544);
					_la = _input.LA(1);
					if ( !(_la==Extends || _la==Super) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(545);
					dataType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOrMemberNameListContext extends ParserRuleContext {
		public List<VariableOrMemberNameContext> variableOrMemberName() {
			return getRuleContexts(VariableOrMemberNameContext.class);
		}
		public VariableOrMemberNameContext variableOrMemberName(int i) {
			return getRuleContext(VariableOrMemberNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public VariableOrMemberNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrMemberNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterVariableOrMemberNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitVariableOrMemberNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitVariableOrMemberNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrMemberNameListContext variableOrMemberNameList() throws RecognitionException {
		VariableOrMemberNameListContext _localctx = new VariableOrMemberNameListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableOrMemberNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			variableOrMemberName();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(551);
				match(Comma);
				setState(552);
				variableOrMemberName();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParametersContext extends ParserRuleContext {
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(OpenPare);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Boolean) | (1L << Bit2) | (1L << Byte) | (1L << Short) | (1L << Int) | (1L << Long) | (1L << Float) | (1L << Double) | (1L << Final))) != 0) || _la==VariableName) {
				{
				setState(559);
				functionParameterList();
				}
			}

			setState(562);
			match(ClosePare);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterListContext extends ParserRuleContext {
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public LastFunctionParameterContext lastFunctionParameter() {
			return getRuleContext(LastFunctionParameterContext.class,0);
		}
		public FunctionParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterFunctionParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitFunctionParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitFunctionParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterListContext functionParameterList() throws RecognitionException {
		FunctionParameterListContext _localctx = new FunctionParameterListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionParameterList);
		int _la;
		try {
			int _alt;
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				functionParameter();
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(565);
						match(Comma);
						setState(566);
						functionParameter();
						}
						} 
					}
					setState(571);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(572);
					match(Comma);
					setState(573);
					lastFunctionParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				lastFunctionParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Final) {
				{
				{
				setState(579);
				variableModifier();
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
			dataType();
			setState(586);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFunctionParameterContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(JapperParser.Ellipsis, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFunctionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterLastFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitLastFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitLastFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFunctionParameterContext lastFunctionParameter() throws RecognitionException {
		LastFunctionParameterContext _localctx = new LastFunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lastFunctionParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Final) {
				{
				{
				setState(588);
				variableModifier();
				}
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			dataType();
			setState(595);
			match(Ellipsis);
			setState(596);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOrMemberNameContext extends ParserRuleContext {
		public List<TerminalNode> VariableName() { return getTokens(JapperParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(JapperParser.VariableName, i);
		}
		public List<TerminalNode> Dot() { return getTokens(JapperParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(JapperParser.Dot, i);
		}
		public VariableOrMemberNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrMemberName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterVariableOrMemberName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitVariableOrMemberName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitVariableOrMemberName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrMemberNameContext variableOrMemberName() throws RecognitionException {
		VariableOrMemberNameContext _localctx = new VariableOrMemberNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableOrMemberName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(VariableName);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(599);
				match(Dot);
				setState(600);
				match(VariableName);
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CharVal() { return getToken(JapperParser.CharVal, 0); }
		public TerminalNode StringVal() { return getToken(JapperParser.StringVal, 0); }
		public TerminalNode BoolVal() { return getToken(JapperParser.BoolVal, 0); }
		public TerminalNode NullVal() { return getToken(JapperParser.NullVal, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BinVal:
			case QuatVal:
			case OctVal:
			case DecVal:
			case HexVal:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				integerLiteral();
				}
				break;
			case FloatingVal:
			case FloatingHexVal:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				floatLiteral();
				}
				break;
			case CharVal:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				match(CharVal);
				}
				break;
			case StringVal:
				enterOuterAlt(_localctx, 4);
				{
				setState(609);
				match(StringVal);
				}
				break;
			case BoolVal:
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				match(BoolVal);
				}
				break;
			case NullVal:
				enterOuterAlt(_localctx, 6);
				{
				setState(611);
				match(NullVal);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode BinVal() { return getToken(JapperParser.BinVal, 0); }
		public TerminalNode QuatVal() { return getToken(JapperParser.QuatVal, 0); }
		public TerminalNode OctVal() { return getToken(JapperParser.OctVal, 0); }
		public TerminalNode DecVal() { return getToken(JapperParser.DecVal, 0); }
		public TerminalNode HexVal() { return getToken(JapperParser.HexVal, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BinVal) | (1L << QuatVal) | (1L << OctVal) | (1L << DecVal) | (1L << HexVal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FloatingVal() { return getToken(JapperParser.FloatingVal, 0); }
		public TerminalNode FloatingHexVal() { return getToken(JapperParser.FloatingHexVal, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( !(_la==FloatingVal || _la==FloatingHexVal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueArrayInitContext elementValueArrayInit() {
			return getRuleContext(ElementValueArrayInitContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_elementValue);
		try {
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
			case Println:
			case Readln:
			case Void:
			case New:
			case Super:
			case This:
			case BinVal:
			case QuatVal:
			case OctVal:
			case DecVal:
			case HexVal:
			case FloatingVal:
			case FloatingHexVal:
			case BoolVal:
			case CharVal:
			case StringVal:
			case NullVal:
			case OpenPare:
			case Negation:
			case Increment:
			case Decrement:
			case Plus:
			case Minus:
			case BitwiseNot:
			case RightAngularBrack:
			case VariableName:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				expression(0);
				}
				break;
			case OpenCurlyBrack:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				elementValueArrayInit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBrack() { return getToken(JapperParser.OpenCurlyBrack, 0); }
		public TerminalNode CloseCurlyBrack() { return getToken(JapperParser.CloseCurlyBrack, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public ElementValueArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterElementValueArrayInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitElementValueArrayInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitElementValueArrayInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitContext elementValueArrayInit() throws RecognitionException {
		ElementValueArrayInitContext _localctx = new ElementValueArrayInitContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_elementValueArrayInit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(OpenCurlyBrack);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (OpenCurlyBrack - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
				{
				setState(623);
				elementValue();
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(624);
						match(Comma);
						setState(625);
						elementValue();
						}
						} 
					}
					setState(630);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				}
			}

			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(633);
				match(Comma);
				}
			}

			setState(636);
			match(CloseCurlyBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(JapperParser.Default, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(Default);
			setState(639);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBrack() { return getToken(JapperParser.OpenCurlyBrack, 0); }
		public TerminalNode CloseCurlyBrack() { return getToken(JapperParser.CloseCurlyBrack, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(OpenCurlyBrack);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (Try - 1)) | (1L << (Throw - 1)) | (1L << (Char - 1)) | (1L << (Boolean - 1)) | (1L << (Bit2 - 1)) | (1L << (Byte - 1)) | (1L << (Short - 1)) | (1L << (Int - 1)) | (1L << (Long - 1)) | (1L << (Float - 1)) | (1L << (Double - 1)) | (1L << (Do - 1)) | (1L << (While - 1)) | (1L << (For - 1)) | (1L << (Loop - 1)) | (1L << (If - 1)) | (1L << (Switch - 1)) | (1L << (Assert - 1)) | (1L << (Continue - 1)) | (1L << (Return - 1)) | (1L << (Break - 1)) | (1L << (Println - 1)) | (1L << (Readln - 1)) | (1L << (Private - 1)) | (1L << (Protected - 1)) | (1L << (Public - 1)) | (1L << (Final - 1)) | (1L << (Static - 1)) | (1L << (Synchronized - 1)) | (1L << (Void - 1)) | (1L << (Abstract - 1)) | (1L << (Class - 1)) | (1L << (Interface - 1)) | (1L << (New - 1)) | (1L << (Strictfp - 1)) | (1L << (Super - 1)) | (1L << (This - 1)) | (1L << (BinVal - 1)) | (1L << (QuatVal - 1)) | (1L << (OctVal - 1)) | (1L << (DecVal - 1)) | (1L << (HexVal - 1)) | (1L << (FloatingVal - 1)) | (1L << (FloatingHexVal - 1)) | (1L << (BoolVal - 1)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (CharVal - 67)) | (1L << (StringVal - 67)) | (1L << (NullVal - 67)) | (1L << (OpenPare - 67)) | (1L << (OpenCurlyBrack - 67)) | (1L << (Semicolon - 67)) | (1L << (Negation - 67)) | (1L << (Increment - 67)) | (1L << (Decrement - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (BitwiseNot - 67)) | (1L << (RightAngularBrack - 67)) | (1L << (VariableName - 67)))) != 0)) {
				{
				{
				setState(642);
				blockStatement();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
			match(CloseCurlyBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalTypeDeclarationContext localTypeDeclaration() {
			return getRuleContext(LocalTypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_blockStatement);
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				localVariableDeclaration();
				setState(651);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				localTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Final) {
				{
				{
				setState(657);
				variableModifier();
				}
				}
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(663);
			dataType();
			setState(664);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalTypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public List<AccessModifiersContext> accessModifiers() {
			return getRuleContexts(AccessModifiersContext.class);
		}
		public AccessModifiersContext accessModifiers(int i) {
			return getRuleContext(AccessModifiersContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public LocalTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterLocalTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitLocalTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitLocalTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTypeDeclarationContext localTypeDeclaration() throws RecognitionException {
		LocalTypeDeclarationContext _localctx = new LocalTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_localTypeDeclaration);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Private:
			case Protected:
			case Public:
			case Final:
			case Static:
			case Abstract:
			case Class:
			case Interface:
			case Strictfp:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public) | (1L << Final) | (1L << Static) | (1L << Abstract) | (1L << Strictfp))) != 0)) {
					{
					{
					setState(666);
					accessModifiers();
					}
					}
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Class:
					{
					setState(672);
					classDeclaration();
					}
					break;
				case Interface:
					{
					setState(673);
					interfaceDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case Semicolon:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(Semicolon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public Token identifierLabel;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Assert() { return getToken(JapperParser.Assert, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(JapperParser.Semicolon, 0); }
		public TerminalNode Colon() { return getToken(JapperParser.Colon, 0); }
		public TerminalNode If() { return getToken(JapperParser.If, 0); }
		public ParenthesisExpressionContext parenthesisExpression() {
			return getRuleContext(ParenthesisExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(JapperParser.Else, 0); }
		public TerminalNode For() { return getToken(JapperParser.For, 0); }
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public TerminalNode While() { return getToken(JapperParser.While, 0); }
		public TerminalNode Do() { return getToken(JapperParser.Do, 0); }
		public TerminalNode Loop() { return getToken(JapperParser.Loop, 0); }
		public TerminalNode Until() { return getToken(JapperParser.Until, 0); }
		public TerminalNode Try() { return getToken(JapperParser.Try, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchBlockContext> catchBlock() {
			return getRuleContexts(CatchBlockContext.class);
		}
		public CatchBlockContext catchBlock(int i) {
			return getRuleContext(CatchBlockContext.class,i);
		}
		public TerminalNode Switch() { return getToken(JapperParser.Switch, 0); }
		public TerminalNode OpenCurlyBrack() { return getToken(JapperParser.OpenCurlyBrack, 0); }
		public TerminalNode CloseCurlyBrack() { return getToken(JapperParser.CloseCurlyBrack, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode Synchronized() { return getToken(JapperParser.Synchronized, 0); }
		public TerminalNode Return() { return getToken(JapperParser.Return, 0); }
		public TerminalNode Throw() { return getToken(JapperParser.Throw, 0); }
		public TerminalNode Break() { return getToken(JapperParser.Break, 0); }
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public TerminalNode Continue() { return getToken(JapperParser.Continue, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(Assert);
				setState(681);
				expression(0);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(682);
					match(Colon);
					setState(683);
					expression(0);
					}
				}

				setState(686);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				match(If);
				setState(689);
				parenthesisExpression();
				setState(690);
				statement();
				setState(693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(691);
					match(Else);
					setState(692);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				match(For);
				setState(696);
				match(OpenPare);
				setState(697);
				forControl();
				setState(698);
				match(ClosePare);
				setState(699);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(701);
				match(While);
				setState(702);
				parenthesisExpression();
				setState(703);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(705);
				match(Do);
				setState(706);
				statement();
				setState(707);
				match(While);
				setState(708);
				parenthesisExpression();
				setState(709);
				match(Semicolon);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(711);
				match(Loop);
				setState(712);
				parenthesisExpression();
				setState(713);
				statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(715);
				match(Loop);
				setState(716);
				statement();
				setState(717);
				match(Until);
				setState(718);
				parenthesisExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(720);
				match(Loop);
				setState(721);
				match(OpenPare);
				setState(722);
				forControl();
				setState(723);
				match(ClosePare);
				setState(724);
				statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(726);
				match(Try);
				setState(727);
				block();
				setState(737);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Catch:
					{
					setState(729); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(728);
						catchBlock();
						}
						}
						setState(731); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Catch );
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Finally) {
						{
						setState(733);
						finallyBlock();
						}
					}

					}
					break;
				case Finally:
					{
					setState(736);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(739);
				match(Switch);
				setState(740);
				parenthesisExpression();
				setState(741);
				match(OpenCurlyBrack);
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(742);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(747);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Case || _la==Default) {
					{
					{
					setState(748);
					switchLabel();
					}
					}
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(754);
				match(CloseCurlyBrack);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(756);
				match(Synchronized);
				setState(757);
				parenthesisExpression();
				setState(758);
				block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(760);
				match(Return);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
					{
					setState(761);
					expression(0);
					}
				}

				setState(764);
				match(Semicolon);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(765);
				match(Throw);
				setState(766);
				expression(0);
				setState(767);
				match(Semicolon);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(769);
				match(Break);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VariableName) {
					{
					setState(770);
					match(VariableName);
					}
				}

				setState(773);
				match(Semicolon);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(774);
				match(Continue);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VariableName) {
					{
					setState(775);
					match(VariableName);
					}
				}

				setState(778);
				match(Semicolon);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(779);
				match(Semicolon);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(780);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(781);
				match(Semicolon);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(783);
				((StatementContext)_localctx).identifierLabel = match(VariableName);
				setState(784);
				match(Colon);
				setState(785);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchBlockContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(JapperParser.Catch, 0); }
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterCatchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitCatchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitCatchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBlockContext catchBlock() throws RecognitionException {
		CatchBlockContext _localctx = new CatchBlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_catchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(Catch);
			setState(789);
			match(OpenPare);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Final) {
				{
				{
				setState(790);
				variableModifier();
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
			catchType();
			setState(797);
			match(VariableName);
			setState(798);
			match(ClosePare);
			setState(799);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<VariableOrMemberNameContext> variableOrMemberName() {
			return getRuleContexts(VariableOrMemberNameContext.class);
		}
		public VariableOrMemberNameContext variableOrMemberName(int i) {
			return getRuleContext(VariableOrMemberNameContext.class,i);
		}
		public List<TerminalNode> Pipe() { return getTokens(JapperParser.Pipe); }
		public TerminalNode Pipe(int i) {
			return getToken(JapperParser.Pipe, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			variableOrMemberName();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(802);
				match(Pipe);
				setState(803);
				variableOrMemberName();
				}
				}
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(JapperParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(Finally);
			setState(810);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(812);
				switchLabel();
				}
				}
				setState(815); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case || _la==Default );
			setState(818); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(817);
				blockStatement();
				}
				}
				setState(820); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (Try - 1)) | (1L << (Throw - 1)) | (1L << (Char - 1)) | (1L << (Boolean - 1)) | (1L << (Bit2 - 1)) | (1L << (Byte - 1)) | (1L << (Short - 1)) | (1L << (Int - 1)) | (1L << (Long - 1)) | (1L << (Float - 1)) | (1L << (Double - 1)) | (1L << (Do - 1)) | (1L << (While - 1)) | (1L << (For - 1)) | (1L << (Loop - 1)) | (1L << (If - 1)) | (1L << (Switch - 1)) | (1L << (Assert - 1)) | (1L << (Continue - 1)) | (1L << (Return - 1)) | (1L << (Break - 1)) | (1L << (Println - 1)) | (1L << (Readln - 1)) | (1L << (Private - 1)) | (1L << (Protected - 1)) | (1L << (Public - 1)) | (1L << (Final - 1)) | (1L << (Static - 1)) | (1L << (Synchronized - 1)) | (1L << (Void - 1)) | (1L << (Abstract - 1)) | (1L << (Class - 1)) | (1L << (Interface - 1)) | (1L << (New - 1)) | (1L << (Strictfp - 1)) | (1L << (Super - 1)) | (1L << (This - 1)) | (1L << (BinVal - 1)) | (1L << (QuatVal - 1)) | (1L << (OctVal - 1)) | (1L << (DecVal - 1)) | (1L << (HexVal - 1)) | (1L << (FloatingVal - 1)) | (1L << (FloatingHexVal - 1)) | (1L << (BoolVal - 1)))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (CharVal - 67)) | (1L << (StringVal - 67)) | (1L << (NullVal - 67)) | (1L << (OpenPare - 67)) | (1L << (OpenCurlyBrack - 67)) | (1L << (Semicolon - 67)) | (1L << (Negation - 67)) | (1L << (Increment - 67)) | (1L << (Decrement - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (BitwiseNot - 67)) | (1L << (RightAngularBrack - 67)) | (1L << (VariableName - 67)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode Case() { return getToken(JapperParser.Case, 0); }
		public TerminalNode Colon() { return getToken(JapperParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public TerminalNode Default() { return getToken(JapperParser.Default, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_switchLabel);
		try {
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Case:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				match(Case);
				setState(825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(823);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(824);
					((SwitchLabelContext)_localctx).enumConstantName = match(VariableName);
					}
					break;
				}
				setState(827);
				match(Colon);
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(Default);
				setState(829);
				match(Colon);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public ForEachContext forEach() {
			return getRuleContext(ForEachContext.class,0);
		}
		public List<TerminalNode> Semicolon() { return getTokens(JapperParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(JapperParser.Semicolon, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_forControl);
		int _la;
		try {
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				forEach();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Final - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
					{
					setState(833);
					forInit();
					}
				}

				setState(836);
				match(Semicolon);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
					{
					setState(837);
					expression(0);
					}
				}

				setState(840);
				match(Semicolon);
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
					{
					setState(841);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_forInit);
		try {
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForEachContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JapperParser.Colon, 0); }
		public TerminalNode In() { return getToken(JapperParser.In, 0); }
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ForEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterForEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitForEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitForEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachContext forEach() throws RecognitionException {
		ForEachContext _localctx = new ForEachContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_forEach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Final) {
				{
				{
				setState(850);
				variableModifier();
				}
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(856);
			dataType();
			setState(857);
			variableDeclaratorId();
			setState(858);
			_la = _input.LA(1);
			if ( !(_la==In || _la==Colon) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(859);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesisExpressionContext extends ParserRuleContext {
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public ParenthesisExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesisExpressionContext parenthesisExpression() throws RecognitionException {
		ParenthesisExpressionContext _localctx = new ParenthesisExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_parenthesisExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(OpenPare);
			setState(862);
			expression(0);
			setState(863);
			match(ClosePare);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			expression(0);
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(866);
				match(Comma);
				setState(867);
				expression(0);
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadFunctionCallContext extends FunctionCallContext {
		public TerminalNode Readln() { return getToken(JapperParser.Readln, 0); }
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public ReadFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterReadFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitReadFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitReadFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisFunctionCallContext extends FunctionCallContext {
		public TerminalNode This() { return getToken(JapperParser.This, 0); }
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ThisFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterThisFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitThisFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitThisFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableFunctionCallContext extends FunctionCallContext {
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VariableFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterVariableFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitVariableFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitVariableFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFunctionCallContext extends FunctionCallContext {
		public TerminalNode Println() { return getToken(JapperParser.Println, 0); }
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitPrintFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitPrintFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuperFunctionCallContext extends FunctionCallContext {
		public TerminalNode Super() { return getToken(JapperParser.Super, 0); }
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SuperFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterSuperFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitSuperFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitSuperFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_functionCall);
		int _la;
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VariableName:
				_localctx = new VariableFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				match(VariableName);
				setState(874);
				match(OpenPare);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
					{
					setState(875);
					expressionList();
					}
				}

				setState(878);
				match(ClosePare);
				}
				break;
			case This:
				_localctx = new ThisFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				match(This);
				setState(880);
				match(OpenPare);
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
					{
					setState(881);
					expressionList();
					}
				}

				setState(884);
				match(ClosePare);
				}
				break;
			case Super:
				_localctx = new SuperFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				match(Super);
				setState(886);
				match(OpenPare);
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
					{
					setState(887);
					expressionList();
					}
				}

				setState(890);
				match(ClosePare);
				}
				break;
			case Println:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(891);
				match(Println);
				setState(892);
				match(OpenPare);
				setState(893);
				expression(0);
				setState(894);
				match(ClosePare);
				}
				break;
			case Readln:
				_localctx = new ReadFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(896);
				match(Readln);
				setState(897);
				match(OpenPare);
				setState(898);
				match(ClosePare);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode New() { return getToken(JapperParser.New, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Increment() { return getToken(JapperParser.Increment, 0); }
		public TerminalNode Decrement() { return getToken(JapperParser.Decrement, 0); }
		public TerminalNode Plus() { return getToken(JapperParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JapperParser.Minus, 0); }
		public TerminalNode Negation() { return getToken(JapperParser.Negation, 0); }
		public TerminalNode BitwiseNot() { return getToken(JapperParser.BitwiseNot, 0); }
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public TerminalNode DoubleColon() { return getToken(JapperParser.DoubleColon, 0); }
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public TerminalNode Times() { return getToken(JapperParser.Times, 0); }
		public TerminalNode Divide() { return getToken(JapperParser.Divide, 0); }
		public TerminalNode Modulo() { return getToken(JapperParser.Modulo, 0); }
		public TerminalNode ShiftLeftLogical() { return getToken(JapperParser.ShiftLeftLogical, 0); }
		public TerminalNode ShiftRightLogical() { return getToken(JapperParser.ShiftRightLogical, 0); }
		public TerminalNode ShiftRightArithmetic() { return getToken(JapperParser.ShiftRightArithmetic, 0); }
		public TerminalNode Less() { return getToken(JapperParser.Less, 0); }
		public TerminalNode LessEqual() { return getToken(JapperParser.LessEqual, 0); }
		public TerminalNode Greater() { return getToken(JapperParser.Greater, 0); }
		public TerminalNode GreaterEqual() { return getToken(JapperParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(JapperParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(JapperParser.NotEqual, 0); }
		public TerminalNode BitwiseAnd() { return getToken(JapperParser.BitwiseAnd, 0); }
		public TerminalNode BitwiseXor() { return getToken(JapperParser.BitwiseXor, 0); }
		public TerminalNode BitwiseOr() { return getToken(JapperParser.BitwiseOr, 0); }
		public TerminalNode And() { return getToken(JapperParser.And, 0); }
		public TerminalNode Or() { return getToken(JapperParser.Or, 0); }
		public TerminalNode Colon() { return getToken(JapperParser.Colon, 0); }
		public TerminalNode Question() { return getToken(JapperParser.Question, 0); }
		public TerminalNode If() { return getToken(JapperParser.If, 0); }
		public TerminalNode Gets() { return getToken(JapperParser.Gets, 0); }
		public TerminalNode PlusEqual() { return getToken(JapperParser.PlusEqual, 0); }
		public TerminalNode MinusEqual() { return getToken(JapperParser.MinusEqual, 0); }
		public TerminalNode TimesEqual() { return getToken(JapperParser.TimesEqual, 0); }
		public TerminalNode DivEqual() { return getToken(JapperParser.DivEqual, 0); }
		public TerminalNode ModEqual() { return getToken(JapperParser.ModEqual, 0); }
		public TerminalNode AndEqual() { return getToken(JapperParser.AndEqual, 0); }
		public TerminalNode OrEqual() { return getToken(JapperParser.OrEqual, 0); }
		public TerminalNode XorEqual() { return getToken(JapperParser.XorEqual, 0); }
		public TerminalNode ShiftLeftLogicalEqual() { return getToken(JapperParser.ShiftLeftLogicalEqual, 0); }
		public TerminalNode ShiftRightLogicalEqual() { return getToken(JapperParser.ShiftRightLogicalEqual, 0); }
		public TerminalNode ShiftRightArithmeticEqual() { return getToken(JapperParser.ShiftRightArithmeticEqual, 0); }
		public TerminalNode Dot() { return getToken(JapperParser.Dot, 0); }
		public TerminalNode This() { return getToken(JapperParser.This, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public TerminalNode Super() { return getToken(JapperParser.Super, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode OpenSqBrack() { return getToken(JapperParser.OpenSqBrack, 0); }
		public TerminalNode CloseSqBrack() { return getToken(JapperParser.CloseSqBrack, 0); }
		public TerminalNode Instanceof() { return getToken(JapperParser.Instanceof, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(902);
				primary();
				}
				break;
			case 2:
				{
				setState(903);
				functionCall();
				}
				break;
			case 3:
				{
				setState(904);
				match(New);
				setState(905);
				creator();
				}
				break;
			case 4:
				{
				setState(906);
				match(OpenPare);
				setState(907);
				dataType();
				setState(908);
				match(ClosePare);
				setState(909);
				expression(21);
				}
				break;
			case 5:
				{
				setState(911);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (Negation - 91)) | (1L << (Increment - 91)) | (1L << (Decrement - 91)) | (1L << (Plus - 91)) | (1L << (Minus - 91)) | (1L << (BitwiseNot - 91)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(912);
				expression(19);
				}
				break;
			case 6:
				{
				setState(913);
				lambdaExpression();
				}
				break;
			case 7:
				{
				setState(914);
				dataType();
				setState(915);
				match(DoubleColon);
				setState(921);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RightAngularBrack:
				case VariableName:
					{
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RightAngularBrack) {
						{
						setState(916);
						typeArguments();
						}
					}

					setState(919);
					match(VariableName);
					}
					break;
				case New:
					{
					setState(920);
					match(New);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				{
				setState(923);
				classType();
				setState(924);
				match(DoubleColon);
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightAngularBrack) {
					{
					setState(925);
					typeArguments();
					}
				}

				setState(928);
				match(New);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1010);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1008);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(932);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(933);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Times - 96)) | (1L << (Divide - 96)) | (1L << (Modulo - 96)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(934);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(935);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(936);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(937);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(938);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(939);
						_la = _input.LA(1);
						if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (ShiftLeftLogical - 111)) | (1L << (ShiftRightLogical - 111)) | (1L << (ShiftRightArithmetic - 111)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(940);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(941);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(942);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (Greater - 99)) | (1L << (GreaterEqual - 99)) | (1L << (Less - 99)) | (1L << (LessEqual - 99)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(943);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(944);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(945);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(946);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(947);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(948);
						((ExpressionContext)_localctx).bop = match(BitwiseAnd);
						setState(949);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(950);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(951);
						((ExpressionContext)_localctx).bop = match(BitwiseXor);
						setState(952);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(953);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(954);
						((ExpressionContext)_localctx).bop = match(BitwiseOr);
						setState(955);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(956);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(957);
						((ExpressionContext)_localctx).bop = match(And);
						setState(958);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(959);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(960);
						((ExpressionContext)_localctx).bop = match(Or);
						setState(961);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(962);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(963);
						((ExpressionContext)_localctx).bop = match(Question);
						setState(964);
						expression(0);
						setState(965);
						match(Colon);
						setState(966);
						expression(8);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(968);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(969);
						match(If);
						setState(970);
						expression(0);
						setState(971);
						((ExpressionContext)_localctx).bop = match(Question);
						setState(972);
						expression(7);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(974);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(975);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Gets - 79)) | (1L << (PlusEqual - 79)) | (1L << (MinusEqual - 79)) | (1L << (TimesEqual - 79)) | (1L << (DivEqual - 79)) | (1L << (ModEqual - 79)) | (1L << (AndEqual - 79)) | (1L << (OrEqual - 79)) | (1L << (XorEqual - 79)) | (1L << (ShiftLeftLogicalEqual - 79)) | (1L << (ShiftRightLogicalEqual - 79)) | (1L << (ShiftRightArithmeticEqual - 79)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(976);
						expression(5);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(977);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(978);
						((ExpressionContext)_localctx).bop = match(Dot);
						setState(990);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
						case 1:
							{
							setState(979);
							match(VariableName);
							}
							break;
						case 2:
							{
							setState(980);
							functionCall();
							}
							break;
						case 3:
							{
							setState(981);
							match(This);
							}
							break;
						case 4:
							{
							setState(982);
							match(New);
							setState(984);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==RightAngularBrack) {
								{
								setState(983);
								nonWildcardTypeArguments();
								}
							}

							setState(986);
							innerCreator();
							}
							break;
						case 5:
							{
							setState(987);
							match(Super);
							setState(988);
							superSuffix();
							}
							break;
						case 6:
							{
							setState(989);
							explicitGenericInvocation();
							}
							break;
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(992);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(993);
						match(OpenSqBrack);
						setState(994);
						expression(0);
						setState(995);
						match(CloseSqBrack);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(997);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(998);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Increment || _la==Decrement) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(999);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1000);
						((ExpressionContext)_localctx).bop = match(Instanceof);
						setState(1001);
						dataType();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1002);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1003);
						match(DoubleColon);
						setState(1005);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==RightAngularBrack) {
							{
							setState(1004);
							typeArguments();
							}
						}

						setState(1007);
						match(VariableName);
						}
						break;
					}
					} 
				}
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode Arrow() { return getToken(JapperParser.Arrow, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			lambdaParameters();
			setState(1014);
			match(Arrow);
			setState(1015);
			lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> VariableName() { return getTokens(JapperParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(JapperParser.VariableName, i);
		}
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_lambdaParameters);
		int _la;
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				match(VariableName);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				match(OpenPare);
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Boolean) | (1L << Bit2) | (1L << Byte) | (1L << Short) | (1L << Int) | (1L << Long) | (1L << Float) | (1L << Double) | (1L << Final))) != 0) || _la==VariableName) {
					{
					setState(1019);
					functionParameterList();
					}
				}

				setState(1022);
				match(ClosePare);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1023);
				match(OpenPare);
				setState(1024);
				match(VariableName);
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1025);
					match(Comma);
					setState(1026);
					match(VariableName);
					}
					}
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1032);
				match(ClosePare);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_lambdaBody);
		try {
			setState(1037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
			case Println:
			case Readln:
			case Void:
			case New:
			case Super:
			case This:
			case BinVal:
			case QuatVal:
			case OctVal:
			case DecVal:
			case HexVal:
			case FloatingVal:
			case FloatingHexVal:
			case BoolVal:
			case CharVal:
			case StringVal:
			case NullVal:
			case OpenPare:
			case Negation:
			case Increment:
			case Decrement:
			case Plus:
			case Minus:
			case BitwiseNot:
			case RightAngularBrack:
			case VariableName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				expression(0);
				}
				break;
			case OpenCurlyBrack:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public TerminalNode This() { return getToken(JapperParser.This, 0); }
		public TerminalNode Super() { return getToken(JapperParser.Super, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public ReturnTypesContext returnTypes() {
			return getRuleContext(ReturnTypesContext.class,0);
		}
		public TerminalNode Dot() { return getToken(JapperParser.Dot, 0); }
		public TerminalNode Class() { return getToken(JapperParser.Class, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_primary);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1039);
				match(OpenPare);
				setState(1040);
				expression(0);
				setState(1041);
				match(ClosePare);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
				match(This);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1044);
				match(Super);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1045);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1046);
				match(VariableName);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1047);
				returnTypes();
				setState(1048);
				match(Dot);
				setState(1049);
				match(Class);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1051);
				nonWildcardTypeArguments();
				setState(1055);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Super:
				case VariableName:
					{
					setState(1052);
					explicitGenericInvocationSuffix();
					}
					break;
				case This:
					{
					setState(1053);
					match(This);
					setState(1054);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TerminalNode Dot() { return getToken(JapperParser.Dot, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitClassType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_classType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1059);
				classOrInterfaceType();
				setState(1060);
				match(Dot);
				}
				break;
			}
			setState(1064);
			match(VariableName);
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RightAngularBrack) {
				{
				setState(1065);
				typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_creator);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RightAngularBrack:
				enterOuterAlt(_localctx, 1);
				{
				setState(1068);
				nonWildcardTypeArguments();
				setState(1069);
				createdName();
				setState(1070);
				classCreatorRest();
				}
				break;
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
			case VariableName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				createdName();
				setState(1075);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenSqBrack:
					{
					setState(1073);
					arrayCreatorRest();
					}
					break;
				case OpenPare:
					{
					setState(1074);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> VariableName() { return getTokens(JapperParser.VariableName); }
		public TerminalNode VariableName(int i) {
			return getToken(JapperParser.VariableName, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(JapperParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(JapperParser.Dot, i);
		}
		public PrimitiveDataTypesContext primitiveDataTypes() {
			return getRuleContext(PrimitiveDataTypesContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitCreatedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_createdName);
		int _la;
		try {
			setState(1094);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VariableName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				match(VariableName);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RightAngularBrack) {
					{
					setState(1080);
					typeArgumentsOrDiamond();
					}
				}

				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot) {
					{
					{
					setState(1083);
					match(Dot);
					setState(1084);
					match(VariableName);
					setState(1086);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RightAngularBrack) {
						{
						setState(1085);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				primitiveDataTypes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitInnerCreator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(VariableName);
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RightAngularBrack) {
				{
				setState(1097);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1100);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> OpenSqBrack() { return getTokens(JapperParser.OpenSqBrack); }
		public TerminalNode OpenSqBrack(int i) {
			return getToken(JapperParser.OpenSqBrack, i);
		}
		public List<TerminalNode> CloseSqBrack() { return getTokens(JapperParser.CloseSqBrack); }
		public TerminalNode CloseSqBrack(int i) {
			return getToken(JapperParser.CloseSqBrack, i);
		}
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitArrayCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(OpenSqBrack);
			setState(1130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CloseSqBrack:
				{
				setState(1103);
				match(CloseSqBrack);
				setState(1108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenSqBrack) {
					{
					{
					setState(1104);
					match(OpenSqBrack);
					setState(1105);
					match(CloseSqBrack);
					}
					}
					setState(1110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1111);
				arrayInit();
				}
				break;
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
			case Println:
			case Readln:
			case Void:
			case New:
			case Super:
			case This:
			case BinVal:
			case QuatVal:
			case OctVal:
			case DecVal:
			case HexVal:
			case FloatingVal:
			case FloatingHexVal:
			case BoolVal:
			case CharVal:
			case StringVal:
			case NullVal:
			case OpenPare:
			case Negation:
			case Increment:
			case Decrement:
			case Plus:
			case Minus:
			case BitwiseNot:
			case RightAngularBrack:
			case VariableName:
				{
				setState(1112);
				expression(0);
				setState(1113);
				match(CloseSqBrack);
				setState(1120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1114);
						match(OpenSqBrack);
						setState(1115);
						expression(0);
						setState(1116);
						match(CloseSqBrack);
						}
						} 
					}
					setState(1122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				setState(1127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1123);
						match(OpenSqBrack);
						setState(1124);
						match(CloseSqBrack);
						}
						} 
					}
					setState(1129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitClassCreatorRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_classCreatorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			arguments();
			setState(1134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1133);
				classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitExplicitGenericInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			nonWildcardTypeArguments();
			setState(1137);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode RightAngularBrack() { return getToken(JapperParser.RightAngularBrack, 0); }
		public TerminalNode LeftAngularBrack() { return getToken(JapperParser.LeftAngularBrack, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeArgumentsOrDiamond);
		try {
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				match(RightAngularBrack);
				setState(1140);
				match(LeftAngularBrack);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode RightAngularBrack() { return getToken(JapperParser.RightAngularBrack, 0); }
		public TerminalNode LeftAngularBrack() { return getToken(JapperParser.LeftAngularBrack, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				match(RightAngularBrack);
				setState(1145);
				match(LeftAngularBrack);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1146);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode RightAngularBrack() { return getToken(JapperParser.RightAngularBrack, 0); }
		public DataTypeListContext dataTypeList() {
			return getRuleContext(DataTypeListContext.class,0);
		}
		public TerminalNode LeftAngularBrack() { return getToken(JapperParser.LeftAngularBrack, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitNonWildcardTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			match(RightAngularBrack);
			setState(1150);
			dataTypeList();
			setState(1151);
			match(LeftAngularBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeListContext extends ParserRuleContext {
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public DataTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterDataTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitDataTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitDataTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeListContext dataTypeList() throws RecognitionException {
		DataTypeListContext _localctx = new DataTypeListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dataTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			dataType();
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1154);
				match(Comma);
				setState(1155);
				dataType();
				}
				}
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveDataTypesContext primitiveDataTypes() {
			return getRuleContext(PrimitiveDataTypesContext.class,0);
		}
		public List<TerminalNode> OpenSqBrack() { return getTokens(JapperParser.OpenSqBrack); }
		public TerminalNode OpenSqBrack(int i) {
			return getToken(JapperParser.OpenSqBrack, i);
		}
		public List<TerminalNode> CloseSqBrack() { return getTokens(JapperParser.CloseSqBrack); }
		public TerminalNode CloseSqBrack(int i) {
			return getToken(JapperParser.CloseSqBrack, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_dataType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VariableName:
				{
				setState(1161);
				classOrInterfaceType();
				}
				break;
			case Char:
			case Boolean:
			case Bit2:
			case Byte:
			case Short:
			case Int:
			case Long:
			case Float:
			case Double:
				{
				setState(1162);
				primitiveDataTypes();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1165);
					match(OpenSqBrack);
					setState(1166);
					match(CloseSqBrack);
					}
					} 
				}
				setState(1171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveDataTypesContext extends ParserRuleContext {
		public TerminalNode Char() { return getToken(JapperParser.Char, 0); }
		public TerminalNode Boolean() { return getToken(JapperParser.Boolean, 0); }
		public TerminalNode Bit2() { return getToken(JapperParser.Bit2, 0); }
		public TerminalNode Byte() { return getToken(JapperParser.Byte, 0); }
		public TerminalNode Short() { return getToken(JapperParser.Short, 0); }
		public TerminalNode Int() { return getToken(JapperParser.Int, 0); }
		public TerminalNode Long() { return getToken(JapperParser.Long, 0); }
		public TerminalNode Float() { return getToken(JapperParser.Float, 0); }
		public TerminalNode Double() { return getToken(JapperParser.Double, 0); }
		public PrimitiveDataTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveDataTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterPrimitiveDataTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitPrimitiveDataTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitPrimitiveDataTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveDataTypesContext primitiveDataTypes() throws RecognitionException {
		PrimitiveDataTypesContext _localctx = new PrimitiveDataTypesContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_primitiveDataTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Char) | (1L << Boolean) | (1L << Bit2) | (1L << Byte) | (1L << Short) | (1L << Int) | (1L << Long) | (1L << Float) | (1L << Double))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode RightAngularBrack() { return getToken(JapperParser.RightAngularBrack, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode LeftAngularBrack() { return getToken(JapperParser.LeftAngularBrack, 0); }
		public List<TerminalNode> Comma() { return getTokens(JapperParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JapperParser.Comma, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(RightAngularBrack);
			setState(1175);
			typeArgument();
			setState(1180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1176);
				match(Comma);
				setState(1177);
				typeArgument();
				}
				}
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1183);
			match(LeftAngularBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Dot() { return getToken(JapperParser.Dot, 0); }
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_superSuffix);
		try {
			setState(1191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenPare:
				enterOuterAlt(_localctx, 1);
				{
				setState(1185);
				arguments();
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				match(Dot);
				setState(1187);
				match(VariableName);
				setState(1189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1188);
					arguments();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode Super() { return getToken(JapperParser.Super, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode VariableName() { return getToken(JapperParser.VariableName, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Super:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				match(Super);
				setState(1194);
				superSuffix();
				}
				break;
			case VariableName:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				match(VariableName);
				setState(1196);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenPare() { return getToken(JapperParser.OpenPare, 0); }
		public TerminalNode ClosePare() { return getToken(JapperParser.ClosePare, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JapperParserListener ) ((JapperParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JapperParserVisitor ) return ((JapperParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(OpenPare);
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (Char - 6)) | (1L << (Boolean - 6)) | (1L << (Bit2 - 6)) | (1L << (Byte - 6)) | (1L << (Short - 6)) | (1L << (Int - 6)) | (1L << (Long - 6)) | (1L << (Float - 6)) | (1L << (Double - 6)) | (1L << (Println - 6)) | (1L << (Readln - 6)) | (1L << (Void - 6)) | (1L << (New - 6)) | (1L << (Super - 6)) | (1L << (This - 6)) | (1L << (BinVal - 6)) | (1L << (QuatVal - 6)) | (1L << (OctVal - 6)) | (1L << (DecVal - 6)) | (1L << (HexVal - 6)) | (1L << (FloatingVal - 6)) | (1L << (FloatingHexVal - 6)) | (1L << (BoolVal - 6)) | (1L << (CharVal - 6)) | (1L << (StringVal - 6)) | (1L << (NullVal - 6)))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (OpenPare - 70)) | (1L << (Negation - 70)) | (1L << (Increment - 70)) | (1L << (Decrement - 70)) | (1L << (Plus - 70)) | (1L << (Minus - 70)) | (1L << (BitwiseNot - 70)) | (1L << (RightAngularBrack - 70)) | (1L << (VariableName - 70)))) != 0)) {
				{
				setState(1200);
				expressionList();
				}
			}

			setState(1203);
			match(ClosePare);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 69:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 24);
		case 15:
			return precpred(_ctx, 20);
		case 16:
			return precpred(_ctx, 14);
		case 17:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0084\u04b8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\5\2\u00ba\n\2\3"+
		"\2\7\2\u00bd\n\2\f\2\16\2\u00c0\13\2\3\2\7\2\u00c3\n\2\f\2\16\2\u00c6"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00d0\n\4\3\4\3\4\5\4\u00d4"+
		"\n\4\3\4\3\4\3\5\7\5\u00d9\n\5\f\5\16\5\u00dc\13\5\3\5\3\5\3\5\5\5\u00e1"+
		"\n\5\3\5\5\5\u00e4\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00eb\n\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\5\t\u00f4\n\t\3\t\3\t\5\t\u00f8\n\t\3\t\3\t\5\t\u00fc\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0104\n\n\f\n\16\n\u0107\13\n\3\n\3\n\3"+
		"\13\3\13\3\13\5\13\u010e\n\13\3\f\3\f\3\f\7\f\u0113\n\f\f\f\16\f\u0116"+
		"\13\f\3\r\3\r\3\r\3\r\5\r\u011c\n\r\3\r\3\r\5\r\u0120\n\r\3\r\5\r\u0123"+
		"\n\r\3\r\5\r\u0126\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u012d\n\16\f\16\16"+
		"\16\u0130\13\16\3\17\3\17\5\17\u0134\n\17\3\17\5\17\u0137\n\17\3\20\3"+
		"\20\7\20\u013b\n\20\f\20\16\20\u013e\13\20\3\21\3\21\3\21\5\21\u0143\n"+
		"\21\3\21\3\21\5\21\u0147\n\21\3\21\3\21\3\22\3\22\7\22\u014d\n\22\f\22"+
		"\16\22\u0150\13\22\3\22\3\22\3\23\3\23\7\23\u0156\n\23\f\23\16\23\u0159"+
		"\13\23\3\23\3\23\3\24\3\24\5\24\u015f\n\24\3\24\3\24\7\24\u0163\n\24\f"+
		"\24\16\24\u0166\13\24\3\24\5\24\u0169\n\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u0173\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u017a\n\26"+
		"\f\26\16\26\u017d\13\26\3\26\3\26\5\26\u0181\n\26\3\26\3\26\3\27\3\27"+
		"\5\27\u0187\n\27\3\30\3\30\5\30\u018b\n\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\5\33\u0197\n\33\3\33\3\33\3\34\5\34\u019c\n\34"+
		"\3\34\3\34\3\34\3\34\3\35\7\35\u01a3\n\35\f\35\16\35\u01a6\13\35\3\35"+
		"\3\35\5\35\u01aa\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01b2\n\36\3"+
		"\37\3\37\3\37\3\37\7\37\u01b8\n\37\f\37\16\37\u01bb\13\37\3\37\3\37\3"+
		" \3 \3 \7 \u01c2\n \f \16 \u01c5\13 \3 \3 \3 \3!\7!\u01cb\n!\f!\16!\u01ce"+
		"\13!\3!\3!\3!\3!\5!\u01d4\n!\3!\3!\3!\3!\7!\u01da\n!\f!\16!\u01dd\13!"+
		"\3!\3!\5!\u01e1\n!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\7$\u01ed\n$\f$\16$"+
		"\u01f0\13$\3%\3%\3%\5%\u01f5\n%\3&\3&\3&\7&\u01fa\n&\f&\16&\u01fd\13&"+
		"\3\'\3\'\5\'\u0201\n\'\3(\3(\3(\3(\7(\u0207\n(\f(\16(\u020a\13(\3(\5("+
		"\u020d\n(\5(\u020f\n(\3(\3(\3)\3)\5)\u0215\n)\3)\3)\3)\5)\u021a\n)\7)"+
		"\u021c\n)\f)\16)\u021f\13)\3*\3*\3*\3*\5*\u0225\n*\5*\u0227\n*\3+\3+\3"+
		"+\7+\u022c\n+\f+\16+\u022f\13+\3,\3,\5,\u0233\n,\3,\3,\3-\3-\3-\7-\u023a"+
		"\n-\f-\16-\u023d\13-\3-\3-\5-\u0241\n-\3-\5-\u0244\n-\3.\7.\u0247\n.\f"+
		".\16.\u024a\13.\3.\3.\3.\3/\7/\u0250\n/\f/\16/\u0253\13/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\7\60\u025c\n\60\f\60\16\60\u025f\13\60\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\5\61\u0267\n\61\3\62\3\62\3\63\3\63\3\64\3\64\5\64\u026f"+
		"\n\64\3\65\3\65\3\65\3\65\7\65\u0275\n\65\f\65\16\65\u0278\13\65\5\65"+
		"\u027a\n\65\3\65\5\65\u027d\n\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\7"+
		"\67\u0286\n\67\f\67\16\67\u0289\13\67\3\67\3\67\38\38\38\38\38\58\u0292"+
		"\n8\39\79\u0295\n9\f9\169\u0298\139\39\39\39\3:\7:\u029e\n:\f:\16:\u02a1"+
		"\13:\3:\3:\5:\u02a5\n:\3:\5:\u02a8\n:\3;\3;\3;\3;\3;\5;\u02af\n;\3;\3"+
		";\3;\3;\3;\3;\3;\5;\u02b8\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\6;\u02dc"+
		"\n;\r;\16;\u02dd\3;\5;\u02e1\n;\3;\5;\u02e4\n;\3;\3;\3;\3;\7;\u02ea\n"+
		";\f;\16;\u02ed\13;\3;\7;\u02f0\n;\f;\16;\u02f3\13;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\5;\u02fd\n;\3;\3;\3;\3;\3;\3;\3;\5;\u0306\n;\3;\3;\3;\5;\u030b\n"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0315\n;\3<\3<\3<\7<\u031a\n<\f<\16<\u031d"+
		"\13<\3<\3<\3<\3<\3<\3=\3=\3=\7=\u0327\n=\f=\16=\u032a\13=\3>\3>\3>\3?"+
		"\6?\u0330\n?\r?\16?\u0331\3?\6?\u0335\n?\r?\16?\u0336\3@\3@\3@\5@\u033c"+
		"\n@\3@\3@\3@\5@\u0341\n@\3A\3A\5A\u0345\nA\3A\3A\5A\u0349\nA\3A\3A\5A"+
		"\u034d\nA\5A\u034f\nA\3B\3B\5B\u0353\nB\3C\7C\u0356\nC\fC\16C\u0359\13"+
		"C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\7E\u0367\nE\fE\16E\u036a\13E\3F"+
		"\3F\3F\5F\u036f\nF\3F\3F\3F\3F\5F\u0375\nF\3F\3F\3F\3F\5F\u037b\nF\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0386\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\5G\u0398\nG\3G\3G\5G\u039c\nG\3G\3G\3G\5G\u03a1\nG\3G"+
		"\3G\5G\u03a5\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03db\nG\3G\3G\3G\3G\5G\u03e1\nG"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u03f0\nG\3G\7G\u03f3\nG\fG"+
		"\16G\u03f6\13G\3H\3H\3H\3H\3I\3I\3I\5I\u03ff\nI\3I\3I\3I\3I\3I\7I\u0406"+
		"\nI\fI\16I\u0409\13I\3I\5I\u040c\nI\3J\3J\5J\u0410\nJ\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0422\nK\5K\u0424\nK\3L\3L\3L\5L\u0429"+
		"\nL\3L\3L\5L\u042d\nL\3M\3M\3M\3M\3M\3M\3M\5M\u0436\nM\5M\u0438\nM\3N"+
		"\3N\5N\u043c\nN\3N\3N\3N\5N\u0441\nN\7N\u0443\nN\fN\16N\u0446\13N\3N\5"+
		"N\u0449\nN\3O\3O\5O\u044d\nO\3O\3O\3P\3P\3P\3P\7P\u0455\nP\fP\16P\u0458"+
		"\13P\3P\3P\3P\3P\3P\3P\3P\7P\u0461\nP\fP\16P\u0464\13P\3P\3P\7P\u0468"+
		"\nP\fP\16P\u046b\13P\5P\u046d\nP\3Q\3Q\5Q\u0471\nQ\3R\3R\3R\3S\3S\3S\5"+
		"S\u0479\nS\3T\3T\3T\5T\u047e\nT\3U\3U\3U\3U\3V\3V\3V\7V\u0487\nV\fV\16"+
		"V\u048a\13V\3W\3W\5W\u048e\nW\3W\3W\7W\u0492\nW\fW\16W\u0495\13W\3X\3"+
		"X\3Y\3Y\3Y\3Y\7Y\u049d\nY\fY\16Y\u04a0\13Y\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u04a8"+
		"\nZ\5Z\u04aa\nZ\3[\3[\3[\3[\5[\u04b0\n[\3\\\3\\\5\\\u04b4\n\\\3\\\3\\"+
		"\3\\\2\3\u008c]\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\2\21"+
		"\6\2#%()..88\7\2\32\32%%))..88\4\2\60\6099\3\2;?\3\2@A\4\2  uu\4\2]am"+
		"m\3\2bd\3\2`a\3\2qs\3\2eh\3\2ij\3\2Q\\\3\2^_\3\2\b\20\2\u0534\2\u00b9"+
		"\3\2\2\2\4\u00c9\3\2\2\2\6\u00cd\3\2\2\2\b\u00e3\3\2\2\2\n\u00ea\3\2\2"+
		"\2\f\u00ec\3\2\2\2\16\u00ee\3\2\2\2\20\u00f0\3\2\2\2\22\u00ff\3\2\2\2"+
		"\24\u010a\3\2\2\2\26\u010f\3\2\2\2\30\u0117\3\2\2\2\32\u0129\3\2\2\2\34"+
		"\u0131\3\2\2\2\36\u0138\3\2\2\2 \u013f\3\2\2\2\"\u014a\3\2\2\2$\u0153"+
		"\3\2\2\2&\u0168\3\2\2\2(\u0172\3\2\2\2*\u0174\3\2\2\2,\u0186\3\2\2\2."+
		"\u018a\3\2\2\2\60\u018c\3\2\2\2\62\u018f\3\2\2\2\64\u0192\3\2\2\2\66\u019b"+
		"\3\2\2\28\u01a9\3\2\2\2:\u01b1\3\2\2\2<\u01b3\3\2\2\2>\u01be\3\2\2\2@"+
		"\u01cc\3\2\2\2B\u01e4\3\2\2\2D\u01e6\3\2\2\2F\u01e9\3\2\2\2H\u01f1\3\2"+
		"\2\2J\u01f6\3\2\2\2L\u0200\3\2\2\2N\u0202\3\2\2\2P\u0212\3\2\2\2R\u0226"+
		"\3\2\2\2T\u0228\3\2\2\2V\u0230\3\2\2\2X\u0243\3\2\2\2Z\u0248\3\2\2\2\\"+
		"\u0251\3\2\2\2^\u0258\3\2\2\2`\u0266\3\2\2\2b\u0268\3\2\2\2d\u026a\3\2"+
		"\2\2f\u026e\3\2\2\2h\u0270\3\2\2\2j\u0280\3\2\2\2l\u0283\3\2\2\2n\u0291"+
		"\3\2\2\2p\u0296\3\2\2\2r\u02a7\3\2\2\2t\u0314\3\2\2\2v\u0316\3\2\2\2x"+
		"\u0323\3\2\2\2z\u032b\3\2\2\2|\u032f\3\2\2\2~\u0340\3\2\2\2\u0080\u034e"+
		"\3\2\2\2\u0082\u0352\3\2\2\2\u0084\u0357\3\2\2\2\u0086\u035f\3\2\2\2\u0088"+
		"\u0363\3\2\2\2\u008a\u0385\3\2\2\2\u008c\u03a4\3\2\2\2\u008e\u03f7\3\2"+
		"\2\2\u0090\u040b\3\2\2\2\u0092\u040f\3\2\2\2\u0094\u0423\3\2\2\2\u0096"+
		"\u0428\3\2\2\2\u0098\u0437\3\2\2\2\u009a\u0448\3\2\2\2\u009c\u044a\3\2"+
		"\2\2\u009e\u0450\3\2\2\2\u00a0\u046e\3\2\2\2\u00a2\u0472\3\2\2\2\u00a4"+
		"\u0478\3\2\2\2\u00a6\u047d\3\2\2\2\u00a8\u047f\3\2\2\2\u00aa\u0483\3\2"+
		"\2\2\u00ac\u048d\3\2\2\2\u00ae\u0496\3\2\2\2\u00b0\u0498\3\2\2\2\u00b2"+
		"\u04a9\3\2\2\2\u00b4\u04af\3\2\2\2\u00b6\u04b1\3\2\2\2\u00b8\u00ba\5\4"+
		"\3\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00be\3\2\2\2\u00bb"+
		"\u00bd\5\6\4\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c4\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c3\5\b\5\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c8\7\2\2\3\u00c8\3\3\2\2\2\u00c9\u00ca\7\67\2\2\u00ca\u00cb\5^\60"+
		"\2\u00cb\u00cc\7N\2\2\u00cc\5\3\2\2\2\u00cd\u00cf\7\62\2\2\u00ce\u00d0"+
		"\7)\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\5^\60\2\u00d2\u00d4\7|\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7N\2\2\u00d6\7\3\2\2\2\u00d7\u00d9"+
		"\5\f\7\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00e0\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1\5\20"+
		"\t\2\u00de\u00e1\5\30\r\2\u00df\u00e1\5 \21\2\u00e0\u00dd\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e4\7N"+
		"\2\2\u00e3\u00da\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\t\3\2\2\2\u00e5\u00eb"+
		"\5\f\7\2\u00e6\u00eb\7\65\2\2\u00e7\u00eb\7*\2\2\u00e8\u00eb\7+\2\2\u00e9"+
		"\u00eb\7-\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\13\3\2\2\2\u00ec\u00ed"+
		"\t\2\2\2\u00ed\r\3\2\2\2\u00ee\u00ef\7(\2\2\u00ef\17\3\2\2\2\u00f0\u00f1"+
		"\7/\2\2\u00f1\u00f3\7\u0084\2\2\u00f2\u00f4\5\22\n\2\u00f3\u00f2\3\2\2"+
		"\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\7\60\2\2\u00f6"+
		"\u00f8\5\u00acW\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fc\5\u00aaV\2\u00fb\u00f9\3\2\2"+
		"\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\5\"\22\2\u00fe"+
		"\21\3\2\2\2\u00ff\u0100\7v\2\2\u0100\u0105\5\24\13\2\u0101\u0102\7O\2"+
		"\2\u0102\u0104\5\24\13\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u0109\7w\2\2\u0109\23\3\2\2\2\u010a\u010d\7\u0084\2\2\u010b"+
		"\u010c\7\60\2\2\u010c\u010e\5\26\f\2\u010d\u010b\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\25\3\2\2\2\u010f\u0114\5\u00acW\2\u0110\u0111\7x\2\2\u0111"+
		"\u0113\5\u00acW\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\27\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\7\'\2\2\u0118\u011b\7\u0084\2\2\u0119\u011a\7\61\2\2\u011a\u011c"+
		"\5\u00aaV\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2"+
		"\2\u011d\u011f\7L\2\2\u011e\u0120\5\32\16\2\u011f\u011e\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u0123\7O\2\2\u0122\u0121\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0126\5\36\20\2\u0125"+
		"\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7M"+
		"\2\2\u0128\31\3\2\2\2\u0129\u012e\5\34\17\2\u012a\u012b\7O\2\2\u012b\u012d"+
		"\5\34\17\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\33\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133"+
		"\7\u0084\2\2\u0132\u0134\5\u00b6\\\2\u0133\u0132\3\2\2\2\u0133\u0134\3"+
		"\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137\5\"\22\2\u0136\u0135\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\35\3\2\2\2\u0138\u013c\7N\2\2\u0139\u013b\5&\24\2"+
		"\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\37\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\64\2\2\u0140"+
		"\u0142\7\u0084\2\2\u0141\u0143\5\22\n\2\u0142\u0141\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0145\7\60\2\2\u0145\u0147\5\u00aa"+
		"V\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\5$\23\2\u0149!\3\2\2\2\u014a\u014e\7L\2\2\u014b\u014d\5&\24\2\u014c"+
		"\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7M\2\2\u0152"+
		"#\3\2\2\2\u0153\u0157\7L\2\2\u0154\u0156\58\35\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7M\2\2\u015b%\3\2\2\2\u015c\u0169"+
		"\7N\2\2\u015d\u015f\7)\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0169\5l\67\2\u0161\u0163\5\n\6\2\u0162\u0161\3\2"+
		"\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\5(\25\2\u0168\u015c\3\2"+
		"\2\2\u0168\u015e\3\2\2\2\u0168\u0164\3\2\2\2\u0169\'\3\2\2\2\u016a\u0173"+
		"\5*\26\2\u016b\u0173\5\60\31\2\u016c\u0173\5\66\34\2\u016d\u0173\5\64"+
		"\33\2\u016e\u0173\5\62\32\2\u016f\u0173\5 \21\2\u0170\u0173\5\20\t\2\u0171"+
		"\u0173\5\30\r\2\u0172\u016a\3\2\2\2\u0172\u016b\3\2\2\2\u0172\u016c\3"+
		"\2\2\2\u0172\u016d\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u016f\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173)\3\2\2\2\u0174\u0175\5.\30\2"+
		"\u0175\u0176\7\u0084\2\2\u0176\u017b\5V,\2\u0177\u0178\7J\2\2\u0178\u017a"+
		"\7K\2\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u0180\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\7"+
		"\2\2\u017f\u0181\7\u0084\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0183\5,\27\2\u0183+\3\2\2\2\u0184\u0187\5l\67\2"+
		"\u0185\u0187\7N\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187-\3\2"+
		"\2\2\u0188\u018b\5\u00acW\2\u0189\u018b\7,\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u0189\3\2\2\2\u018b/\3\2\2\2\u018c\u018d\5\22\n\2\u018d\u018e\5*\26\2"+
		"\u018e\61\3\2\2\2\u018f\u0190\5\22\n\2\u0190\u0191\5\64\33\2\u0191\63"+
		"\3\2\2\2\u0192\u0193\7\u0084\2\2\u0193\u0196\5V,\2\u0194\u0195\7\7\2\2"+
		"\u0195\u0197\5T+\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u0199\5l\67\2\u0199\65\3\2\2\2\u019a\u019c\5\16\b\2\u019b"+
		"\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\5\u00ac"+
		"W\2\u019e\u019f\5F$\2\u019f\u01a0\7N\2\2\u01a0\67\3\2\2\2\u01a1\u01a3"+
		"\5\n\6\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\5:"+
		"\36\2\u01a8\u01aa\7N\2\2\u01a9\u01a4\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"9\3\2\2\2\u01ab\u01b2\5<\37\2\u01ac\u01b2\5@!\2\u01ad\u01b2\5D#\2\u01ae"+
		"\u01b2\5 \21\2\u01af\u01b2\5\20\t\2\u01b0\u01b2\5\30\r\2\u01b1\u01ab\3"+
		"\2\2\2\u01b1\u01ac\3\2\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01ae\3\2\2\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2;\3\2\2\2\u01b3\u01b4\5\u00ac"+
		"W\2\u01b4\u01b9\5> \2\u01b5\u01b6\7O\2\2\u01b6\u01b8\5> \2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7N\2\2\u01bd=\3\2\2\2\u01be"+
		"\u01c3\7\u0084\2\2\u01bf\u01c0\7J\2\2\u01c0\u01c2\7K\2\2\u01c1\u01bf\3"+
		"\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\7Q\2\2\u01c7\u01c8\5L\'"+
		"\2\u01c8?\3\2\2\2\u01c9\u01cb\5B\"\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3"+
		"\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d3\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01cf\u01d4\5.\30\2\u01d0\u01d1\5\22\n\2\u01d1\u01d2\5"+
		".\30\2\u01d2\u01d4\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d6\7\u0084\2\2\u01d6\u01db\5V,\2\u01d7\u01d8\7"+
		"J\2\2\u01d8\u01da\7K\2\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e0\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01de\u01df\7\7\2\2\u01df\u01e1\5T+\2\u01e0\u01de\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\5,\27\2\u01e3A\3\2\2\2\u01e4"+
		"\u01e5\t\3\2\2\u01e5C\3\2\2\2\u01e6\u01e7\5\22\n\2\u01e7\u01e8\5@!\2\u01e8"+
		"E\3\2\2\2\u01e9\u01ee\5H%\2\u01ea\u01eb\7O\2\2\u01eb\u01ed\5H%\2\u01ec"+
		"\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01efG\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f4\5J&\2\u01f2\u01f3"+
		"\7Q\2\2\u01f3\u01f5\5L\'\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"I\3\2\2\2\u01f6\u01fb\7\u0084\2\2\u01f7\u01f8\7J\2\2\u01f8\u01fa\7K\2"+
		"\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fcK\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\5N(\2\u01ff\u0201"+
		"\5\u008cG\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201M\3\2\2\2\u0202"+
		"\u020e\7L\2\2\u0203\u0208\5L\'\2\u0204\u0205\7O\2\2\u0205\u0207\5L\'\2"+
		"\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209"+
		"\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\7O\2\2\u020c"+
		"\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0203\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\7M\2\2\u0211"+
		"O\3\2\2\2\u0212\u0214\7\u0084\2\2\u0213\u0215\5\u00b0Y\2\u0214\u0213\3"+
		"\2\2\2\u0214\u0215\3\2\2\2\u0215\u021d\3\2\2\2\u0216\u0217\7P\2\2\u0217"+
		"\u0219\7\u0084\2\2\u0218\u021a\5\u00b0Y\2\u0219\u0218\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0216\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021eQ\3\2\2\2\u021f\u021d\3\2\2\2"+
		"\u0220\u0227\5\u00acW\2\u0221\u0224\7t\2\2\u0222\u0223\t\4\2\2\u0223\u0225"+
		"\5\u00acW\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2"+
		"\2\u0226\u0220\3\2\2\2\u0226\u0221\3\2\2\2\u0227S\3\2\2\2\u0228\u022d"+
		"\5^\60\2\u0229\u022a\7O\2\2\u022a\u022c\5^\60\2\u022b\u0229\3\2\2\2\u022c"+
		"\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022eU\3\2\2\2"+
		"\u022f\u022d\3\2\2\2\u0230\u0232\7H\2\2\u0231\u0233\5X-\2\u0232\u0231"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\7I\2\2\u0235"+
		"W\3\2\2\2\u0236\u023b\5Z.\2\u0237\u0238\7O\2\2\u0238\u023a\5Z.\2\u0239"+
		"\u0237\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\u0240\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7O\2\2\u023f"+
		"\u0241\5\\/\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0244\3\2"+
		"\2\2\u0242\u0244\5\\/\2\u0243\u0236\3\2\2\2\u0243\u0242\3\2\2\2\u0244"+
		"Y\3\2\2\2\u0245\u0247\5\16\b\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2"+
		"\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248"+
		"\3\2\2\2\u024b\u024c\5\u00acW\2\u024c\u024d\5J&\2\u024d[\3\2\2\2\u024e"+
		"\u0250\5\16\b\2\u024f\u024e\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3"+
		"\2\2\2\u0251\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254"+
		"\u0255\5\u00acW\2\u0255\u0256\7\u0080\2\2\u0256\u0257\5J&\2\u0257]\3\2"+
		"\2\2\u0258\u025d\7\u0084\2\2\u0259\u025a\7P\2\2\u025a\u025c\7\u0084\2"+
		"\2\u025b\u0259\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e_\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0267\5b\62\2\u0261"+
		"\u0267\5d\63\2\u0262\u0267\7E\2\2\u0263\u0267\7F\2\2\u0264\u0267\7B\2"+
		"\2\u0265\u0267\7G\2\2\u0266\u0260\3\2\2\2\u0266\u0261\3\2\2\2\u0266\u0262"+
		"\3\2\2\2\u0266\u0263\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0265\3\2\2\2\u0267"+
		"a\3\2\2\2\u0268\u0269\t\5\2\2\u0269c\3\2\2\2\u026a\u026b\t\6\2\2\u026b"+
		"e\3\2\2\2\u026c\u026f\5\u008cG\2\u026d\u026f\5h\65\2\u026e\u026c\3\2\2"+
		"\2\u026e\u026d\3\2\2\2\u026fg\3\2\2\2\u0270\u0279\7L\2\2\u0271\u0276\5"+
		"f\64\2\u0272\u0273\7O\2\2\u0273\u0275\5f\64\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2"+
		"\2\2\u0278\u0276\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027c\3\2\2\2\u027b\u027d\7O\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2"+
		"\2\2\u027d\u027e\3\2\2\2\u027e\u027f\7M\2\2\u027fi\3\2\2\2\u0280\u0281"+
		"\7\32\2\2\u0281\u0282\5f\64\2\u0282k\3\2\2\2\u0283\u0287\7L\2\2\u0284"+
		"\u0286\5n8\2\u0285\u0284\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2"+
		"\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028b"+
		"\7M\2\2\u028bm\3\2\2\2\u028c\u028d\5p9\2\u028d\u028e\7N\2\2\u028e\u0292"+
		"\3\2\2\2\u028f\u0292\5t;\2\u0290\u0292\5r:\2\u0291\u028c\3\2\2\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292o\3\2\2\2\u0293\u0295\5\16\b\2"+
		"\u0294\u0293\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0299\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029a\5\u00acW"+
		"\2\u029a\u029b\5F$\2\u029bq\3\2\2\2\u029c\u029e\5\f\7\2\u029d\u029c\3"+
		"\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a4\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a5\5\20\t\2\u02a3\u02a5\5"+
		" \21\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6"+
		"\u02a8\7N\2\2\u02a7\u029f\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8s\3\2\2\2\u02a9"+
		"\u0315\5l\67\2\u02aa\u02ab\7\33\2\2\u02ab\u02ae\5\u008cG\2\u02ac\u02ad"+
		"\7u\2\2\u02ad\u02af\5\u008cG\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2"+
		"\u02af\u02b0\3\2\2\2\u02b0\u02b1\7N\2\2\u02b1\u0315\3\2\2\2\u02b2\u02b3"+
		"\7\26\2\2\u02b3\u02b4\5\u0086D\2\u02b4\u02b7\5t;\2\u02b5\u02b6\7\27\2"+
		"\2\u02b6\u02b8\5t;\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u0315"+
		"\3\2\2\2\u02b9\u02ba\7\23\2\2\u02ba\u02bb\7H\2\2\u02bb\u02bc\5\u0080A"+
		"\2\u02bc\u02bd\7I\2\2\u02bd\u02be\5t;\2\u02be\u0315\3\2\2\2\u02bf\u02c0"+
		"\7\22\2\2\u02c0\u02c1\5\u0086D\2\u02c1\u02c2\5t;\2\u02c2\u0315\3\2\2\2"+
		"\u02c3\u02c4\7\21\2\2\u02c4\u02c5\5t;\2\u02c5\u02c6\7\22\2\2\u02c6\u02c7"+
		"\5\u0086D\2\u02c7\u02c8\7N\2\2\u02c8\u0315\3\2\2\2\u02c9\u02ca\7\24\2"+
		"\2\u02ca\u02cb\5\u0086D\2\u02cb\u02cc\5t;\2\u02cc\u0315\3\2\2\2\u02cd"+
		"\u02ce\7\24\2\2\u02ce\u02cf\5t;\2\u02cf\u02d0\7\25\2\2\u02d0\u02d1\5\u0086"+
		"D\2\u02d1\u0315\3\2\2\2\u02d2\u02d3\7\24\2\2\u02d3\u02d4\7H\2\2\u02d4"+
		"\u02d5\5\u0080A\2\u02d5\u02d6\7I\2\2\u02d6\u02d7\5t;\2\u02d7\u0315\3\2"+
		"\2\2\u02d8\u02d9\7\3\2\2\u02d9\u02e3\5l\67\2\u02da\u02dc\5v<\2\u02db\u02da"+
		"\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02e0\3\2\2\2\u02df\u02e1\5z>\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2"+
		"\2\u02e1\u02e4\3\2\2\2\u02e2\u02e4\5z>\2\u02e3\u02db\3\2\2\2\u02e3\u02e2"+
		"\3\2\2\2\u02e4\u0315\3\2\2\2\u02e5\u02e6\7\30\2\2\u02e6\u02e7\5\u0086"+
		"D\2\u02e7\u02eb\7L\2\2\u02e8\u02ea\5|?\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed"+
		"\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f1\3\2\2\2\u02ed"+
		"\u02eb\3\2\2\2\u02ee\u02f0\5~@\2\u02ef\u02ee\3\2\2\2\u02f0\u02f3\3\2\2"+
		"\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02f1"+
		"\3\2\2\2\u02f4\u02f5\7M\2\2\u02f5\u0315\3\2\2\2\u02f6\u02f7\7*\2\2\u02f7"+
		"\u02f8\5\u0086D\2\u02f8\u02f9\5l\67\2\u02f9\u0315\3\2\2\2\u02fa\u02fc"+
		"\7\36\2\2\u02fb\u02fd\5\u008cG\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2"+
		"\2\u02fd\u02fe\3\2\2\2\u02fe\u0315\7N\2\2\u02ff\u0300\7\6\2\2\u0300\u0301"+
		"\5\u008cG\2\u0301\u0302\7N\2\2\u0302\u0315\3\2\2\2\u0303\u0305\7\37\2"+
		"\2\u0304\u0306\7\u0084\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u0315\7N\2\2\u0308\u030a\7\34\2\2\u0309\u030b\7\u0084"+
		"\2\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c"+
		"\u0315\7N\2\2\u030d\u0315\7N\2\2\u030e\u030f\5\u008cG\2\u030f\u0310\7"+
		"N\2\2\u0310\u0315\3\2\2\2\u0311\u0312\7\u0084\2\2\u0312\u0313\7u\2\2\u0313"+
		"\u0315\5t;\2\u0314\u02a9\3\2\2\2\u0314\u02aa\3\2\2\2\u0314\u02b2\3\2\2"+
		"\2\u0314\u02b9\3\2\2\2\u0314\u02bf\3\2\2\2\u0314\u02c3\3\2\2\2\u0314\u02c9"+
		"\3\2\2\2\u0314\u02cd\3\2\2\2\u0314\u02d2\3\2\2\2\u0314\u02d8\3\2\2\2\u0314"+
		"\u02e5\3\2\2\2\u0314\u02f6\3\2\2\2\u0314\u02fa\3\2\2\2\u0314\u02ff\3\2"+
		"\2\2\u0314\u0303\3\2\2\2\u0314\u0308\3\2\2\2\u0314\u030d\3\2\2\2\u0314"+
		"\u030e\3\2\2\2\u0314\u0311\3\2\2\2\u0315u\3\2\2\2\u0316\u0317\7\4\2\2"+
		"\u0317\u031b\7H\2\2\u0318\u031a\5\16\b\2\u0319\u0318\3\2\2\2\u031a\u031d"+
		"\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d"+
		"\u031b\3\2\2\2\u031e\u031f\5x=\2\u031f\u0320\7\u0084\2\2\u0320\u0321\7"+
		"I\2\2\u0321\u0322\5l\67\2\u0322w\3\2\2\2\u0323\u0328\5^\60\2\u0324\u0325"+
		"\7z\2\2\u0325\u0327\5^\60\2\u0326\u0324\3\2\2\2\u0327\u032a\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329y\3\2\2\2\u032a\u0328\3\2\2\2"+
		"\u032b\u032c\7\5\2\2\u032c\u032d\5l\67\2\u032d{\3\2\2\2\u032e\u0330\5"+
		"~@\2\u032f\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u032f\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0334\3\2\2\2\u0333\u0335\5n8\2\u0334\u0333\3\2\2"+
		"\2\u0335\u0336\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337}"+
		"\3\2\2\2\u0338\u033b\7\31\2\2\u0339\u033c\5\u008cG\2\u033a\u033c\7\u0084"+
		"\2\2\u033b\u0339\3\2\2\2\u033b\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"\u0341\7u\2\2\u033e\u033f\7\32\2\2\u033f\u0341\7u\2\2\u0340\u0338\3\2"+
		"\2\2\u0340\u033e\3\2\2\2\u0341\177\3\2\2\2\u0342\u034f\5\u0084C\2\u0343"+
		"\u0345\5\u0082B\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346"+
		"\3\2\2\2\u0346\u0348\7N\2\2\u0347\u0349\5\u008cG\2\u0348\u0347\3\2\2\2"+
		"\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c\7N\2\2\u034b\u034d"+
		"\5\u0088E\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2"+
		"\2\u034e\u0342\3\2\2\2\u034e\u0344\3\2\2\2\u034f\u0081\3\2\2\2\u0350\u0353"+
		"\5p9\2\u0351\u0353\5\u0088E\2\u0352\u0350\3\2\2\2\u0352\u0351\3\2\2\2"+
		"\u0353\u0083\3\2\2\2\u0354\u0356\5\16\b\2\u0355\u0354\3\2\2\2\u0356\u0359"+
		"\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035a\3\2\2\2\u0359"+
		"\u0357\3\2\2\2\u035a\u035b\5\u00acW\2\u035b\u035c\5J&\2\u035c\u035d\t"+
		"\7\2\2\u035d\u035e\5\u008cG\2\u035e\u0085\3\2\2\2\u035f\u0360\7H\2\2\u0360"+
		"\u0361\5\u008cG\2\u0361\u0362\7I\2\2\u0362\u0087\3\2\2\2\u0363\u0368\5"+
		"\u008cG\2\u0364\u0365\7O\2\2\u0365\u0367\5\u008cG\2\u0366\u0364\3\2\2"+
		"\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u0089"+
		"\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u036c\7\u0084\2\2\u036c\u036e\7H\2"+
		"\2\u036d\u036f\5\u0088E\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0386\7I\2\2\u0371\u0372\7:\2\2\u0372\u0374\7H\2"+
		"\2\u0373\u0375\5\u0088E\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0376\3\2\2\2\u0376\u0386\7I\2\2\u0377\u0378\79\2\2\u0378\u037a\7H\2"+
		"\2\u0379\u037b\5\u0088E\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\3\2\2\2\u037c\u0386\7I\2\2\u037d\u037e\7!\2\2\u037e\u037f\7H\2"+
		"\2\u037f\u0380\5\u008cG\2\u0380\u0381\7I\2\2\u0381\u0386\3\2\2\2\u0382"+
		"\u0383\7\"\2\2\u0383\u0384\7H\2\2\u0384\u0386\7I\2\2\u0385\u036b\3\2\2"+
		"\2\u0385\u0371\3\2\2\2\u0385\u0377\3\2\2\2\u0385\u037d\3\2\2\2\u0385\u0382"+
		"\3\2\2\2\u0386\u008b\3\2\2\2\u0387\u0388\bG\1\2\u0388\u03a5\5\u0094K\2"+
		"\u0389\u03a5\5\u008aF\2\u038a\u038b\7\66\2\2\u038b\u03a5\5\u0098M\2\u038c"+
		"\u038d\7H\2\2\u038d\u038e\5\u00acW\2\u038e\u038f\7I\2\2\u038f\u0390\5"+
		"\u008cG\27\u0390\u03a5\3\2\2\2\u0391\u0392\t\b\2\2\u0392\u03a5\5\u008c"+
		"G\25\u0393\u03a5\5\u008eH\2\u0394\u0395\5\u00acW\2\u0395\u039b\7~\2\2"+
		"\u0396\u0398\5\u00b0Y\2\u0397\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u039c\7\u0084\2\2\u039a\u039c\7\66\2\2\u039b\u0397"+
		"\3\2\2\2\u039b\u039a\3\2\2\2\u039c\u03a5\3\2\2\2\u039d\u039e\5\u0096L"+
		"\2\u039e\u03a0\7~\2\2\u039f\u03a1\5\u00b0Y\2\u03a0\u039f\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\7\66\2\2\u03a3\u03a5\3"+
		"\2\2\2\u03a4\u0387\3\2\2\2\u03a4\u0389\3\2\2\2\u03a4\u038a\3\2\2\2\u03a4"+
		"\u038c\3\2\2\2\u03a4\u0391\3\2\2\2\u03a4\u0393\3\2\2\2\u03a4\u0394\3\2"+
		"\2\2\u03a4\u039d\3\2\2\2\u03a5\u03f4\3\2\2\2\u03a6\u03a7\f\24\2\2\u03a7"+
		"\u03a8\t\t\2\2\u03a8\u03f3\5\u008cG\25\u03a9\u03aa\f\23\2\2\u03aa\u03ab"+
		"\t\n\2\2\u03ab\u03f3\5\u008cG\24\u03ac\u03ad\f\22\2\2\u03ad\u03ae\t\13"+
		"\2\2\u03ae\u03f3\5\u008cG\23\u03af\u03b0\f\21\2\2\u03b0\u03b1\t\f\2\2"+
		"\u03b1\u03f3\5\u008cG\22\u03b2\u03b3\f\17\2\2\u03b3\u03b4\t\r\2\2\u03b4"+
		"\u03f3\5\u008cG\20\u03b5\u03b6\f\16\2\2\u03b6\u03b7\7n\2\2\u03b7\u03f3"+
		"\5\u008cG\17\u03b8\u03b9\f\r\2\2\u03b9\u03ba\7p\2\2\u03ba\u03f3\5\u008c"+
		"G\16\u03bb\u03bc\f\f\2\2\u03bc\u03bd\7o\2\2\u03bd\u03f3\5\u008cG\r\u03be"+
		"\u03bf\f\13\2\2\u03bf\u03c0\7k\2\2\u03c0\u03f3\5\u008cG\f\u03c1\u03c2"+
		"\f\n\2\2\u03c2\u03c3\7l\2\2\u03c3\u03f3\5\u008cG\13\u03c4\u03c5\f\t\2"+
		"\2\u03c5\u03c6\7t\2\2\u03c6\u03c7\5\u008cG\2\u03c7\u03c8\7u\2\2\u03c8"+
		"\u03c9\5\u008cG\n\u03c9\u03f3\3\2\2\2\u03ca\u03cb\f\b\2\2\u03cb\u03cc"+
		"\7\26\2\2\u03cc\u03cd\5\u008cG\2\u03cd\u03ce\7t\2\2\u03ce\u03cf\5\u008c"+
		"G\t\u03cf\u03f3\3\2\2\2\u03d0\u03d1\f\7\2\2\u03d1\u03d2\t\16\2\2\u03d2"+
		"\u03f3\5\u008cG\7\u03d3\u03d4\f\33\2\2\u03d4\u03e0\7P\2\2\u03d5\u03e1"+
		"\7\u0084\2\2\u03d6\u03e1\5\u008aF\2\u03d7\u03e1\7:\2\2\u03d8\u03da\7\66"+
		"\2\2\u03d9\u03db\5\u00a8U\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03e1\5\u009cO\2\u03dd\u03de\79\2\2\u03de\u03e1\5"+
		"\u00b2Z\2\u03df\u03e1\5\u00a2R\2\u03e0\u03d5\3\2\2\2\u03e0\u03d6\3\2\2"+
		"\2\u03e0\u03d7\3\2\2\2\u03e0\u03d8\3\2\2\2\u03e0\u03dd\3\2\2\2\u03e0\u03df"+
		"\3\2\2\2\u03e1\u03f3\3\2\2\2\u03e2\u03e3\f\32\2\2\u03e3\u03e4\7J\2\2\u03e4"+
		"\u03e5\5\u008cG\2\u03e5\u03e6\7K\2\2\u03e6\u03f3\3\2\2\2\u03e7\u03e8\f"+
		"\26\2\2\u03e8\u03f3\t\17\2\2\u03e9\u03ea\f\20\2\2\u03ea\u03eb\7\63\2\2"+
		"\u03eb\u03f3\5\u00acW\2\u03ec\u03ed\f\5\2\2\u03ed\u03ef\7~\2\2\u03ee\u03f0"+
		"\5\u00b0Y\2\u03ef\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2"+
		"\2\u03f1\u03f3\7\u0084\2\2\u03f2\u03a6\3\2\2\2\u03f2\u03a9\3\2\2\2\u03f2"+
		"\u03ac\3\2\2\2\u03f2\u03af\3\2\2\2\u03f2\u03b2\3\2\2\2\u03f2\u03b5\3\2"+
		"\2\2\u03f2\u03b8\3\2\2\2\u03f2\u03bb\3\2\2\2\u03f2\u03be\3\2\2\2\u03f2"+
		"\u03c1\3\2\2\2\u03f2\u03c4\3\2\2\2\u03f2\u03ca\3\2\2\2\u03f2\u03d0\3\2"+
		"\2\2\u03f2\u03d3\3\2\2\2\u03f2\u03e2\3\2\2\2\u03f2\u03e7\3\2\2\2\u03f2"+
		"\u03e9\3\2\2\2\u03f2\u03ec\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2"+
		"\2\2\u03f4\u03f5\3\2\2\2\u03f5\u008d\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7"+
		"\u03f8\5\u0090I\2\u03f8\u03f9\7}\2\2\u03f9\u03fa\5\u0092J\2\u03fa\u008f"+
		"\3\2\2\2\u03fb\u040c\7\u0084\2\2\u03fc\u03fe\7H\2\2\u03fd\u03ff\5X-\2"+
		"\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u040c"+
		"\7I\2\2\u0401\u0402\7H\2\2\u0402\u0407\7\u0084\2\2\u0403\u0404\7O\2\2"+
		"\u0404\u0406\7\u0084\2\2\u0405\u0403\3\2\2\2\u0406\u0409\3\2\2\2\u0407"+
		"\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040a\3\2\2\2\u0409\u0407\3\2"+
		"\2\2\u040a\u040c\7I\2\2\u040b\u03fb\3\2\2\2\u040b\u03fc\3\2\2\2\u040b"+
		"\u0401\3\2\2\2\u040c\u0091\3\2\2\2\u040d\u0410\5\u008cG\2\u040e\u0410"+
		"\5l\67\2\u040f\u040d\3\2\2\2\u040f\u040e\3\2\2\2\u0410\u0093\3\2\2\2\u0411"+
		"\u0412\7H\2\2\u0412\u0413\5\u008cG\2\u0413\u0414\7I\2\2\u0414\u0424\3"+
		"\2\2\2\u0415\u0424\7:\2\2\u0416\u0424\79\2\2\u0417\u0424\5`\61\2\u0418"+
		"\u0424\7\u0084\2\2\u0419\u041a\5.\30\2\u041a\u041b\7P\2\2\u041b\u041c"+
		"\7/\2\2\u041c\u0424\3\2\2\2\u041d\u0421\5\u00a8U\2\u041e\u0422\5\u00b4"+
		"[\2\u041f\u0420\7:\2\2\u0420\u0422\5\u00b6\\\2\u0421\u041e\3\2\2\2\u0421"+
		"\u041f\3\2\2\2\u0422\u0424\3\2\2\2\u0423\u0411\3\2\2\2\u0423\u0415\3\2"+
		"\2\2\u0423\u0416\3\2\2\2\u0423\u0417\3\2\2\2\u0423\u0418\3\2\2\2\u0423"+
		"\u0419\3\2\2\2\u0423\u041d\3\2\2\2\u0424\u0095\3\2\2\2\u0425\u0426\5P"+
		")\2\u0426\u0427\7P\2\2\u0427\u0429\3\2\2\2\u0428\u0425\3\2\2\2\u0428\u0429"+
		"\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042c\7\u0084\2\2\u042b\u042d\5\u00b0"+
		"Y\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0097\3\2\2\2\u042e"+
		"\u042f\5\u00a8U\2\u042f\u0430\5\u009aN\2\u0430\u0431\5\u00a0Q\2\u0431"+
		"\u0438\3\2\2\2\u0432\u0435\5\u009aN\2\u0433\u0436\5\u009eP\2\u0434\u0436"+
		"\5\u00a0Q\2\u0435\u0433\3\2\2\2\u0435\u0434\3\2\2\2\u0436\u0438\3\2\2"+
		"\2\u0437\u042e\3\2\2\2\u0437\u0432\3\2\2\2\u0438\u0099\3\2\2\2\u0439\u043b"+
		"\7\u0084\2\2\u043a\u043c\5\u00a4S\2\u043b\u043a\3\2\2\2\u043b\u043c\3"+
		"\2\2\2\u043c\u0444\3\2\2\2\u043d\u043e\7P\2\2\u043e\u0440\7\u0084\2\2"+
		"\u043f\u0441\5\u00a4S\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441"+
		"\u0443\3\2\2\2\u0442\u043d\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2"+
		"\2\2\u0444\u0445\3\2\2\2\u0445\u0449\3\2\2\2\u0446\u0444\3\2\2\2\u0447"+
		"\u0449\5\u00aeX\2\u0448\u0439\3\2\2\2\u0448\u0447\3\2\2\2\u0449\u009b"+
		"\3\2\2\2\u044a\u044c\7\u0084\2\2\u044b\u044d\5\u00a6T\2\u044c\u044b\3"+
		"\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\5\u00a0Q\2"+
		"\u044f\u009d\3\2\2\2\u0450\u046c\7J\2\2\u0451\u0456\7K\2\2\u0452\u0453"+
		"\7J\2\2\u0453\u0455\7K\2\2\u0454\u0452\3\2\2\2\u0455\u0458\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0459\3\2\2\2\u0458\u0456\3\2"+
		"\2\2\u0459\u046d\5N(\2\u045a\u045b\5\u008cG\2\u045b\u0462\7K\2\2\u045c"+
		"\u045d\7J\2\2\u045d\u045e\5\u008cG\2\u045e\u045f\7K\2\2\u045f\u0461\3"+
		"\2\2\2\u0460\u045c\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462"+
		"\u0463\3\2\2\2\u0463\u0469\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u0466\7J"+
		"\2\2\u0466\u0468\7K\2\2\u0467\u0465\3\2\2\2\u0468\u046b\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046d\3\2\2\2\u046b\u0469\3\2"+
		"\2\2\u046c\u0451\3\2\2\2\u046c\u045a\3\2\2\2\u046d\u009f\3\2\2\2\u046e"+
		"\u0470\5\u00b6\\\2\u046f\u0471\5\"\22\2\u0470\u046f\3\2\2\2\u0470\u0471"+
		"\3\2\2\2\u0471\u00a1\3\2\2\2\u0472\u0473\5\u00a8U\2\u0473\u0474\5\u00b4"+
		"[\2\u0474\u00a3\3\2\2\2\u0475\u0476\7v\2\2\u0476\u0479\7w\2\2\u0477\u0479"+
		"\5\u00b0Y\2\u0478\u0475\3\2\2\2\u0478\u0477\3\2\2\2\u0479\u00a5\3\2\2"+
		"\2\u047a\u047b\7v\2\2\u047b\u047e\7w\2\2\u047c\u047e\5\u00a8U\2\u047d"+
		"\u047a\3\2\2\2\u047d\u047c\3\2\2\2\u047e\u00a7\3\2\2\2\u047f\u0480\7v"+
		"\2\2\u0480\u0481\5\u00aaV\2\u0481\u0482\7w\2\2\u0482\u00a9\3\2\2\2\u0483"+
		"\u0488\5\u00acW\2\u0484\u0485\7O\2\2\u0485\u0487\5\u00acW\2\u0486\u0484"+
		"\3\2\2\2\u0487\u048a\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u00ab\3\2\2\2\u048a\u0488\3\2\2\2\u048b\u048e\5P)\2\u048c\u048e\5\u00ae"+
		"X\2\u048d\u048b\3\2\2\2\u048d\u048c\3\2\2\2\u048e\u0493\3\2\2\2\u048f"+
		"\u0490\7J\2\2\u0490\u0492\7K\2\2\u0491\u048f\3\2\2\2\u0492\u0495\3\2\2"+
		"\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u00ad\3\2\2\2\u0495\u0493"+
		"\3\2\2\2\u0496\u0497\t\20\2\2\u0497\u00af\3\2\2\2\u0498\u0499\7v\2\2\u0499"+
		"\u049e\5R*\2\u049a\u049b\7O\2\2\u049b\u049d\5R*\2\u049c\u049a\3\2\2\2"+
		"\u049d\u04a0\3\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a1"+
		"\3\2\2\2\u04a0\u049e\3\2\2\2\u04a1\u04a2\7w\2\2\u04a2\u00b1\3\2\2\2\u04a3"+
		"\u04aa\5\u00b6\\\2\u04a4\u04a5\7P\2\2\u04a5\u04a7\7\u0084\2\2\u04a6\u04a8"+
		"\5\u00b6\\\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04aa\3\2\2"+
		"\2\u04a9\u04a3\3\2\2\2\u04a9\u04a4\3\2\2\2\u04aa\u00b3\3\2\2\2\u04ab\u04ac"+
		"\79\2\2\u04ac\u04b0\5\u00b2Z\2\u04ad\u04ae\7\u0084\2\2\u04ae\u04b0\5\u00b6"+
		"\\\2\u04af\u04ab\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u00b5\3\2\2\2\u04b1"+
		"\u04b3\7H\2\2\u04b2\u04b4\5\u0088E\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3"+
		"\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\7I\2\2\u04b6\u00b7\3\2\2\2\u0092"+
		"\u00b9\u00be\u00c4\u00cf\u00d3\u00da\u00e0\u00e3\u00ea\u00f3\u00f7\u00fb"+
		"\u0105\u010d\u0114\u011b\u011f\u0122\u0125\u012e\u0133\u0136\u013c\u0142"+
		"\u0146\u014e\u0157\u015e\u0164\u0168\u0172\u017b\u0180\u0186\u018a\u0196"+
		"\u019b\u01a4\u01a9\u01b1\u01b9\u01c3\u01cc\u01d3\u01db\u01e0\u01ee\u01f4"+
		"\u01fb\u0200\u0208\u020c\u020e\u0214\u0219\u021d\u0224\u0226\u022d\u0232"+
		"\u023b\u0240\u0243\u0248\u0251\u025d\u0266\u026e\u0276\u0279\u027c\u0287"+
		"\u0291\u0296\u029f\u02a4\u02a7\u02ae\u02b7\u02dd\u02e0\u02e3\u02eb\u02f1"+
		"\u02fc\u0305\u030a\u0314\u031b\u0328\u0331\u0336\u033b\u0340\u0344\u0348"+
		"\u034c\u034e\u0352\u0357\u0368\u036e\u0374\u037a\u0385\u0397\u039b\u03a0"+
		"\u03a4\u03da\u03e0\u03ef\u03f2\u03f4\u03fe\u0407\u040b\u040f\u0421\u0423"+
		"\u0428\u042c\u0435\u0437\u043b\u0440\u0444\u0448\u044c\u0456\u0462\u0469"+
		"\u046c\u0470\u0478\u047d\u0488\u048d\u0493\u049e\u04a7\u04a9\u04af\u04b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}