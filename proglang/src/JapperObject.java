import java.util.*;

public class JapperObject implements Comparable<JapperObject> {

	public static final JapperObject NULL = new JapperObject ();
	public static final JapperObject VOID = new JapperObject ();

	private Object value;
	private boolean constant;

	private JapperObject () {
		value = new Object ();
		constant = false;
	}

	public JapperObject (Object v) {
		if (v == null) {
			throw new RuntimeException ("value of Object is null");
		}
		value = v;
		constant = false;

		if (!(isBoolean () || isNumber () || isString () || isCharacter () || isArray ())) {
			throw new RuntimeException ("Invalid data type: " + v + " (" + v.getClass () + ")");
		}
	}

	public void setConstant () {
		constant = true;
	}

	public Object asObject () {
		return value;
	}

	public boolean asBoolean () {
		return (boolean) value;
	}

	public byte asByte () { return (byte) value; }

	public char asChar () {
		return (char) value;
	}

	public double asDouble () {
		if (isString ()) return Double.parseDouble (asString ());
		return ((Number)value).doubleValue ();
	}

	public float asFloat () {
		if (isString ()) {
			try {
				return Float.parseFloat (asString ());
			} catch (Exception e) {
				throw new RuntimeException ("String cannot be a float bruh");
			}
		}
		try {
			return ((Number)value).floatValue ();
		}  catch (Exception e) {
			throw new RuntimeException ("String cannot be a float bruh");
		}
	}

	public long asLong () {
		if (isString ()) {
			return Long.parseLong (asString ());
		}
		return ((Number)value).longValue ();
	}

	public int asInt () {
		if (isString ()) {
			try {
				return Integer.parseInt (asString ());
			} catch (Exception e) {
				throw new RuntimeException ("String cannot be an int bruh");
			}
		}
		try {
			return ((Number)value).intValue ();
		} catch (Exception e) {
			throw new RuntimeException ("String cannot be an int bruh");
		}
	}

	public String asString () {
		return String.valueOf (value);
	}

	public Object[] asArray () {
		return (Object[]) value;
	}

	public boolean[] asBooleanArray () {
		return (boolean []) value;
	}

	public byte[] asByteArray () {
		return (byte []) value;
	}

	public char[] asCharArray () {
		return (char []) value;
	}

	public double[] asDoubleArray () {
		return (double []) value;
	}

	public float[] asFloatArray () {
		return (float []) value;
	}

	public long[] asLongArray () {
		return (long []) value;
	}

	public int[] asIntArray () {
		return (int []) value;
	}

	public String[] asStringArray () {
		return (String []) value;
	}

	public List<Object> asList () {
		return (List<Object>) value;
	}

	public List<Boolean> asBooleanList () {
		return (List<Boolean>) value;
	}

	public List<Byte> asByteList () {
		return (List<Byte>) value;
	}

	public List<Character> asCharList () {
		return (List<Character>) value;
	}

	public List<Double> asDoubleList () {
		return (List<Double>) value;
	}

	public List<Float> asFloatList () {
		return (List<Float>) value;
	}

	public List<Long> asLongList () {
		return (List<Long>) value;
	}

	public List<Integer> asIntList () {
		return (List<Integer>) value;
	}

	public List<String> asStringList () {
		return (List<String>) value;
	}

	@Override
	public int compareTo (JapperObject that) {
		if (this.isNumber () && that.isNumber ()) {
			if (this.equals (that)) {
				return 0;
			} else {
				return Double.compare (this.asDouble (), that.asDouble ());
			}
		}

		if (this.isString () && that.isString ()) {
			return this.asString ().compareTo (that.asString ());
		}

		if (this.isArray () && that.isArray ()) {
			if (Arrays.equals (this.asArray (), that.asArray ()))
				return 0;
			else return -1;
		}

		if (this.isList () && that.isList ()) {
			if (this.asList ().equals (that.asList ()))
				return 0;
			else return -1;
		}

		throw new RuntimeException ("Illegal comparison between " + this + " and " + that);
	}

