import static java.lang.System.*;
import java.util.Scanner;

public class LineTotaller {
	private String line; // instance var

	public LineTotaller() {
		setLine("");
	} // default constructor, final

	public LineTotaller(String s) {
		setLine(s);
	} // constructor w/ string, edit

	public void setLine(String s) {
		line = s;
	} // setter/mutator

	public int getSum() {
		int total = 0;
		Scanner lt = new Scanner(getLine());
		while (lt.hasNextInt()) {
			total += lt.nextInt();
		}
		lt.close();
		return total;
	} // getter/accesesor

	public String getLine() {
		return line;
	} // getter/accessor

	public String toString() {
		String str = getLine() + "\nsum = " + getSum() + "\n";
		return str;
	} // getter/accessor
}
