import java.io.IOException;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) throws IOException {
		// 1. Declare Variables
		int ft, in, weight;
		double bmi;
		Scanner input = new Scanner(System.in);
		
		// 2. Input
		System.out.println("What is your weight? Round to the nearest pound :: ");
		weight = input.nextInt();
		System.out.println("What is your height? Round down to the nearest foot :: ");
		ft = input.nextInt();
		System.out.println("What is your height? Write the inches part only (5'2\" would enter 2).");
		in = input.nextInt();
				
		// 3. Process
		if(in >= 12) { // Filtering in case the inches is too high
			ft = ft + in/12;
			in %= 12;
		}
		bmi = weight/Math.pow(ft*12+in, 2)*703;
		
		// 4. Output
		if (bmi > 0 && bmi < 18.5)
			System.out.printf("Your BMI is %.2f and you are classified as underweight.", bmi);
		else if (bmi >= 18.5 && bmi < 25)
			System.out.printf("Your BMI is %.2f and you are classified as healthy.", bmi);
		else if(bmi >= 25 && bmi < 30)
			System.out.printf("Your BMI is %.2f and you are classified as overweight.", bmi);
		else if (bmi > 30)
			System.out.printf("Your BMI is %.2f and you are classified as obese.", bmi);
		else
			System.out.printf("Your BMI is %.2f and you are classified as a ghost.", bmi);
		
	}

}
