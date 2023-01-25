package myFirstClass;

public class ShoesRunner {

	public static void main(String[] args) {
		// 2.1 Constructor
		Shoes shoe1 = new Shoes();
		Shoes shoe2 = new Shoes(10.5, "blueish");
		Shoes shoe3 = new Shoes("yellow");
		Shoes shoe4 = new Shoes("blue", 9.5);
		
		// 2.4
		System.out.println(shoe1);
		System.out.println(shoe2);
		System.out.println(shoe3);
		System.out.println(shoe4);
		
		// 2.2
		System.out.println(shoe1.getColor());
		System.out.println(shoe1.getSize());
		
		// 2.3
		shoe1.setColor("red");
		shoe1.setSize(11);

		System.out.println(shoe1.getColor());
		System.out.println(shoe1.getSize());
	}

}
