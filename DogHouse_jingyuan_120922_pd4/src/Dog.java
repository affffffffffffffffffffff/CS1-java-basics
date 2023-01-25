
public class Dog {
	// 1 Attributes
	private int numTimesFed;
	private String name;
	
	// 2.1 Constructor
	public Dog(String n) {
		name = n;
		numTimesFed = 0;
	}
	
	// 2.2 Getter
	public int getNumTimesFed() {
		return numTimesFed;
	}
	
	// 2.3 Mutator
	public String feed() {
		numTimesFed++;
		String str = "";
		if(numTimesFed <= 2) {
			str = "YUMMY";
		}
		else if(numTimesFed > 2) {
			str = name + " yawns";
		}
		return str;
	}
	
	// 2.4 Auxiliary
	public String hear(String h) {
		String str;
		if(h.equalsIgnoreCase(name)) {
			str = name + " wags tail";
		}
		else if(h.equalsIgnoreCase("ding-dong")) {
			str = "BARK BARK";
		}
		else {
			str = name + " looks puzzled";
		}
		return str;
	}
	
}
