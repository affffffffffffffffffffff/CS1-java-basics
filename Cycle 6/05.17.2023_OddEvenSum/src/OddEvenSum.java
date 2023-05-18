import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("src\\mydata.cvhs"));
		ArrayList<Integer> data = new ArrayList<Integer>();
		while (in.hasNextInt()) {
			data.add(in.nextInt());
		}
		System.out.println(OddSum(data));
		System.out.println(EvenSum(data));
		in.close();
	}
	
	public static int OddSum(ArrayList<Integer> a) {
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 2 == 1) {
				sum += a.get(i);
			}
		}
		return sum;
	}
	public static int EvenSum(ArrayList<Integer> a) {
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 2 == 0) {
				sum += a.get(i);
			}
		}
		return sum;
	}
}
