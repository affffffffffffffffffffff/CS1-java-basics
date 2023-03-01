import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter {
	private String line;

	public OddEvenCounter() {
		setLine("");
	}

	public OddEvenCounter(String s) {
		setLine(s);
	}

	public void setLine(String s) {
		line = s;
	}

	public int getEvenCount() {
		int count = 0;
		Scanner gec = new Scanner(getLine());
		while (gec.hasNextInt()) {
			int num = gec.nextInt();
			if (num % 2 == 0) count++;
		}
		gec.close();
		return count;
	}

	public int getOddCount() {
		int count = 0;
		Scanner goc = new Scanner(getLine());
		while (goc.hasNextInt()) {
			int num = goc.nextInt();
			if (num % 2 == 1) count++;
		}
		goc.close();
		return count;
	}
	
	public String getLine() {
		return line;
	}

	public String toString() {
		String str = getLine() + "\neven count = " + getEvenCount() + "\nodd count = " + getOddCount() + "\n";
		return str;
	}
}