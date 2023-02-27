import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter {
	private String line; // instance var

	public LineCounter() {
		setLine("");
	} // default constructor, final

	public LineCounter(String s) {
		setLine(s);
	} // constructor w/ string, edit

	public void setLine(String s) {
		line = s;
	} // setter/mutator

	public int getCount() {
		int count = 0;
		Scanner lc = new Scanner(getLine());
		while (lc.hasNextInt()) {
			lc.nextInt();
			count++;
		}
		lc.close();
		return count;
	} // getter/accesesor

	public String getLine() {
		return line;
	} // getter/accessor

	public String toString() {
		String str = getLine() + "\ncount = " + getCount() + "\n";
		return str;
	} // getter/accessor
}