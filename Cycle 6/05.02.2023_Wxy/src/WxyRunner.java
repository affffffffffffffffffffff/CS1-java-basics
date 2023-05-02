
public class WxyRunner {

	public static void main(String[] args) {
		final int[] m = {5,6,7,8,-9,10,11,12,13};
		Wxy a = new Wxy(m);
		System.out.println("5! = " + a.factorial(5));
		System.out.println("m[3]! = " + a.factorial(m[3]));
		System.out.println("array sum = " + a.sum());
		System.out.println("\nclass info:\n" + a);
	}
}
