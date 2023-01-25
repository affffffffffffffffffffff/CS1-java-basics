import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Heron {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        //1. Declare Variables
		double side1, side2, side3, sp, area; 
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		//2. Input prompts
		System.out.println("Type in side1...");
		side1 = Double.parseDouble(br.readLine());
		System.out.println("Type in side2...");
		side2 = Double.parseDouble(br.readLine());
		System.out.println("Type in side3...");
		side3 = Double.parseDouble(br.readLine());
		
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
 * sc.nextDATATYPE, so you could cast into an 'INT'
 * All scanner data is read from the keyboard and sorted into a string unless recasted
 * Scanner is a class library that automatically handles the old way 
 * --> InputStreamReadar
 * --> BufferReader 
 */
