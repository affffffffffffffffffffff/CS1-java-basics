
public class Parsing {

	public static void main(String[] args) {
		
		// 1. Declare Variables
		String myAge = "17";
		String myCost = "12.95";
		String myBool = "false";
		String myByte = "twelve";
		
		// 3. Process and 4. Output
		// Convert myAge to an integer
		int age = Integer.parseInt(myAge);
		System.out.println(age);
		// Convert myCost to a float
		float cost = Float.parseFloat(myCost);
		System.out.println(cost);
		// convert MyBool to a boolean
		boolean answer = Boolean.parseBoolean(myBool);
		System.out.println(answer);
		// convert myByte to a byte
		byte oops = Byte.parseByte(myByte);
		System.out.println(oops);
	}

}
