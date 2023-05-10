public class AlphaRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"zoo", "ants", "rhinos", "dog", "cat"};
		Alpha m = new Alpha(s);
		System.out.println(m.alphabetize());  //[ants, cat, dog, rhinos, zoo]
	}
}
