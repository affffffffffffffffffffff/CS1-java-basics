import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner {
	public static void main(String args[]) {
		String data1 = "9 10 5 20";
		String data2 = "11 22 33 44 55 66 77";
		String data3 = "48 52 29 100 50 29";
		String data4 = "0";
		String data5 = "100 90 95 98 100 97";
		
		Average sample1 = new Average(data1);
		Average sample2 = new Average(data2);
		Average sample3 = new Average(data3);
		Average sample4 = new Average(data4);
		Average sample5 = new Average(data5);

		System.out.println(sample1);
		System.out.println(sample2);
		System.out.println(sample3);
		System.out.println(sample4);
		System.out.println(sample5);
	}
}