import static java.lang.System.*;
import java.util.Scanner;

public class LineTotallerRunner {

	public static void main(String[] args) {
		String data1 = "1 2 3 4 5 6";
		String data2 = "10 20 30 40 50 60";

		LineTotaller sample1 = new LineTotaller(data1);
		LineTotaller sample2 = new LineTotaller(data2);

		System.out.println(sample1);
		System.out.println(sample2);
	}

}
