
public class WordEx {
	// 1. instance var
	String str = "";
	
	// 2. methods
	
	// 2.1 constructor
	public WordEx() {}
	public WordEx(String a) {
		str = a;
	}
	// 2.2 set
	public void setString(String a) {
		str = a;
	}
	
	// 2.3 get
	public String getString() {
		return str;
	}
	
	// 2.4 aux
	public String toString() {
		return "stored string: " + getString();
	}
	public String exchange() {
		// variables
		String working = getString();
		String result = "";
		String split[] = working.split(" "); // str -> array
		// swap array
		for (int i = 0; i < split.length / 2; i++) {
			String first = split[i];
			String last = split[split.length - 1 - i];
			split[i] = last;
			split[split.length - 1 - i] = first;
		}
		// assemble final
		for (int i = 0; i < split.length; i++) {
			result = result + split[i];
			if (i != split.length - 1) { // add space if not end of str
				result = result + " ";
			}
		}
		return result;
	}
}
