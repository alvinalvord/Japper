import java.util.*;

public class JapperScope {

	private JapperScope parent;
	private Map<String, JapperObject> variables;
	private Map<String, JapperObject> constants;

	public JapperScope () {
		this (null);
	}

	public JapperScope (JapperScope p) {
		parent = p;
		variables = new HashMap<> ();
		constants = new HashMap<> ();
	}

	public void assignParam (String name, JapperObject value) {
		variables.put (name, value);
	}

	public void assign (String name, JapperObject value) {
		if (resolveConstant (name) != null) {
			throw new RuntimeException ("Cannot reassign to constant values");
		}
		if (resolveVariables (name) != null) {
			this.reAssign (name, value);
		} else {
			assignParam (name, value);
		}
	}

	public void assignConstant (String name, JapperObject value) {
		if (resolveVariables (name) != null) {
			throw new RuntimeException ("Cannot use variable name as constant: " + name + "; variable already in use");
		}

		if (resolveConstant (name) == null) {
			constants.put (name, value);
		}
	}

	private boolean isGlobal () {
		return parent == null;
	}

	public JapperScope getParent () {
		return parent;
	}

	public void reAssign (String name, JapperObject value) {
		if (variables.containsKey (name)) {
			assignParam (name, value);
		} else if (!isGlobal ()) {
			parent.reAssign (name, value);
		}
	}

	public JapperObject resolve (String name) {
		JapperObject value = resolveConstant (name);
		if (value == null)
			value = resolveVariables (name);

		return value;
	}

	public JapperObject resolveVariables (String name) {
		JapperObject value = variables.get (name);

		if (value != null) {
			return value;
		} else if (!isGlobal ()) {
			return parent.resolveVariables (name);
		} else {
			return null;
		}
	}

	public JapperObject resolveConstant (String name) {
		JapperObject value = constants.get (name);

		if (value != null) {
			return value;
		} else if (!isGlobal ()) {
			return parent.resolveConstant (name);
		} else {
			return null;
		}
	}

}
