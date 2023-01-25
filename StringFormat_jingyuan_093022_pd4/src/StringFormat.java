
public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14159;
		String result;

		result = "PI = " + pi;
		System.out.println(result);
		 
		result = String.format("PI = %f", pi);
		System.out.println(result);
		 
		result = String.format("PI = %e", pi);
		System.out.println(result);
		 
		result = String.format("PI = %.2f", pi);
		System.out.println(result);
		 
		result = String.format("PI = %6.2f", pi);
		System.out.println(result);
		 
		result = String.format("PI = %06.2f", pi);
		System.out.println(result);
		
	}

}
