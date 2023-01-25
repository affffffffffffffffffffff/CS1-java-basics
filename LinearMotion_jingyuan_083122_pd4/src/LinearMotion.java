import java.io.IOException;
import java.util.Scanner;

public class LinearMotion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 1. Declare Variables:
		double a, v, s, t;
		Scanner sc = new Scanner(System.in);
		
		// 2. Input Prompts:
		System.out.println("What is the acceleration of the object?");
		a = sc.nextDouble();
		System.out.println("What is the speed (velocity) of the object in meters per second (m/s)?");
		v = sc.nextDouble();
		System.out.println("What is the distance (displacement) the object travels in meters (m)?");
		s = sc.nextDouble();
		
		// 3. Process:
		t = (-v + Math.sqrt(2 * a * s + v * v)) / a;
		
		// 4. Output:
		System.out.print("The time it takes for the object to cover the required displacement is ");
		System.out.println(t + " second(s).");
		
	}

}
