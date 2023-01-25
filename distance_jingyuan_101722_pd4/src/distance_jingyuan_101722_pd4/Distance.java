package distance_jingyuan_101722_pd4;

import java.io.IOException;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) throws IOException {
		// 1. Declare Variables
		double truckAx, truckAy, truckBx, truckBy, distanceA, distanceB;
		Scanner input = new Scanner(System.in);
		
		// 2. Input
		System.out.print("Enter X1 :: ");
		truckAx = input.nextDouble();
		System.out.print("Enter Y1 :: ");
		truckAy = input.nextDouble();
		System.out.print("Enter X2 :: ");
		truckBx = input.nextDouble();
		System.out.print("Enter Y2 :: ");
		truckBy = input.nextDouble();
		
		// 3. Process
		distanceA =	Math.sqrt(Math.pow(truckAx, 2) + Math.pow(truckAy, 2));
		distanceB = Math.sqrt(Math.pow(truckBx, 2) + Math.pow(truckBy, 2));
		
		// 4. Output
		if(distanceA > distanceB) {
			System.out.println("B is closer to (0,0).");
			System.out.printf("Truck A is %.3f miles away from Truck B.", (distanceA - distanceB));
		}
		else if(distanceB > distanceA) {
			System.out.println("A is closer to (0,0).");
			System.out.printf("Truck B is %.3f miles away from Truck A.", distanceB - distanceA);
		}
		else if(distanceA == distanceB) {
			System.out.println("A and B are the same distance to (0,0).");
			System.out.printf("Truck A is %.3f miles away from Truck B, and vice versa.", distanceA - distanceB);
		}
		else {
			System.out.println("Those are not valid coordinates!");
		}
		input.close();
	}

}
