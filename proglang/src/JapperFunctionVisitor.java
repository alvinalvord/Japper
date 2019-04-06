import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class JapperFunctionVisitor extends JapperParserBaseVisitor<JapperObject> {

	private Map<String, JapperFunction> functions;

	JapperFunctionVisitor (Map<String, JapperFunction> functions) {
		this.functions = functions;
	}

	@Override
	public JapperObject visitFunctionDeclaration (JapperParser.FunctionDeclarationContext ctx) {
		List<JapperParser.FunctionParameterContext> params = null;

		try {
			params = ctx.functionParameters ().functionParameterList ().functionParameter ();
		} catch (Exception e) {}

		if (params == null) {
			params = new ArrayList<> ();
		}

		String functionName = ctx.VariableName (0).getText () + params.size ();
		ParseTree block = ctx.functionBody ();

		functions.put (functionName, new JapperFunction (params, block));

		return JapperObject.VOID;
	}
}
