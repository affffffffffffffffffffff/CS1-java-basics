package coordinates_jingyuan_102622_pd4;

public class Coordinates {

	public static void main(String[] args) {
		// 3. Process and 4. Output
		System.out.printf("%1$-19s%2$-19s\n", "x", "y");
		for(double x = -5; x <= 5; x+=0.125) { // 1. Declare Variable
			System.out.printf("%1$-19.3f%2$-19.3f\n", x, algebraicFunction(x));
		}

	}//end of main
	
	public static double algebraicFunction(double x) {
		// 3. Process
		double y = 0.0015 * Math.pow(x, 5) + 0.2 * Math.pow(x, 4) + (-4.05) * Math.pow(x, 2) + (-0.25) * x + 10; //declares && process y
		return y;
	}//end of algebraic function

}//end of class