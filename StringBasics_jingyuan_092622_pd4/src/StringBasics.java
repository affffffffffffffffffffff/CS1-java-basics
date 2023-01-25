import java.io.IOException;
import java.util.Scanner;

public class StringBasics {

	public static void main(String[] args) throws IOException {
		
		// 1. Declare Variables
		Scanner keyboard = new Scanner(System.in);
		String one, two;
		
		// 2. Input
		System.out.print("first :: ");
		one = keyboard.next().toString();
		System.out.print("last :: ");
		two = keyboard.next().toString();
		
		// 3. Process and 4. Output
		System.out.println("full name :: " + one + " " + two + "\n");
		
	}
}
