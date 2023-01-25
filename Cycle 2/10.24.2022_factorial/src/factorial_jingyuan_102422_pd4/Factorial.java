package factorial_jingyuan_102422_pd4;

import java.io.IOException;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) throws IOException {
		// 1. Declare Variables
		int product = 1;
		int n = 0;
		Scanner input = new Scanner(System.in);
		
		// 2. Input
		System.out.println("Enter a positive integer...");
		n = input.nextInt();
		
		// 3. Process
		for (int i = 0; i < n; i++) {
			product = product * (i + 1);
		}
		input.close();

		// 4. Output
		System.out.println("The factorial of " + n + " is " + product + ".");
	} //end of main

} //end of class
