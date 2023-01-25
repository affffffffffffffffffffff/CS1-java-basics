package third_jingyuan_082922_pd4;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double side1, side2, side3, sp, area;
		side1 = 34;
		side2 = 40;
		side3 = 56;
		sp = (side1 + side2  + side3)/2;
		area = java.lang.Math.sqrt(sp * (sp - side1) * (sp - side2) * (sp - side3));
		System.out.println("area of triangle = " + area);
		}

}
