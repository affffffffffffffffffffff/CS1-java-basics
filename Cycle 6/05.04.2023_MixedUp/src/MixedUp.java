import java.util.Random;

public class MixedUp {
	// 1. instance var
	private String phrase;
	
	// 2. method
	// 2.1 constructor
	public MixedUp() {}
	public MixedUp(String str) {
		setPhrase(str);
	}
	
	// 2.2 set
	public void setPhrase(String str) {
		phrase = str;
	}
	
	// 2.3 get
	public String getPhrase() {
		return phrase;
	}
	
	// 2.4 auxiliary
	public String toString() {
		return getPhrase();
	}
	public String mix() {
		// variables
		String result = "";
		Random rand = new Random();
		String split[] = getPhrase().split(" "); // split original string by words
		for (int i = 0; i < split.length; i++) { // randomize letters
			char outWord[] = new char[split[i].length()];
			String word = split[i];
			for (int j = 0; j < word.length(); j++) { 
				int random;
				do { // keep generating random array slot to put current character in
					random = rand.nextInt(word.length());
				} while (outWord[random] != 0); // if the output array slot isn't already filled
				outWord[random] = word.charAt(j);
			}
			for (int j = 0; j < outWord.length; j++) { // append each letter of word to result string
				result = result + Character.toString(outWord[j]);
			}
			if (i != split.length - 1) { // add space if not end of phrase
				result = result + " ";
			}
		}
		return result;
	}
}
