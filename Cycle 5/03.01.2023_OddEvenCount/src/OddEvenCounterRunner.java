import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner {
	public static void main(String args[]) {
		String data1 = "9 10 5 20";
		String data2 = "11 22 33 44 55 66 77";
		String data3 = "3 5 3 1 5 7 5 4 3 2 7 8 9 9 9 6";
		String data4 = "2 4 6 8 2 4 6";
		String data5 = "1 3 5 7 9 1 3 5";
		
		OddEvenCounter sample1 = new OddEvenCounter(data1);
		OddEvenCounter sample2 = new OddEvenCounter(data2);
		OddEvenCounter sample3 = new OddEvenCounter(data3);
		OddEvenCounter sample4 = new OddEvenCounter(data4);
		OddEvenCounter sample5 = new OddEvenCounter(data5);
		
		System.out.println(sample1);
		System.out.println(sample2);
		System.out.println(sample3);
		System.out.println(sample4);
		System.out.println(sample5);
	}
}