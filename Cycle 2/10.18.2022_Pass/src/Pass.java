import java.util.*;
public class Pass
{
	public static void main(String[] args)
	{
		int grade;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter a number grade: ");
		grade = input.nextInt();

		if (grade >= 90) // grade is greater than or equal to 90
		{
			System.out.println("You made an A!");
		}
		else if (grade >= 80) // grade is greater than or equal t
		{
			System.out.println("You made a B!");
		}
		else if (grade >= 70) // grade is greater than or equal t
		{
			System.out.println("You made a C!");
		}
		else if (grade >= 60) // grade is greater than or equal t
		{
			System.out.println("You made a D!");
		}
		else
		{
			System.out.println("Study Harder!");
		}
		
		input.close();
	}
}