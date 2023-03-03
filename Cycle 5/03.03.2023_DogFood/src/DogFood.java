import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood {
	private double amount;

	public DogFood() {
	}

	public DogFood(String line) {
		Scanner chopper = new Scanner(line);
		double cups = 0;

		// calc code goes here
		while (chopper.hasNextInt()) {
			int x = chopper.nextInt();
			if (x >= 80) cups += 7.5 * 7;
			else if (x >= 60) cups += 6.0 * 7;
			else if (x >= 40) cups += 4.5 * 7;
			else if (x >= 20) cups += 3.5 * 7;
			else if (x >= 10) cups += 2.0 * 7;
			else if (x >= 8) cups += 1.5 * 7;
			else if (x >= 5) cups += 1.0 * 7;
			else if (x >= 2) cups += 0.5 * 7;	
		}
		amount = Math.ceil(cups / 60.0);
		chopper.close();
	}

	public double getAmount() {
		return amount;
	}

	public String toString() {
		String str = getAmount() + "\n" + (int)getAmount() + " - 10 POUND BAGS\n";
		return str;
	}
}