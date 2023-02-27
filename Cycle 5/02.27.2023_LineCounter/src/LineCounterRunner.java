import java.util.Scanner;
import static java.lang.System.*;
import java.io.IOException;

public class LineCounterRunner {
	public static void main(String args[]) throws IOException {
		LineCounter one = new LineCounter("9 10 5 20 1 2 3");
		System.out.println(one);
		LineCounter two = new LineCounter("11 22 33 44 55 66 77 5 6 7");
		System.out.println(two);
		LineCounter three = new LineCounter("48 52 29 100 50 293 4");
		System.out.println(three);
		LineCounter four = new LineCounter("0");
		System.out.println(four);
		LineCounter five = new LineCounter("100 90 95 98 100 97");
		System.out.println(five);
	}
}