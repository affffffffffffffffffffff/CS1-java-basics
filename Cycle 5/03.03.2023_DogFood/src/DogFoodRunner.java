import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFoodRunner {
	public static void main(String[] args) {
		String data1 = "6 10 14 18 25 32";
		String data2 = "12 15 20 26 35 42";
		String data3 = "33 38 45 51 60 65";
		String data4 = "40 50 60 77 90 101";
		
		DogFood sample1 = new DogFood(data1);
		DogFood sample2 = new DogFood(data2);
		DogFood sample3 = new DogFood(data3);
		DogFood sample4 = new DogFood(data4);
		
		System.out.println(sample1);
		System.out.println(sample2);
		System.out.println(sample3);
		System.out.println(sample4);
	}
}