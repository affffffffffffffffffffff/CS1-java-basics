import java.io.IOException;
import java.util.Scanner;

public class Heron2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        //1. Declare Variables
		double side1, side2, side3, sp, area;     
		Scanner sc = new Scanner(System.in);
		
		//2. Input prompts
		System.out.println("Type in side1...");
		side1=sc.nextDouble(); //recasts the typed in value to double
		System.out.println("Type in side2...");
		side2=sc.nextDouble();
		System.out.println("Type in side3...");
		side3=sc.nextDouble();
		
		//3. Process: area of triangle
		sp = (side1 + side2 + side3) / 2;
		area = Math.sqrt(sp * (sp - side1) * (sp - side2) * (sp - side3));
		
		//4. Output:  print result
		System.out.print("The area of the triangle is ");
		System.out.println(area +" sq. units.");
	
	}//end of main

}

/* Recasting allows you to change one data type to another
 * Throwing exception allows your errors to not freeze the system
 * sc.nextDATATYPE, so you could cast into an int
 * All scanner data is read from the keyboard and sorted into a string unless recasted
 * Scanner is a class library that automatically handles the old way 
 * --> InputStreamReadar
 * --> BufferReader 
 */
