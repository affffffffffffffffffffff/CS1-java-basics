import java.util.Arrays;

public class ArraysSubtract {

	public static void main(String[] args) {
		int[] a = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
		int[] b = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};
		System.out.println("subtracting the arrays = " + Arrays.toString(subtract(a, b)));
		System.out.println(Arrays.toString(a));
		System.out.println("sum of spots 3-6 = " + sumSection(a, 3, 6));
		System.out.println("sum of spots 2-9 = " + sumSection(a, 2, 9));
		System.out.println("# of 4s = " + numTimes(a, 4));
		System.out.println("# of 9s = " + numTimes(a, 9));
		System.out.println("# of 7s = " + numTimes(a, 7));
		System.out.println("new array with all 7s removed = " + Arrays.toString(removeNum(a, 7)));
		System.out.println("# of 7s = " + numTimes(removeNum(a, 7), 7));
		System.out.println(Arrays.toString(b));
		System.out.println("sum of spots 3-16 = " + sumSection(b, 3, 16));
		System.out.println("sum of spots 2-9 = " + sumSection(b, 2, 9));
		System.out.println("# of 0s = " + numTimes(b, 0));
		System.out.println("# of 3s = " + numTimes(b, 3));
		System.out.println("# of 7s = " + numTimes(b, 7));
		System.out.println("new array with all 7s removed = " + Arrays.toString(removeNum(b, 7)));
		System.out.println("# of 7s = " + numTimes(removeNum(b, 7), 7));
		
	}// end of main
	
	public static int[] subtract(int[] p, int[] q) {
		int[] x = new int[p.length > q.length ? q.length : p.length];
		for (int i = 0; i < x.length; i++) {
			x[i] = p[i] - q[i];
		}
		return x;
	}
	
	public static int sumSection(int[] p, int q, int r) {
		int x = 0;
		for (int i = q; i <= r; i++) {
			x += p[i];
		}
		return x;
	}
	
	public static int numTimes(int[] p, int q) {
		int x = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] == q) x += 1;
		}
		return x;
	}
	
	public static int[] removeNum(int[] p, int q) {
		int[] x = new int[p.length - numTimes(p, q)];
		int correction = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] == q) {
				correction += 1;
				continue;
			}
			if (p[i] != q) x[i - correction] = p[i];
		}
		return x;
	}

}// end of class
