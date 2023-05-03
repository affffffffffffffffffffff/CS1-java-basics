
public class WordExRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Great Whale Shark";
		WordEx m = new WordEx(str);
		System.out.println(m.exchange());  //"Shark Whale Great The"
		WordEx p = new WordEx("The Great Wall OF China");
		System.out.println(p.exchange());  //"China OF Wall Great The"
	}

}
