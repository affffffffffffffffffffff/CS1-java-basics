import java.util.Scanner;
import static java.lang.System.*;

import java.text.DecimalFormat;

public class Average {
	private String line;

	public Average() {
		setLine("");
	}

	public Average(String s) {
		setLine(s);
	}

	public void setLine(String s) {
		line = s;
	}

	public int getCount() {
		int count = 0;
		Scanner gc = new Scanner(getLine());
		while (gc.hasNextInt()) {
			count++;
			gc.nextInt();
		}
		gc.close();
		return count;
	}

	public int getSum() {
		int sum = 0;
		Scanner gs = new Scanner(getLine());
		while (gs.hasNextInt()) {
			sum += gs.nextInt();
		}
		gs.close();
		return sum;
	}

	public double getAverage() {
		double average = 0.0;
		if (getCount() != 0) {
			average = (double)getSum() / (double)getCount();
		}
		return average;
	}

	public String getLine() {
		return line;
	}

	public String toString() {
		String str = getLine() + "\naverage = " + new DecimalFormat("###0.000").format(getAverage()) + "\n";
		return str;
	}
}