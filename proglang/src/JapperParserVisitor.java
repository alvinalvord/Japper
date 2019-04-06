// Generated from C:/Users/user/Desktop/proglang\JapperParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JapperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JapperParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JapperParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JapperParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JapperParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JapperParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JapperParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(JapperParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#accessModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifiers(JapperParser.AccessModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JapperParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JapperParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#genericTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypes(JapperParser.GenericTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(JapperParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JapperParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JapperParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(JapperParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JapperParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JapperParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JapperParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JapperParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JapperParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JapperParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JapperParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JapperParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(JapperParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#returnTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnTypes(JapperParser.ReturnTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#genericFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFunctionDeclaration(JapperParser.GenericFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(JapperParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JapperParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JapperParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(JapperParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JapperParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(JapperParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(JapperParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#interfaceFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceFunctionDeclaration(JapperParser.InterfaceFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#interfaceFunctionModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceFunctionModifier(JapperParser.InterfaceFunctionModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#genericInterfaceFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceFunctionDeclaration(JapperParser.GenericInterfaceFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JapperParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JapperParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JapperParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JapperParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#arrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInit(JapperParser.ArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JapperParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JapperParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#variableOrMemberNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMemberNameList(JapperParser.VariableOrMemberNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(JapperParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#functionParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterList(JapperParser.FunctionParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(JapperParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#lastFunctionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFunctionParameter(JapperParser.LastFunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#variableOrMemberName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrMemberName(JapperParser.VariableOrMemberNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JapperParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(JapperParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(JapperParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JapperParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#elementValueArrayInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInit(JapperParser.ElementValueArrayInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JapperParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JapperParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JapperParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JapperParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(JapperParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JapperParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(JapperParser.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JapperParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(JapperParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JapperParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JapperParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JapperParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JapperParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#forEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEach(JapperParser.ForEachContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#parenthesisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(JapperParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JapperParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableFunctionCall(JapperParser.VariableFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisFunctionCall(JapperParser.ThisFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code superFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperFunctionCall(JapperParser.SuperFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunctionCall(JapperParser.PrintFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readFunctionCall}
	 * labeled alternative in {@link JapperParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFunctionCall(JapperParser.ReadFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JapperParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JapperParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(JapperParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(JapperParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JapperParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JapperParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JapperParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(JapperParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(JapperParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(JapperParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(JapperParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(JapperParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JapperParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(JapperParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(JapperParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#dataTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeList(JapperParser.DataTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(JapperParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#primitiveDataTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataTypes(JapperParser.PrimitiveDataTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JapperParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(JapperParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(JapperParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JapperParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JapperParser.ArgumentsContext ctx);
}