package methods101_jingyuan_102522_pd4;

public class MyMethods {

	public static void main(String[] args) {
		//System.out.printf("area = %.2f\n",  circleArea(10));
		System.out.printf("area of triangle = %.2f\n", triangleArea(10, 5));
		System.out.printf("area of triangle = %.2f\n", triangleArea(4.8, 3));
		System.out.printf("period = %.4f\n", pendelumPeriod(0.7));
		System.out.printf("period = %.4f\n", pendelumPeriod(1));
		System.out.printf("period = %.4f\n", pendelumPeriod(0.5));
		System.out.printf("distance = %.3f\n", distanceP1P2(2,1.5,-2.4,-5));
		System.out.printf("distance = %.3f\n",  distanceP1P2(3.2,-2.4,-4,2));
		System.out.printf("volume of cone = %.3f\n", coneVolume(10,3.5));
		System.out.printf("volume of cone = %.3f\n", coneVolume(8,4));
		System.out.printf("volume of cone = %.3f\n", coneVolume(5.5,7.2));
	}//end of main

	/* illustration
	public static double areaCircle(double radius) {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}//end of areaCircle
	*/
	
	public static double triangleArea(double base, double height) {
		double area = 0.5 * base * height;
		return area;
	}//end of triangleArea
	
	public static double pendelumPeriod(double length) {
		double period = 2 * Math.PI * Math.sqrt(length/9.81);
		return period;
	}//end of pendelumPeriod
	
	public static double distanceP1P2(double x1, double y1, double x2, double y2) {
		double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return distance;
	}//end of distanceP1P2
	
	public static double coneVolume(double height, double radius) {
		double volume = (Math.PI * Math.pow(radius, 2) * height)/3;
		return volume;
	}//end of coneVolume
	
}//end of class
