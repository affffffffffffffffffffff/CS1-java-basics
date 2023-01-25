public class SumIntegers{

   public static void main(String[] args){
       // 1. Declare Variable
	   int sum = 0;
       
	   // 3. Process
       for (int i = 0; i < 1000; i++)
       {
            sum += i + 1;
       }
       
       // 4. Output
       System.out.println("The sum of the Natural numbers is " + sum +".");

   }// end of main()
} //end of class