import java.util.Arrays;

public class Arrays201 {

	public static void main(String[] args) {

		//#1 data
		int[] num11 = { 2, 7, 5, 6, 6, 6, 7, 7, 3, 3, 4, 5, 6}; //sumLast(num11) returns 22
		int[] num12 = { 2, 7, 5, 6, 6, 6, 7, 7, 3, 3, 4, 5, 3}; //sumLast(num12) returns 2
		System.out.println(sumLast(num11));
		System.out.println(sumLast(num12));
		
		//#2 data
		int[] num21 = { 2, 7, 5, 6, 6, 6, 7, 7, 3, 3, 4, 5, 6}; //sumOdd(num21) returns 34
		int[] num22 = { 2, 5, 6, 1, 6,-5, 7, 3,-3, 4, 5, 4}; //sumOdd(num22) returns 12
		System.out.println(sumOdd(num21));
		System.out.println(sumOdd(num22));

		//#3 data
		int[] num31 = { 2, 7, 5, 6, 6, 6, 7, 7, 3, 3, 4, 5, 6}; //sumVal(num31,4) returns 55
		int[] num32 = { 9, 5, 6, 1, 6,-5, 7, 3,-3, 4, 5,8}; //sumVal(num32,6) returns 24
		System.out.println(sumVal(num31,4));
		System.out.println(sumVal(num32,6));

		//#4 data
		String[] str41 = {"delegate", "instance", "rhino","desiccate","vague"}; //endsInS(str41) returns ""
		String[] str42 = {"entoces", "actum", "rhinos","beignets","vague"}; //endsInS(str42) returns "entonces"
		System.out.println(endsInS(str41));
		System.out.println(endsInS(str42));

		//#5 data
		String[] str51 = {"delegate", "instance", "running","desiccate","jumping", "swimming"}; //hasIng(str51) returns [running, jumping, swimming]
		String[] str52 = {"ping", "skiing", "rhinos","beignets","sleeping","working"};//hasIng(str52) returns [ping, skiing, sleeping, working]
		System.out.println(Arrays.toString(hasIng(str51)));
		System.out.println(Arrays.toString(hasIng(str52)));
	
	} // end of main
	
	public static int sumLast(int[] p) {
		int x = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] < p[p.length - 1]) x += p[i];
		}
		return x;
	}
	
	public static int sumOdd(int[] p) {
		int x = 0;
		for (int i = 1; i < p.length; i += 2) {
			x += p[i];
		}
		return x;
	}
	
	public static int sumVal(int[] p, int q) {
		int x = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] > q) x += p[i];
		}
		return x;
	}
	
	public static String endsInS(String[] p) {
		String str = "";
		for (int i = 0 ; i < p.length; i++) {
			if (p[i].charAt(p[i].length() - 1) == 's') {
				str = p[i];
				break;
			}
		}
		return str;
	}
	
	public static String[] hasIng(String[] p) {
		int ing = 0;
		int skipped = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i].substring(p[i].length() - 3).equals("ing")) ing++;
		}
		String[] x = new String[ing];
		for (int i = 0; i < p.length; i++) {
			if (!p[i].substring(p[i].length() - 3).equals("ing")) {
				skipped++;
			}
			else {
				x[i - skipped] = p[i];
			}
		}
		return x;
	}

}// end of class