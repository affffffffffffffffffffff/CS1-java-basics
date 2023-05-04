
public class MixedUpRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Hello Carnegie Rhinos", "Nemo dat quod non habet"};
		MixedUp s = new MixedUp(str[0]);
		MixedUp t = new MixedUp(str[1]);
		System.out.println(s);  //original phrase
		System.out.println(s.mix());  //mixed up letters
		System.out.println(t); //original phrase
		System.out.println(t.mix()); //mixed up letters

	}

}
