import java.util.Scanner;
import static java.lang.System.*;

public class LineBreakerRunner {
	public static void main(String args[]) {
		String data1 = "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9";
		int break1 = 4;
		String data2 = "t h e b i g b a d w o l f h a d b i g e a r s a n d t e e t h";
		int break2 = 2;
		String data3 = "a c o m p u t e r s c i e n c e p r o g r a m";
		int break3 = 7;
		String data4 = "i a m s a m i a m";
		int break4 = 2;

		LineBreaker sample1 = new LineBreaker(data1, break1);
		LineBreaker sample2 = new LineBreaker(data2, break2);
		LineBreaker sample3 = new LineBreaker(data3, break3);
		LineBreaker sample4 = new LineBreaker(data4, break4);

		System.out.println(sample1);
		System.out.println(sample2);
		System.out.println(sample3);
		System.out.println(sample4);
	}
}