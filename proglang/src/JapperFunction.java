import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class JapperFunction {

	private final List<JapperParser.FunctionParameterContext> params;
	private final ParseTree block;

	public JapperFunction (List<JapperParser.FunctionParameterContext> params, ParseTree block) {
		this.params = params;
		this.block = block;
	}

	public JapperObject invoke (List<JapperParser.ExpressionContext> params, Map<String, JapperFunction> functions, JapperScope scope) {
		if (params.size ()  != this.params.size ()) {
			throw new RuntimeException ("Illegal function call: Parameter count mismatch");
		}
		JapperScope next = new JapperScope (null);

		JapperVisitor visitor = new JapperVisitor (scope, functions);
		for (int i = 0; i < this.params.size (); i++) {
			JapperObject value = visitor.visit (params.get (i));
			next.assignParam (this.params.get (i).variableDeclaratorId ().VariableName ().getText (), value);
		}

		JapperVisitor nextVisitor = new JapperVisitor (next, functions);

		JapperObject ret = JapperObject.VOID;
		try {
			nextVisitor.visit (this.block);
		} catch (ReturnValue returnValue) {
			ret = returnValue.value;
		}

		return ret;
	}

}
