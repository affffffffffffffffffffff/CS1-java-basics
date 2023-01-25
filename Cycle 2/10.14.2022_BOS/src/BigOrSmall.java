import java.io.IOException;
import java.util.Scanner;

public class BigOrSmall {

	public static void main(String[] args) throws IOException {
		// 1. Declare Variables
		int int1, int2;
		Scanner keyboard = new Scanner(System.in);
		
		// 2. Input
		System.out.print("Enter an integer :: ");
		int1 = keyboard.nextInt();
		System.out.print("Enter another integer :: ");
		int2 = keyboard.nextInt();
		
		// 3. Process and 4. Output
		if(int1 > int2) {
			System.out.println("Number 1 > Number 2");
		}
		else if (int1 < int2) {
			System.out.println("Number 1 < Number 2");
		}
		else if (int1 == int2) {
			System.out.println("Number 1 = Number 2");
		}
	}
}
