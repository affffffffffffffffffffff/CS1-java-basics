
public class ArrangeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {9,10,1,0, 8, 6, 2, 4, 7, 3, 5};
		Arrange1  m = new Arrange1(num);

		System.out.println(m.arrange1());   // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(m);   // [9, 10, 1, 0, 8, 6, 2, 4, 7, 3, 5]
	}

}
