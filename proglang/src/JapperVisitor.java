import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.concurrent.*;

public class JapperVisitor extends JapperParserBaseVisitor <JapperObject> {

	private BufferedReader bufferedReader;
	private JapperScope scope;
	private Map<String, JapperFunction> functions;
	private JapperParser.CatchBlockContext catchBlockContext;
	private boolean isTrying;

	public JapperVisitor (JapperScope scope, Map<String, JapperFunction> functions) {
		bufferedReader = new BufferedReader (new InputStreamReader (System.in));
		this.scope = scope;
		this.functions = functions;
		this.isTrying = false;
	}

	@Override public JapperObject visitCompilationUnit(JapperParser.CompilationUnitContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public JapperObject visitPackageDeclaration (JapperParser.PackageDeclarationContext ctx) {
		return super.visitPackageDeclaration (ctx);
	}

	@Override
	public JapperObject visitImportDeclaration (JapperParser.ImportDeclarationContext ctx) {
		return super.visitImportDeclaration (ctx);
	}

	@Override
	public JapperObject visitTypeDeclaration (JapperParser.TypeDeclarationContext ctx) {
		return super.visitTypeDeclaration (ctx);
	}

	@Override
	public JapperObject visitClassModifier (JapperParser.ClassModifierContext ctx) {
		return super.visitClassModifier (ctx);
	}

	@Override
	public JapperObject visitAccessModifiers (JapperParser.AccessModifiersContext ctx) {
		return super.visitAccessModifiers (ctx);
	}

	@Override
	public JapperObject visitVariableModifier (JapperParser.VariableModifierContext ctx) {
		return super.visitVariableModifier (ctx);
	}

	@Override
	public JapperObject visitClassDeclaration (JapperParser.ClassDeclarationContext ctx) {
		return super.visitClassDeclaration (ctx);
	}

	@Override
	public JapperObject visitGenericTypes (JapperParser.GenericTypesContext ctx) {
		return super.visitGenericTypes (ctx);
	}

	@Override
	public JapperObject visitGenericType (JapperParser.GenericTypeContext ctx) {
		return super.visitGenericType (ctx);
	}

	@Override
	public JapperObject visitTypeBound (JapperParser.TypeBoundContext ctx) {
		return super.visitTypeBound (ctx);
	}

	@Override
	public JapperObject visitEnumDeclaration (JapperParser.EnumDeclarationContext ctx) {
		return super.visitEnumDeclaration (ctx);
	}

	@Override
	public JapperObject visitEnumConstants (JapperParser.EnumConstantsContext ctx) {
		return super.visitEnumConstants (ctx);
	}

	@Override
	public JapperObject visitEnumConstant (JapperParser.EnumConstantContext ctx) {
		return super.visitEnumConstant (ctx);
	}

	@Override
	public JapperObject visitEnumBodyDeclarations (JapperParser.EnumBodyDeclarationsContext ctx) {
		return super.visitEnumBodyDeclarations (ctx);
	}

	@Override
	public JapperObject visitInterfaceDeclaration (JapperParser.InterfaceDeclarationContext ctx) {
		return super.visitInterfaceDeclaration (ctx);
	}

	@Override
	public JapperObject visitClassBody (JapperParser.ClassBodyContext ctx) {
		return super.visitClassBody (ctx);
	}

	@Override
	public JapperObject visitInterfaceBody (JapperParser.InterfaceBodyContext ctx) {
		return super.visitInterfaceBody (ctx);
	}

	@Override
	public JapperObject visitClassBodyDeclaration (JapperParser.ClassBodyDeclarationContext ctx) {
		return super.visitClassBodyDeclaration (ctx);
	}

	@Override
	public JapperObject visitMemberDeclaration (JapperParser.MemberDeclarationContext ctx) {
		return super.visitMemberDeclaration (ctx);
	}

	@Override
	public JapperObject visitFunctionDeclaration (JapperParser.FunctionDeclarationContext ctx) {
		return JapperObject.VOID;
	}

	@Override
	public JapperObject visitFunctionBody (JapperParser.FunctionBodyContext ctx) {
		return super.visitFunctionBody (ctx);
	}

	@Override
	public JapperObject visitReturnTypes (JapperParser.ReturnTypesContext ctx) {
		return super.visitReturnTypes (ctx);
	}

	@Override
	public JapperObject visitGenericFunctionDeclaration (JapperParser.GenericFunctionDeclarationContext ctx) {
		return super.visitGenericFunctionDeclaration (ctx);
	}

	@Override
	public JapperObject visitGenericConstructorDeclaration (JapperParser.GenericConstructorDeclarationContext ctx) {
		return super.visitGenericConstructorDeclaration (ctx);
	}

	@Override
	public JapperObject visitConstructorDeclaration (JapperParser.ConstructorDeclarationContext ctx) {
		return super.visitConstructorDeclaration (ctx);
	}

	@Override
	public JapperObject visitFieldDeclaration (JapperParser.FieldDeclarationContext ctx) {
		return super.visitFieldDeclaration (ctx);
	}

	@Override
	public JapperObject visitInterfaceBodyDeclaration (JapperParser.InterfaceBodyDeclarationContext ctx) {
		return super.visitInterfaceBodyDeclaration (ctx);
	}

	@Override
	public JapperObject visitInterfaceMemberDeclaration (JapperParser.InterfaceMemberDeclarationContext ctx) {
		return super.visitInterfaceMemberDeclaration (ctx);
	}

	@Override
	public JapperObject visitConstDeclaration (JapperParser.ConstDeclarationContext ctx) {
		return super.visitConstDeclaration (ctx);
	}

	@Override
	public JapperObject visitConstantDeclarator (JapperParser.ConstantDeclaratorContext ctx) {
		return super.visitConstantDeclarator (ctx);
	}

	@Override
	public JapperObject visitInterfaceFunctionDeclaration (JapperParser.InterfaceFunctionDeclarationContext ctx) {
		return super.visitInterfaceFunctionDeclaration (ctx);
	}

	@Override
	public JapperObject visitInterfaceFunctionModifier (JapperParser.InterfaceFunctionModifierContext ctx) {
		return super.visitInterfaceFunctionModifier (ctx);
	}

	@Override
	public JapperObject visitGenericInterfaceFunctionDeclaration (JapperParser.GenericInterfaceFunctionDeclarationContext ctx) {
		return super.visitGenericInterfaceFunctionDeclaration (ctx);
	}

	@Override
	public JapperObject visitVariableDeclarators (JapperParser.VariableDeclaratorsContext ctx) {
		return super.visitVariableDeclarators (ctx);
	}

	@Override
	public JapperObject visitVariableDeclarator (JapperParser.VariableDeclaratorContext ctx) {
		return super.visitVariableDeclarator (ctx);
	}

	@Override
	public JapperObject visitVariableDeclaratorId (JapperParser.VariableDeclaratorIdContext ctx) {
		return super.visitVariableDeclaratorId (ctx);
	}

	@Override
	public JapperObject visitVariableInitializer (JapperParser.VariableInitializerContext ctx) {
		return super.visitVariableInitializer (ctx);
	}

	@Override
	public JapperObject visitArrayInit (JapperParser.ArrayInitContext ctx) {
		int elements = 0;

		if (ctx.variableInitializer () != null) {
			elements = ctx.variableInitializer ().size ();
		}

		Object[] arr = new Object[elements];

		if (ctx.variableInitializer () != null) {
			for (int i = 0; i < ctx.variableInitializer ().size (); i++) {
				arr[i] = visit (ctx.variableInitializer (i).expression ()).asObject ();
			}
		}

		return new JapperObject (arr);
	}

	@Override
	public JapperObject visitClassOrInterfaceType (JapperParser.ClassOrInterfaceTypeContext ctx) {
		return super.visitClassOrInterfaceType (ctx);
	}

	@Override
	public JapperObject visitTypeArgument (JapperParser.TypeArgumentContext ctx) {
		return super.visitTypeArgument (ctx);
	}

	@Override
	public JapperObject visitVariableOrMemberNameList (JapperParser.VariableOrMemberNameListContext ctx) {
		return super.visitVariableOrMemberNameList (ctx);
	}

	@Override
	public JapperObject visitFunctionParameters (JapperParser.FunctionParametersContext ctx) {
		return super.visitFunctionParameters (ctx);
	}

	@Override
	public JapperObject visitFunctionParameterList (JapperParser.FunctionParameterListContext ctx) {
		return super.visitFunctionParameterList (ctx);
	}

	@Override
	public JapperObject visitFunctionParameter (JapperParser.FunctionParameterContext ctx) {
		return super.visitFunctionParameter (ctx);
	}

	@Override
	public JapperObject visitLastFunctionParameter (JapperParser.LastFunctionParameterContext ctx) {
		return super.visitLastFunctionParameter (ctx);
	}

	@Override
	public JapperObject visitVariableOrMemberName (JapperParser.VariableOrMemberNameContext ctx) {
		return super.visitVariableOrMemberName (ctx);
	}

	@Override public JapperObject visitLiteral(JapperParser.LiteralContext ctx) {
		String value = ctx.getText ();

		if (ctx.NullVal () != null) return JapperObject.NULL;
		else if (ctx.BoolVal () != null) {
			if (value.equalsIgnoreCase ("true") || value.equalsIgnoreCase ("yes")) return new JapperObject (true);
			else return new JapperObject (false);
		} else if (ctx.StringVal () != null) {
			return new JapperObject (value.substring (1, value.length () - 1));
		} else if (ctx.CharVal () != null) {
			return new JapperObject (value.charAt (1));
		}

		return super.visitLiteral (ctx);
	}

	@Override public JapperObject visitIntegerLiteral(JapperParser.IntegerLiteralContext ctx) {
		String value = ctx.getText ().toLowerCase ();
		int radix = 16;
		if (ctx.BinVal () != null) {
			radix = 2;
		} else if (ctx.QuatVal () != null) {
			value = value
					.replaceAll ("a", "0")
					.replaceAll ("c", "1")
					.replaceAll ("g", "2")
					.replaceAll ("t", "3");
			radix = 4;
		} else if (ctx.OctVal () != null) {
			radix = 8;
		} else if (ctx.DecVal () != null) {
			radix = 10;
		}

		if (value.endsWith ("l")) {
			if (radix == 10)
				return new JapperObject (new BigInteger (value.substring (0, value.length () - 1), radix).longValue
					());
			else
				return new JapperObject (new BigInteger (value.substring (2, value.length () - 1), radix).longValue
					());
		} else {
			if (radix == 10)
				return new JapperObject (new BigInteger (value, radix).intValue ());
			else
				return new JapperObject (new BigInteger (value.substring (2), radix).intValue ());
		}
	}

	@Override public JapperObject visitFloatLiteral(JapperParser.FloatLiteralContext ctx) {
		String value = ctx.getText ().toLowerCase ();

		if (value.endsWith ("f")) {
			value = value.substring (0, value.length () - 1);
			return new JapperObject (new BigDecimal (value).floatValue ());
		} else {
			if (value.endsWith ("d")) value = value.substring (0, value.length () - 1);
			return new JapperObject (new BigDecimal (value).doubleValue ());
		}
	}

	@Override
	public JapperObject visitElementValue (JapperParser.ElementValueContext ctx) {
		return super.visitElementValue (ctx);
	}

	@Override
	public JapperObject visitElementValueArrayInit (JapperParser.ElementValueArrayInitContext ctx) {
		return super.visitElementValueArrayInit (ctx);
	}

	@Override
	public JapperObject visitDefaultValue (JapperParser.DefaultValueContext ctx) {
		return super.visitDefaultValue (ctx);
	}

	@Override
	public JapperObject visitBlock (JapperParser.BlockContext ctx) {
		scope = new JapperScope (scope);
		for (JapperParser.BlockStatementContext bs :ctx.blockStatement ()) {
			visit (bs);
		}

		scope = scope.getParent ();

		return JapperObject.VOID;
	}

	@Override
	public JapperObject visitBlockStatement (JapperParser.BlockStatementContext ctx) {
		return super.visitBlockStatement (ctx);
	}

	@Override
	public JapperObject visitLocalVariableDeclaration (JapperParser.LocalVariableDeclarationContext ctx) {

		try {
			if (ctx.variableModifier (0).Final () != null) {
				String name = ctx.variableDeclarators ().variableDeclarator (0).variableDeclaratorId ().VariableName ().getText ();
				JapperObject value = visit (ctx.variableDeclarators ().variableDeclarator (0).variableInitializer ());
				value.setConstant ();
				scope.assignConstant (name, value);
			}
		} catch (Exception e) {}

		return JapperObject.VOID;
//		return super.visitLocalVariableDeclaration (ctx);
	}

	@Override
	public JapperObject visitLocalTypeDeclaration (JapperParser.LocalTypeDeclarationContext ctx) {
		return super.visitLocalTypeDeclaration (ctx);
	}

	@Override
	public JapperObject visitStatement (JapperParser.StatementContext ctx) {

		if (ctx.If () != null) {
			JapperObject condition = visit (ctx.parenthesisExpression ().expression ());

			if (condition.asBoolean ())
				return visit (ctx.statement (0));
			else if (ctx.statement ().size () > 1)
				return visit (ctx.statement (1));
			return JapperObject.VOID;
		}

		if (ctx.Loop () != null) {
			if (ctx.forControl () != null) { //for
				if (ctx.forControl ().forInit () != null) {
					visit (ctx.forControl ().forInit ());
				}
				boolean condition = true;

				if (ctx.forControl ().expression () != null) {
					condition = visit (ctx.forControl ().expression ()).asBoolean ();
				}

				while (condition) {
					visit (ctx.statement (0));
					if (ctx.forControl ().forUpdate != null)
						visit (ctx.forControl ().forUpdate);

					if (ctx.forControl ().expression () != null) {
						condition = visit (ctx.forControl ().expression ()).asBoolean ();
					}
				}
				return JapperObject.VOID;
			} else if (ctx.Until () != null) { //do while
				do {
					visit (ctx.statement (0));
				} while (visit (ctx.parenthesisExpression ().expression ()).asBoolean ());

				return JapperObject.VOID;
			} else { // while
				while (visit (ctx.parenthesisExpression ().expression ()).asBoolean ()) {
					visit (ctx.statement (0));
				}
				return JapperObject.VOID;
			}
		}

		if (ctx.Try () != null) {
			try {
				String exception = ctx.catchBlock (0).catchType ().variableOrMemberName (0).VariableName (0).getText ();
				String exceptionVar = ctx.catchBlock (0).VariableName ().getText ();
				String ae = "brodie an arithmetic exception occured. don't divide by 0 or something.";
				String iob = "brodie array index sobra na. tama na lumampas ka na";
				String npe = "brodie your object is null";

				switch (exception) {
					case "AE": scope.assign (exceptionVar, new JapperObject (ae));
					break;
					case "IOB": scope.assign (exceptionVar, new JapperObject (iob));
					break;
					case "NPE": scope.assign (exceptionVar, new JapperObject (npe));
					break;
				}

				if (exception.equalsIgnoreCase ("AE") || exception.equalsIgnoreCase ("IOB") || exception.equalsIgnoreCase ("NPE")) {
					isTrying = true;
					catchBlockContext = ctx.catchBlock (0);
				}

				visit (ctx.block ());
				if (ctx.finallyBlock () != null)
					visit (ctx.finallyBlock ().block ());

				return JapperObject.VOID;
			} catch (Exception e ) {}
		}

		if (ctx.Return () != null) {
			if (ctx.expression () != null) {
				ReturnValue rv = new ReturnValue ();
				rv.value = visit (ctx.expression (0));
				throw rv;
			} else {
				ReturnValue rv = new ReturnValue ();
				rv.value = JapperObject.VOID;
				throw rv;
			}
		}

		return super.visitStatement (ctx);
	}

	@Override
	public JapperObject visitCatchBlock (JapperParser.CatchBlockContext ctx) {
		return super.visitCatchBlock (ctx);
	}

	@Override
	public JapperObject visitCatchType (JapperParser.CatchTypeContext ctx) {
		return super.visitCatchType (ctx);
	}

	@Override
	public JapperObject visitFinallyBlock (JapperParser.FinallyBlockContext ctx) {
		return super.visitFinallyBlock (ctx);
	}

	@Override
	public JapperObject visitSwitchBlockStatementGroup (JapperParser.SwitchBlockStatementGroupContext ctx) {
		return super.visitSwitchBlockStatementGroup (ctx);
	}

	@Override
	public JapperObject visitSwitchLabel (JapperParser.SwitchLabelContext ctx) {
		return super.visitSwitchLabel (ctx);
	}

	@Override
	public JapperObject visitForControl (JapperParser.ForControlContext ctx) {
		return super.visitForControl (ctx);
	}

	@Override
	public JapperObject visitForInit (JapperParser.ForInitContext ctx) {
		return super.visitForInit (ctx);
	}

	@Override
	public JapperObject visitForEach (JapperParser.ForEachContext ctx) {
		return super.visitForEach (ctx);
	}

	@Override
	public JapperObject visitParenthesisExpression (JapperParser.ParenthesisExpressionContext ctx) {
		return super.visitParenthesisExpression (ctx);
	}

	@Override
	public JapperObject visitExpressionList (JapperParser.ExpressionListContext ctx) {
		return super.visitExpressionList (ctx);
	}

	@Override
	public JapperObject visitVariableFunctionCall (JapperParser.VariableFunctionCallContext ctx) {
		List<JapperParser.ExpressionContext> params = null;

		try {
			params = ctx.expressionList ().expression ();
		} catch (Exception e) {}

		if (params == null) {
			params = new ArrayList<> ();
		}

		String functionName = ctx.VariableName ().getText () + params.size ();
		JapperFunction function = functions.get (functionName);

		if (function != null) {
			return function.invoke (params, functions, scope);
		}

		throw new EvaluationException (ctx);
	}

	@Override
	public JapperObject visitThisFunctionCall (JapperParser.ThisFunctionCallContext ctx) {
		return super.visitThisFunctionCall (ctx);
	}

	@Override
	public JapperObject visitSuperFunctionCall (JapperParser.SuperFunctionCallContext ctx) {
		return super.visitSuperFunctionCall (ctx);
	}

	@Override
	public JapperObject visitPrintFunctionCall (JapperParser.PrintFunctionCallContext ctx) {
		JapperObject object = visit (ctx.expression ());

		if (object != null && object.isString ())
			System.out.print (object.asString ().replaceAll ("\\\\n", "\n"));
		else
			System.out.print (object);
		return JapperObject.VOID;
	}

	@Override
	public JapperObject visitReadFunctionCall (JapperParser.ReadFunctionCallContext ctx) {
		try {
			return new JapperObject (bufferedReader.readLine ());
		} catch (IOException e) {
			throw new EvaluationException ("failed to read input", ctx);
		}
	}

	@SuppressWarnings("Duplicates")
	@Override
	public JapperObject visitExpression(JapperParser.ExpressionContext ctx) {
		// array access or array type cast
		if (ctx.OpenSqBrack () != null &&
				ctx.CloseSqBrack () != null) {
			if (ctx.OpenPare () != null && ctx.ClosePare () != null) {
				JapperParser.PrimitiveDataTypesContext dataType = ctx.dataType ().primitiveDataTypes ();
				JapperObject object = visit (ctx.expression (0));

				if (dataType.Char () != null) {
					return new JapperObject (object.asCharArray ());
				} else if (dataType.Boolean () != null) {
					return new JapperObject (object.asBooleanArray ());
				} else if (dataType.Bit2 () != null) {
					return new JapperObject (object.asIntArray ());
				} else if (dataType.Byte () != null) {
					return new JapperObject (object.asByteArray ());
				} else if (dataType.Short () != null) {
					return new JapperObject (object.asIntArray ());
				} else if (dataType.Int () != null) {
					return new JapperObject (object.asIntArray ());
				} else if (dataType.Long () != null) {
					return new JapperObject (object.asLongArray ());
				} else if (dataType.Float () != null) {
					return new JapperObject (object.asFloatArray ());
				} else if (dataType.Double () != null) {
					return new JapperObject (object.asDoubleArray ());
				}
			}
			else {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				if (lhs.isList ()) {
					return new JapperObject (lhs.asList ().get (rhs.asInt ()));
				}

				if (lhs.isArray ()) {
					if (isTrying) {
						try {
							return new JapperObject (lhs.asArray ()[rhs.asInt ()]);
						} catch (ArrayIndexOutOfBoundsException e) {
							visit (catchBlockContext.block ());
							isTrying = false;
							return JapperObject.VOID;
						}
					} else {
						return new JapperObject (lhs.asArray ()[rhs.asInt ()]);
					}
				}

				throw new EvaluationException ("Illegal cast to array type ", ctx);
			}
		}

		// type cast
		if (ctx.OpenPare () != null && ctx.ClosePare () != null) {
			JapperParser.PrimitiveDataTypesContext dataType = ctx.dataType ().primitiveDataTypes ();
			JapperObject object = visit (ctx.expression (0));

			if (dataType.Char () != null) {
				return new JapperObject (object.asChar ());
			} else if (dataType.Boolean () != null) {
				return new JapperObject (object.asBoolean ());
			} else if (dataType.Bit2 () != null) {
				return new JapperObject (object.asInt ());
			} else if (dataType.Byte () != null) {
				return new JapperObject (object.asByte ());
			} else if (dataType.Short () != null) {
				return new JapperObject (object.asInt ());
			} else if (dataType.Int () != null) {
				return new JapperObject (object.asInt ());
			} else if (dataType.Long () != null) {
				return new JapperObject (object.asLong ());
			} else if (dataType.Float () != null) {
				return new JapperObject (object.asFloat ());
			} else if (dataType.Double () != null) {
				return new JapperObject (object.asDouble ());
			}
		}

		// postfix
		if (ctx.postfix != null) {
			if (ctx.postfix.getType () == JapperParser.Increment) {
				JapperObject object = visit (ctx.expression (0));
				object.increment ();
				return object;
			} else if (ctx.postfix.getType () == JapperParser.Decrement) {
				JapperObject object = visit (ctx.expression (0));
				object.decrement ();
				return object;
			}
		}

		// prefix
		if (ctx.prefix != null) {
			if (ctx.prefix.getType () == JapperParser.Increment) {
				JapperObject object = visit (ctx.expression (0));
				object.increment ();
				return object;
			} else if (ctx.prefix.getType () == JapperParser.Decrement) {
				JapperObject object = visit (ctx.expression (0));
				object.decrement ();
				return object;
			} else if (ctx.prefix.getType () == JapperParser.Plus) {
				return visit (ctx.expression (0));
			} else if (ctx.prefix.getType () == JapperParser.Minus) {
				JapperObject object = visit (ctx.expression (0));
				object.negate ();
				return object;
			} else if (ctx.prefix.getType () == JapperParser.Negation) {
				JapperObject object = visit (ctx.expression (0));
				object.negate ();
				return object;
			} else if (ctx.prefix.getType () == JapperParser.BitwiseNot) {
				JapperObject object = visit (ctx.expression (0));
				object.bitNot ();
				return object;
			}
		}

		// times divide modulo
		if (ctx.bop != null) {
			if (ctx.bop.getType () == JapperParser.Times) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				if (lhs.isDouble () || rhs.isDouble ()) {
					return new JapperObject (lhs.asDouble () * rhs.asDouble ());
				} else if (lhs.isFloat () || rhs.isFloat ()) {
					return new JapperObject (lhs.asFloat () * rhs.asFloat ());
				} else if (lhs.isLong () || rhs.isLong ()) {
					return new JapperObject (lhs.asLong () * rhs.asLong ());
				} else if (lhs.isInt () || rhs.isInt ()) {
					if (Integer.bitCount (rhs.asInt ()) == 1) {
						return new JapperObject (lhs.asInt () << Integer.numberOfTrailingZeros (Integer.highestOneBit (rhs.asInt ())));
					} else
						return new JapperObject (lhs.asInt () * rhs.asInt ());
				} else {
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
				}
			} else if (ctx.bop.getType () == JapperParser.Divide) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				if (rhs.isNumber () && rhs.asInt () == 0) {
					visit (catchBlockContext.block ());
					return JapperObject.VOID;
				}

				if (lhs.isDouble () || rhs.isDouble ()) {
					return new JapperObject (lhs.asDouble () / rhs.asDouble ());
				} else if (lhs.isFloat () || rhs.isFloat ()) {
					return new JapperObject (lhs.asFloat () / rhs.asFloat ());
				} else if (lhs.isLong () || rhs.isLong ()) {
					return new JapperObject (lhs.asLong () / rhs.asLong ());
				} else if (lhs.isInt () || rhs.isInt ()) {
					if (Integer.bitCount (rhs.asInt ()) == 1) {
						return new JapperObject (lhs.asInt () >> Integer.numberOfTrailingZeros (Integer.highestOneBit (rhs.asInt ())));
					} else
						return new JapperObject (lhs.asInt () / rhs.asInt ());
				} else {
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
				}
			} else if (ctx.bop.getType () == JapperParser.Modulo) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				if (lhs.isDouble () || rhs.isDouble ()) {
					return new JapperObject (lhs.asDouble () % rhs.asDouble ());
				} else if (lhs.isFloat () || rhs.isFloat ()) {
					return new JapperObject (lhs.asFloat () % rhs.asFloat ());
				} else if (lhs.isLong () || rhs.isLong ()) {
					return new JapperObject (lhs.asLong () % rhs.asLong ());
				} else if (lhs.isInt () || rhs.isInt ()) {
					return new JapperObject (lhs.asInt () % rhs.asInt ());
				} else {
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
				}
			}
		}

		// add sub
		if (ctx.bop != null) {
			if (ctx.bop.getType () == JapperParser.Plus) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				if (lhs.isString () || rhs.isString ()) {
					return new JapperObject (lhs.asString () + rhs.asString ());
				} else if (lhs.isDouble () || rhs.isDouble ()) {
					return new JapperObject (lhs.asDouble () + rhs.asDouble ());
				} else if (lhs.isFloat () || rhs.isFloat ()) {
					return new JapperObject (lhs.asFloat () + rhs.asFloat ());
				} else if (lhs.isLong () || rhs.isLong ()) {
					return new JapperObject (lhs.asLong () + rhs.asLong ());
				} else if (lhs.isInt () || rhs.isInt ()) {
					return new JapperObject (lhs.asInt () + rhs.asInt ());
				} else {
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
				}
			} else if (ctx.bop.getType () == JapperParser.Minus) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				if (lhs.isDouble () || rhs.isDouble ()) {
					return new JapperObject (lhs.asDouble () - rhs.asDouble ());
				} else if (lhs.isFloat () || rhs.isFloat ()) {
					return new JapperObject (lhs.asFloat () - rhs.asFloat ());
				} else if (lhs.isLong () || rhs.isLong ()) {
					return new JapperObject (lhs.asLong () - rhs.asLong ());
				} else if (lhs.isInt () || rhs.isInt ()) {
					return new JapperObject (lhs.asInt () - rhs.asInt ());
				} else {
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
				}
			}
		}

		//shl shr sra
		if (ctx.ShiftLeftLogical () != null) {
			JapperObject lhs = visit (ctx.expression (0));
			JapperObject rhs = visit (ctx.expression (1));

			if (isTrying) {
				if (lhs == null || rhs == null) {
					visit (catchBlockContext.block ());
					isTrying = false;
					return JapperObject.VOID;
				}
			}

			if (lhs.isLong () && (rhs.isInt () || rhs.isLong ())) {
				return new JapperObject (lhs.asLong () << rhs.asInt ());
			} else if (lhs.isInt () && (rhs.isInt () || rhs.isLong ())) {
				return new JapperObject (lhs.asInt () << rhs.asInt ());
			} else {
				throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			}
		} else if (ctx.ShiftRightLogical () != null) {
			JapperObject lhs = visit (ctx.expression (0));
			JapperObject rhs = visit (ctx.expression (1));

			if (isTrying) {
				if (lhs == null || rhs == null) {
					visit (catchBlockContext.block ());
					isTrying = false;
					return JapperObject.VOID;
				}
			}

			if (lhs.isLong () && (rhs.isInt () || rhs.isLong ())) {
				return new JapperObject (lhs.asLong () >> rhs.asInt ());
			} else if (lhs.isInt () && (rhs.isInt () || rhs.isLong ())) {
				return new JapperObject (lhs.asInt () >> rhs.asInt ());
			} else {
				throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			}
		} else if (ctx.ShiftRightArithmetic () != null) {
			JapperObject lhs = visit (ctx.expression (0));
			JapperObject rhs = visit (ctx.expression (1));

			if (isTrying) {
				if (lhs == null || rhs == null) {
					visit (catchBlockContext.block ());
					isTrying = false;
					return JapperObject.VOID;
				}
			}

			if (lhs.isLong () && (rhs.isInt () || rhs.isLong ())) {
				return new JapperObject (lhs.asLong () >>> rhs.asInt ());
			} else if (lhs.isInt () && (rhs.isInt () || rhs.isLong ())) {
				return new JapperObject (lhs.asInt () >>> rhs.asInt ());
			} else {
				throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			}
		}

		// lt lte gt gte
		if (ctx.bop != null) {
			if (ctx.bop.getType () == JapperParser.Less) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				return new JapperObject (lhs.compareTo (rhs) < 0);
			} else if (ctx.bop.getType () == JapperParser.LessEqual) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				return new JapperObject (lhs.compareTo (rhs) <= 0);
			} else if (ctx.bop.getType () == JapperParser.Greater) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				return new JapperObject (lhs.compareTo (rhs) > 0);
			} else if (ctx.bop.getType () == JapperParser.GreaterEqual) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				return new JapperObject (lhs.compareTo (rhs) >= 0);
			}
		}

		if (ctx.bop != null) {
			if (ctx.bop.getType () == JapperParser.Equal) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				return new JapperObject (lhs.equals (rhs));
			} else if (ctx.bop.getType () == JapperParser.NotEqual) {
				JapperObject lhs = visit (ctx.expression (0));
				JapperObject rhs = visit (ctx.expression (1));

				if (isTrying) {
					if (lhs == null || rhs == null) {
						visit (catchBlockContext.block ());
						isTrying = false;
						return JapperObject.VOID;
					}
				}

				return new JapperObject (!lhs.equals (rhs));
			}
		}

		//bit and
		if (ctx.BitwiseAnd () != null) {
			JapperObject lhs = visit (ctx.expression (0));
			JapperObject rhs = visit (ctx.expression (1));

			if (isTrying) {
				if (lhs == null || rhs == null) {
					visit (catchBlockContext.block ());
					isTrying = false;
					return JapperObject.VOID;
				}
			}

			if (lhs.isLong ()) {
				if (rhs.isLong () || rhs.isInt ())
					return new JapperObject (lhs.asLong () & rhs.asLong ());
				else
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			} else if (lhs.isInt ()) {
				if (rhs.isLong ()) {
					return new JapperObject (lhs.asLong () & rhs.asLong ());
				} else if (rhs.isInt ()) {
					return new JapperObject (lhs.asInt () & rhs.asInt ());
				} else {
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
				}
			} else {
				throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			}
		}

		// bit xor
		if (ctx.BitwiseXor () != null) {
			JapperObject lhs = visit (ctx.expression (0));
			JapperObject rhs = visit (ctx.expression (1));

			if (isTrying) {
				if (lhs == null || rhs == null) {
					visit (catchBlockContext.block ());
					isTrying = false;
					return JapperObject.VOID;
				}
			}

			if (lhs.isLong ()) {
				if (rhs.isLong () || rhs.isInt ())
					return new JapperObject (lhs.asLong () ^ rhs.asLong ());
				else
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			} else if (lhs.isInt ()) {
				if (rhs.isLong ()) {
					return new JapperObject (lhs.asLong () ^ rhs.asLong ());
				} else if (rhs.isInt ()) {
					return new JapperObject (lhs.asInt () ^ rhs.asInt ());
				} else {
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
				}
			} else {
				throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			}
		}

		// bit or
		if (ctx.BitwiseOr () != null) {
			JapperObject lhs = visit (ctx.expression (0));
			JapperObject rhs = visit (ctx.expression (1));

			if (isTrying) {
				if (lhs == null || rhs == null) {
					visit (catchBlockContext.block ());
					isTrying = false;
					return JapperObject.VOID;
				}
			}

			if (lhs.isLong ()) {
				if (rhs.isLong () || rhs.isInt ())
					return new JapperObject (lhs.asLong () | rhs.asLong ());
				else
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			} else if (lhs.isInt ()) {
				if (rhs.isLong ()) {
					return new JapperObject (lhs.asLong () | rhs.asLong ());
				} else if (rhs.isInt ()) {
					return new JapperObject (lhs.asInt () | rhs.asInt ());
				} else {
					throw new EvaluationException ("Illegal arithmetic expression ", ctx);
				}
			} else {
				throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			}
		}

		if (ctx.And () != null) {
			JapperObject lhs = visit (ctx.expression (0));
			if (lhs.isBoolean ()) {
				if (!lhs.asBoolean ())
					return new JapperObject (false);
				else {
					JapperObject rhs = visit (ctx.expression (1));
					if (rhs.isBoolean ()) {
						if (!rhs.asBoolean ())
							return new JapperObject (false);
						else return new JapperObject (true);
					} else {
						throw new EvaluationException ("Illegal arithmetic expression ", ctx);
					}
				}
			} else {
				throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			}

		}

		if (ctx.Or () != null) {
			JapperObject lhs = visit (ctx.expression (0));
			if (lhs.isBoolean ()) {
				if (lhs.asBoolean ())
					return new JapperObject (true);
				else {
					JapperObject rhs = visit (ctx.expression (1));
					if (rhs.isBoolean ()) {
						if (rhs.asBoolean ())
							return new JapperObject (true);
						else
							return new JapperObject (false);
					} else {
						throw new EvaluationException ("Illegal arithmetic expression ", ctx);
					}
				}
			} else {
				throw new EvaluationException ("Illegal arithmetic expression ", ctx);
			}
		}

		if (ctx.bop != null) {
			if (ctx.bop.getType () == JapperParser.Question) {
				if (ctx.Colon () != null) {
					JapperObject condition = visit (ctx.expression (0));
					JapperObject ex1 = visit (ctx.expression (1));
					JapperObject ex2 = visit (ctx.expression (2));

					if (condition.isBoolean ()) {
						if (condition.asBoolean ()) {
							return ex1;
						} else {
							return ex2;
						}
					} else {
						throw new EvaluationException ("Illegal condition expression ", ctx);
					}
				} else if (ctx.If () != null) {
					JapperObject condition = visit (ctx.expression (1));
					JapperObject ex1 = visit (ctx.expression (0));
					JapperObject ex2 = visit (ctx.expression (2));

					if (condition.isBoolean ()) {
						if (condition.asBoolean ()) {
							return ex1;
						} else {
							return ex2;
						}
					} else {
						throw new EvaluationException ("Illegal condition expression ", ctx);
					}
				} else {
					throw new EvaluationException ("Illegal expression ", ctx);
				}
			}
		}

		if (ctx.bop != null) {
			String variable = ctx.expression (0).getText ();
			JapperObject value = visit (ctx.expression (1));
			JapperObject oldValue = scope.resolve (variable);

			switch (ctx.bop.getType ()) {
				case JapperParser.Gets:
					scope.assign (variable, value);
					return JapperObject.VOID;

				case JapperParser.PlusEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						 if (value.isString () || oldValue.isString ()) {
							value = new JapperObject (value.asString () + oldValue.asString ());
						} else if (value.isDouble () || oldValue.isDouble ()) {
							value = new JapperObject (value.asDouble () + oldValue.asDouble ());
						} else if (value.isFloat () || oldValue.isFloat ()) {
							value = new JapperObject (value.asFloat () + oldValue.asFloat ());
						} else if (value.isLong () || oldValue.isLong ()) {
							value = new JapperObject (value.asLong () + oldValue.asLong ());
						} else if (value.isInt () || oldValue.isInt ()) {
							value = new JapperObject (value.asInt () + oldValue.asInt ());
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression ", ctx);
						}

						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.MinusEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isDouble () || oldValue.isDouble ()) {
							value = new JapperObject (value.asDouble () - oldValue.asDouble ());
						} else if (value.isFloat () || oldValue.isFloat ()) {
							value = new JapperObject (value.asFloat () - oldValue.asFloat ());
						} else if (value.isLong () || oldValue.isLong ()) {
							value = new JapperObject (value.asLong () - oldValue.asLong ());
						} else if (value.isInt () || oldValue.isInt ()) {
							value = new JapperObject (value.asInt () - oldValue.asInt ());
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression ", ctx);
						}

						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.TimesEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isDouble () || oldValue.isDouble ()) {
							value = new JapperObject (value.asDouble () * oldValue.asDouble ());
						} else if (value.isFloat () || oldValue.isFloat ()) {
							value = new JapperObject (value.asFloat () * oldValue.asFloat ());
						} else if (value.isLong () || oldValue.isLong ()) {
							value = new JapperObject (value.asLong () * oldValue.asLong ());
						} else if (value.isInt () || oldValue.isInt ()) {
							if (Integer.bitCount (value.asInt ()) == 1) {
								value = new JapperObject (oldValue.asInt () << Integer.numberOfTrailingZeros (Integer.highestOneBit (value.asInt ())));
							} else
								value = new JapperObject (value.asInt () * oldValue.asInt ());
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression ", ctx);
						}

						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.DivEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isDouble () || oldValue.isDouble ()) {
							value = new JapperObject (value.asDouble () / oldValue.asDouble ());
						} else if (value.isFloat () || oldValue.isFloat ()) {
							value = new JapperObject (value.asFloat () / oldValue.asFloat ());
						} else if (value.isLong () || oldValue.isLong ()) {
							value = new JapperObject (value.asLong () / oldValue.asLong ());
						} else if (value.isInt () || oldValue.isInt ()) {
							if (Integer.bitCount (value.asInt ()) == 1) {
								value = new JapperObject (oldValue.asInt () >> Integer.numberOfTrailingZeros (Integer.highestOneBit (value.asInt ())));
							} else
								value = new JapperObject (value.asInt () / oldValue.asInt ());
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression ", ctx);
						}

						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.ModEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isDouble () || oldValue.isDouble ()) {
							value = new JapperObject (value.asDouble () % oldValue.asDouble ());
						} else if (value.isFloat () || oldValue.isFloat ()) {
							value = new JapperObject (value.asFloat () % oldValue.asFloat ());
						} else if (value.isLong () || oldValue.isLong ()) {
							value = new JapperObject (value.asLong () % oldValue.asLong ());
						} else if (value.isInt () || oldValue.isInt ()) {
							value = new JapperObject (value.asInt () % oldValue.asInt ());
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression ", ctx);
						}

						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.AndEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isLong ()) {
							if (oldValue.isLong () || oldValue.isInt ()) {
								value = new JapperObject (value.asLong () & oldValue.asLong ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else if (value.isInt ()) {
							if (oldValue.isLong ()) {
								value = new JapperObject (value.asLong () & oldValue.asLong ());
							} else if (oldValue.isInt ()) {
								value = new JapperObject (value.asInt () & oldValue.asInt ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
						}
						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.OrEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isLong ()) {
							if (oldValue.isLong () || oldValue.isInt ()) {
								value = new JapperObject (value.asLong () | oldValue.asLong ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else if (value.isInt ()) {
							if (oldValue.isLong ()) {
								value = new JapperObject (value.asLong () | oldValue.asLong ());
							} else if (oldValue.isInt ()) {
								value = new JapperObject (value.asInt () | oldValue.asInt ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
						}
						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.XorEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isLong ()) {
							if (oldValue.isLong () || oldValue.isInt ()) {
								value = new JapperObject (value.asLong () ^ oldValue.asLong ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else if (value.isInt ()) {
							if (oldValue.isLong ()) {
								value = new JapperObject (value.asLong () ^ oldValue.asLong ());
							} else if (oldValue.isInt ()) {
								value = new JapperObject (value.asInt () ^ oldValue.asInt ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
						}
						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.ShiftLeftLogicalEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isLong ()) {
							if (oldValue.isLong () || oldValue.isInt ()) {
								value = new JapperObject (value.asLong () << oldValue.asLong ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else if (value.isInt ()) {
							if (oldValue.isLong ()) {
								value = new JapperObject (value.asLong () << oldValue.asLong ());
							} else if (oldValue.isInt ()) {
								value = new JapperObject (value.asInt () << oldValue.asInt ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
						}
						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.ShiftRightLogicalEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isLong ()) {
							if (oldValue.isLong () || oldValue.isInt ()) {
								value = new JapperObject (value.asLong () >> oldValue.asLong ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else if (value.isInt ()) {
							if (oldValue.isLong ()) {
								value = new JapperObject (value.asLong () >> oldValue.asLong ());
							} else if (oldValue.isInt ()) {
								value = new JapperObject (value.asInt () >> oldValue.asInt ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
						}
						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				case JapperParser.ShiftRightArithmeticEqual:
					if (oldValue == null) {
						throw new EvaluationException ("Variable does not exist", ctx);
					} else {
						if (value.isLong ()) {
							if (oldValue.isLong () || oldValue.isInt ()) {
								value = new JapperObject (value.asLong () >>> oldValue.asLong ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else if (value.isInt ()) {
							if (oldValue.isLong ()) {
								value = new JapperObject (value.asLong () >>> oldValue.asLong ());
							} else if (oldValue.isInt ()) {
								value = new JapperObject (value.asInt () >>> oldValue.asInt ());
							} else {
								throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
							}
						} else {
							throw new EvaluationException ("Illegal arithmetic assignment expression", ctx);
						}
						scope.assign (variable, value);
					}
					return JapperObject.VOID;

				default:
					throw new EvaluationException ("Illegal expression ", ctx);
			}

		}

		return visitChildren(ctx);
	}

	@Override
	public JapperObject visitLambdaExpression (JapperParser.LambdaExpressionContext ctx) {
		return super.visitLambdaExpression (ctx);
	}

	@Override
	public JapperObject visitLambdaParameters (JapperParser.LambdaParametersContext ctx) {
		return super.visitLambdaParameters (ctx);
	}

	@Override
	public JapperObject visitLambdaBody (JapperParser.LambdaBodyContext ctx) {
		return super.visitLambdaBody (ctx);
	}

	@Override
	public JapperObject visitPrimary (JapperParser.PrimaryContext ctx) {

		if (ctx.OpenPare () != null && ctx.ClosePare () != null) {
			return visit (ctx.expression ());
		}

		if (ctx.VariableName () != null) {
			JapperObject object = scope.resolve (ctx.VariableName ().getText ());
			if (object == null) {
				throw new EvaluationException ("Object is not found in scope", ctx);
			}

			return object;
		}

		return super.visitPrimary (ctx);
	}

	@Override
	public JapperObject visitClassType (JapperParser.ClassTypeContext ctx) {
		return super.visitClassType (ctx);
	}

	@Override
	public JapperObject visitCreator (JapperParser.CreatorContext ctx) {
		return super.visitCreator (ctx);
	}

	@Override
	public JapperObject visitCreatedName (JapperParser.CreatedNameContext ctx) {
		return super.visitCreatedName (ctx);
	}

	@Override
	public JapperObject visitInnerCreator (JapperParser.InnerCreatorContext ctx) {
		return super.visitInnerCreator (ctx);
	}

	@Override
	public JapperObject visitArrayCreatorRest (JapperParser.ArrayCreatorRestContext ctx) {
		return super.visitArrayCreatorRest (ctx);
	}

	@Override
	public JapperObject visitClassCreatorRest (JapperParser.ClassCreatorRestContext ctx) {
		return super.visitClassCreatorRest (ctx);
	}

	@Override
	public JapperObject visitExplicitGenericInvocation (JapperParser.ExplicitGenericInvocationContext ctx) {
		return super.visitExplicitGenericInvocation (ctx);
	}

	@Override
	public JapperObject visitTypeArgumentsOrDiamond (JapperParser.TypeArgumentsOrDiamondContext ctx) {
		return super.visitTypeArgumentsOrDiamond (ctx);
	}

	@Override
	public JapperObject visitNonWildcardTypeArgumentsOrDiamond (JapperParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {
		return super.visitNonWildcardTypeArgumentsOrDiamond (ctx);
	}

	@Override
	public JapperObject visitNonWildcardTypeArguments (JapperParser.NonWildcardTypeArgumentsContext ctx) {
		return super.visitNonWildcardTypeArguments (ctx);
	}

	@Override
	public JapperObject visitDataTypeList (JapperParser.DataTypeListContext ctx) {
		return super.visitDataTypeList (ctx);
	}

	@Override
	public JapperObject visitDataType (JapperParser.DataTypeContext ctx) {
		return super.visitDataType (ctx);
	}

	@Override
	public JapperObject visitPrimitiveDataTypes (JapperParser.PrimitiveDataTypesContext ctx) {
		return super.visitPrimitiveDataTypes (ctx);
	}

	@Override
	public JapperObject visitTypeArguments (JapperParser.TypeArgumentsContext ctx) {
		return super.visitTypeArguments (ctx);
	}

	@Override
	public JapperObject visitSuperSuffix (JapperParser.SuperSuffixContext ctx) {
		return super.visitSuperSuffix (ctx);
	}

	@Override
	public JapperObject visitExplicitGenericInvocationSuffix (JapperParser.ExplicitGenericInvocationSuffixContext ctx) {
		return super.visitExplicitGenericInvocationSuffix (ctx);
	}

	@Override
	public JapperObject visitArguments (JapperParser.ArgumentsContext ctx) {
		return super.visitArguments (ctx);
	}
}
