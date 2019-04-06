// Generated from C:/Users/user/Desktop/proglang\JapperParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JapperParser}.
 */
public interface JapperParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JapperParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JapperParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JapperParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JapperParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JapperParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JapperParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JapperParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JapperParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JapperParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(JapperParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(JapperParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifiers(JapperParser.AccessModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#accessModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifiers(JapperParser.AccessModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JapperParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JapperParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JapperParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JapperParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#genericTypes}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypes(JapperParser.GenericTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#genericTypes}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypes(JapperParser.GenericTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(JapperParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(JapperParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JapperParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JapperParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JapperParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JapperParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JapperParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JapperParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JapperParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JapperParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JapperParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JapperParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JapperParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JapperParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JapperParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JapperParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JapperParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JapperParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JapperParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JapperParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JapperParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JapperParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JapperParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JapperParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(JapperParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(JapperParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#returnTypes}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypes(JapperParser.ReturnTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#returnTypes}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypes(JapperParser.ReturnTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#genericFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericFunctionDeclaration(JapperParser.GenericFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#genericFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericFunctionDeclaration(JapperParser.GenericFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(JapperParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(JapperParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JapperParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JapperParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JapperParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JapperParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JapperParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JapperParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JapperParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JapperParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(JapperParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(JapperParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JapperParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JapperParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#interfaceFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFunctionDeclaration(JapperParser.InterfaceFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#interfaceFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFunctionDeclaration(JapperParser.InterfaceFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#interfaceFunctionModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceFunctionModifier(JapperParser.InterfaceFunctionModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#interfaceFunctionModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceFunctionModifier(JapperParser.InterfaceFunctionModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#genericInterfaceFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceFunctionDeclaration(JapperParser.GenericInterfaceFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#genericInterfaceFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceFunctionDeclaration(JapperParser.GenericInterfaceFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JapperParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JapperParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JapperParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JapperParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JapperParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JapperParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JapperParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JapperParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void enterArrayInit(JapperParser.ArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#arrayInit}.
	 * @param ctx the parse tree
	 */
	void exitArrayInit(JapperParser.ArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JapperParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JapperParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JapperParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JapperParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#variableOrMemberNameList}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrMemberNameList(JapperParser.VariableOrMemberNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#variableOrMemberNameList}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrMemberNameList(JapperParser.VariableOrMemberNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(JapperParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(JapperParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterList(JapperParser.FunctionParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#functionParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterList(JapperParser.FunctionParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(JapperParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(JapperParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#lastFunctionParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFunctionParameter(JapperParser.LastFunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#lastFunctionParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFunctionParameter(JapperParser.LastFunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#variableOrMemberName}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrMemberName(JapperParser.VariableOrMemberNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#variableOrMemberName}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrMemberName(JapperParser.VariableOrMemberNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JapperParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JapperParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JapperParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JapperParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(JapperParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(JapperParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JapperParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JapperParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#elementValueArrayInit}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInit(JapperParser.ElementValueArrayInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#elementValueArrayInit}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInit(JapperParser.ElementValueArrayInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JapperParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JapperParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JapperParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JapperParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JapperParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JapperParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JapperParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JapperParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(JapperParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(JapperParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JapperParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JapperParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(JapperParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(JapperParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JapperParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JapperParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JapperParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JapperParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JapperParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JapperParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JapperParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JapperParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JapperParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JapperParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JapperParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JapperParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#forEach}.
	 * @param ctx the parse tree
	 */
	void enterForEach(JapperParser.ForEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#forEach}.
	 * @param ctx the parse tree
	 */
	void exitForEach(JapperParser.ForEachContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(JapperParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(JapperParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JapperParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JapperParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterVariableFunctionCall(JapperParser.VariableFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitVariableFunctionCall(JapperParser.VariableFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterThisFunctionCall(JapperParser.ThisFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitThisFunctionCall(JapperParser.ThisFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code superFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSuperFunctionCall(JapperParser.SuperFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code superFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSuperFunctionCall(JapperParser.SuperFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(JapperParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(JapperParser.PrintFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterReadFunctionCall(JapperParser.ReadFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitReadFunctionCall(JapperParser.ReadFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JapperParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JapperParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JapperParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JapperParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JapperParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JapperParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JapperParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JapperParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JapperParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JapperParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JapperParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JapperParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JapperParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JapperParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(JapperParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(JapperParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JapperParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JapperParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JapperParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JapperParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JapperParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JapperParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(JapperParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(JapperParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JapperParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JapperParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JapperParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JapperParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(JapperParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(JapperParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#dataTypeList}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeList(JapperParser.DataTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#dataTypeList}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeList(JapperParser.DataTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(JapperParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(JapperParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#primitiveDataTypes}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataTypes(JapperParser.PrimitiveDataTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#primitiveDataTypes}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataTypes(JapperParser.PrimitiveDataTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JapperParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JapperParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(JapperParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(JapperParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(JapperParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(JapperParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JapperParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JapperParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JapperParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JapperParser.ArgumentsContext ctx);
}