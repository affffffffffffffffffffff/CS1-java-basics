import java.util.Arrays;

public class Wxy {
	// 1. instance var
	private int[] array;
	
	// 2. method
	
	// 2.1 constructor
	public Wxy() {}
	public Wxy(int[] x) {
		array = x;
	}
	
	// 2.2 modify
	public void setArray(int[] y) {
		array = y;
	}

	// 2.3 get
	public String getArray() {
		return Arrays.toString(array);
	}
	
	// 2.4 auxiliary
	public String toString() {
		String str = "array:\t" + getArray() + "\nsum:\t" + sum();	
		return str;
	}
	public int sum() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	public long factorial(int a) {
		long sum = 1;
		for (int i = 0; i < a; i++) {
			sum *= (i + 1);
		}
		return sum;
	}
} // end of class
