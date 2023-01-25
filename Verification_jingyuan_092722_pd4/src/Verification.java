
public class Verification {

	public static void main(String[] args) {
		// 1. Declare variables
		String storedUsername = "captainbob";
		String storedPassword = "ahoy";
		String inputUsername = "CAPTAINBOB";
		String inputPassword = "Ahoy";
		
		// 3. Process
		boolean usernameMatch = (storedUsername.equalsIgnoreCase(inputUsername));
		boolean passwordMatch = (storedPassword.equals(inputPassword));
		
		// 4. Output
		System.out.println("Userename match: " + usernameMatch);
		System.out.println("Password match: " + passwordMatch);

	}

}