	@Override
	public boolean equals (Object o) {
		if (this == VOID || o == VOID)  {
			throw new RuntimeException ("Cannot compare object to void");
		}
		if (this == o) return true;
		if (o == null || this.getClass () != o.getClass ()) return false;

		JapperObject that = (JapperObject)o;
		if (this.isNumber () && that.isNumber ()) {
			double t1 = this.asDouble ();
			double t2 = that.asDouble ();
			double diff = Math.abs (t1-t2);
			return diff < 0.00000000001;
		} else {
			return this.value.equals (that.value);
		}
	}

	@Override
	public int hashCode () {
		return value.hashCode ();
	}

	public boolean isBoolean () {
		return value instanceof Boolean;
	}

	public boolean isByte () {
		return value instanceof Byte;
	}

	public boolean isCharacter () {
		return value instanceof Character;
	}

	public boolean isString () {
		return value instanceof String;
	}

	public boolean isNumber () {
		return value instanceof Number;
	}

	public boolean isDouble () {
		return value instanceof Double;
	}

	public boolean isFloat () {
		return value instanceof Float;
	}

	public boolean isInt () {
		return value instanceof Integer;
	}

	public boolean isLong () {
		return value instanceof Long;
	}

	public boolean isArray () {
		return value.getClass ().isArray ();
	}

	public boolean isList () {
		return value instanceof List;
	}

	public boolean isNull () {
		return this == NULL;
	}

	public boolean isVoid () {
		return this == VOID;
	}

	public void increment () {
		if (constant)
			throw new RuntimeException ("Cannot reassign to constant values");

		if (isBoolean ()) {
			value = true;
		} else if (isByte ()) {
			value = asByte () + 1;
		} else if (isCharacter ()) {
			value = asChar () + 1;
		} else if (isInt ()) {
			value = asInt () + 1;
		} else if (isLong ()) {
			value = asLong () + 1;
		} else if (isFloat ()) {
			value = asFloat () + 1;
		} else if (isDouble ()) {
			value = asDouble () + 1;
		} else {
			throw new RuntimeException ("Cannot increment object of type " + value.getClass ().toString ());
		}
	}

	public void decrement () {
		if (constant)
			throw new RuntimeException ("Cannot reassign to constant values");

		if (isBoolean ()) {
			value = false;
		} else if (isByte ()) {
			value = asByte () - 1;
		} else if (isCharacter ()) {
			value = asChar () - 1;
		} else if (isInt ()) {
			value = asInt () - 1;
		} else if (isLong ()) {
			value = asLong () - 1;
		} else if (isFloat ()) {
			value = asFloat () - 1;
		} else if (isDouble ()) {
			value = asDouble () - 1;
		} else {
			throw new RuntimeException ("Cannot decrement object of type " + value.getClass ().toString ());
		}
	}

	public void negate () {
		if (constant)
			throw new RuntimeException ("Cannot reassign to constant values");

		if (isBoolean ()) {
			value = !asBoolean ();
		} else if (isByte ()) {
			value = -asByte ();
		} else if (isCharacter ()) {
			value = -asChar ();
		} else if (isInt ()) {
			value = -asInt ();
		} else if (isLong ()) {
			value = -asLong ();
		} else if (isFloat ()) {
			value = -asFloat ();
		} else if (isDouble ()) {
			value = -asDouble ();
		} else {
			throw new RuntimeException ("Cannot negate object of type " + value.getClass ().toString ());
		}
	}

	public void bitNot () {
		if (constant)
			throw new RuntimeException ("Cannot reassign to constant values");

		if (isBoolean ()) {
			value = !asBoolean ();
		} else if (isByte ()) {
			value = ~asByte ();
		} else if (isCharacter ()) {
			value = ~asChar ();
		} else if (isInt ()) {
			value = ~asInt ();
		} else if (isLong ()) {
			value = ~asLong ();
		} else {
			throw new RuntimeException ("Cannot bitwise negate object of type " + value.getClass ().toString ());
		}
	}

	public String toString () {
		return isNull () ? "NULL" : isVoid () ? "VOID" : String.valueOf (value);
	}

}
