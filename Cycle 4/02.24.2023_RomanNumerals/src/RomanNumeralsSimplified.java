public class RomanNumerals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one = 10;
		int two = 100;
		int three = 1000;
		int four = 2500;
		int five = 1500;
		int six = 23;
		int seven = 38;
		int eight = 49;
		String nine = "LXXVII";
		String ten = "XLIX";
		String eleven = "XX";
		String twelve = "XXXVIII";
		System.out.println(one + " is " + atoR(one));
		System.out.println(two + " is " + atoR(two));
		System.out.println(three + " is " + atoR(three));
		System.out.println(four + " is " + atoR(four));
		System.out.println(five + " is " + atoR(five));
		System.out.println(six + " is " + atoR(six));
		System.out.println(seven + " is " + atoR(seven));
		System.out.println(eight + " is " + atoR(eight));
		System.out.println(nine + " is " + rtoA(nine));
		System.out.println(ten + " is " + rtoA(ten));
		System.out.println(eleven + " is " + rtoA(eleven));
		System.out.println(twelve + " is " + rtoA(twelve));
	}
	
	public static int rtoA(String p) {
		int x = 0;
		for (int indexAt = 0; indexAt < p.length(); indexAt++) {
			if (p.length() - indexAt > 1) {
				if (p.charAt(indexAt) == 'C' && p.charAt(indexAt + 1) == 'M') {
					x += 900;
					indexAt++;
					continue;
				}
				else if (p.charAt(indexAt) == 'C' && p.charAt(indexAt + 1) == 'D') {
					x += 400;
					indexAt++;
					continue;
				}
				else if (p.charAt(indexAt) == 'X' && p.charAt(indexAt + 1) == 'C') {
					x += 90;
					indexAt++;
					continue;
				}
				else if (p.charAt(indexAt) == 'X' && p.charAt(indexAt + 1) == 'L') {
					x += 40;
					indexAt++;
					continue;
				}
				else if (p.charAt(indexAt) == 'I' && p.charAt(indexAt + 1) == 'X') {
					x += 9;
					indexAt++;
					continue;
				}
				else if (p.charAt(indexAt) == 'I' && p.charAt(indexAt + 1) == 'V') {
					x += 4;
					indexAt++;
					continue;
				}
			}
			if (p.charAt(indexAt) == 'M') {
				x += 1000;
			} 
			else if (p.charAt(indexAt) == 'D') {
				x += 500;
			}
			else if (p.charAt(indexAt) == 'C') {
				x += 100;
			}
			else if (p.charAt(indexAt) == 'L') {
				x += 50;
			}
			else if (p.charAt(indexAt) == 'X') {
				x += 10;
			}
			else if (p.charAt(indexAt) == 'V') {
				x += 5;
			}
			else if (p.charAt(indexAt) == 'I') {
				x++;
			}
			else {
				x = -1;
				break;
			}
		}
		return x;
	}
	
	public static String atoR(int q) {
		String str = "";
		int p = q;
        int arrayCount = 0;
        int[] libA = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] libR = {"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		while (arrayCount < 12) {
			if (p >= libA[arrayCount]) {
				str = str + libR[arrayCount];
				p -= libA[arrayCount];
			}
			else {
				arrayCount++;
			}
		}
		return str;
	}

}
