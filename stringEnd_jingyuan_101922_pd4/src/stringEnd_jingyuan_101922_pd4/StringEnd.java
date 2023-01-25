package stringEnd_jingyuan_101922_pd4;

import java.io.IOException;
import java.util.Scanner;

public class StringEnd {

	public static void main(String[] args) throws IOException {
		// 1. Declare Variables
		Scanner input = new Scanner(System.in);
		int tally = 0;
		String testString, checkString, checkArea;
				
		// 2. Input
		System.out.println("Enter the string to check :: ");
		testString = input.next().toString();
		System.out.println("Check if the string ends in :: ");
		checkString = input.next().toString();
		
		// 3. Process
		checkArea = testString.substring(testString.length() - checkString.length());
		for (int i = 0; i < checkString.length(); i++) {
			if (checkArea.indexOf(checkString.charAt(i)) != checkString.indexOf(checkString.charAt(i))) {
				tally += 1;
			}
		}
		
		// 4. Output
		if (tally == 0 && checkArea.equals(checkString)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}

}
