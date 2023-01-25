import java.io.IOException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) throws IOException {
		// 1. Declare Variables
		Scanner keyboard = new Scanner(System.in);
		int int1;
		
		// 2. User Input
		System.out.print("Enter an integer :: ");
		int1 = keyboard.nextInt();
		
		// 3. Process and 4. Output
		if (int1 % 2 == 0) {
			System.out.println(int1 + " is even.");
		}
		else if (int1 % 2 != 0) {
			System.out.println(int1 + " is odd.");
		}
	}
}
