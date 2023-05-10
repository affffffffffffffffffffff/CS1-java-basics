import java.util.ArrayList;
import java.util.Arrays;

public class Alpha {
	// 1.1 instance var
	private String[] words;
	
	// 2 method
	// 2.1 construct
	public Alpha() {}
	public Alpha(String[] x) {
		setWords(x);
	}
	// 2.2 set
	public void setWords(String[] x) {
		words = x;
	}
	// 2.3 get
	public String[] getWords() {
		return words;
	}
	// aux
	public String toString() {
		return Arrays.toString(getWords());
	}
	public ArrayList<String> alphabetize() {
		// import words to arraylist
		ArrayList<String> working;
		working = new ArrayList<String>();
		for (int i = 0; i < getWords().length; i++) {
			working.add(getWords()[i]);
		}
		// loop
		boolean done = false;
		while (!done) {
			// 1 iteration of bubble sort
			int count = 0;
			for (int i = 0; i < working.size(); i++) {
				if (i != working.size() - 1)
				if (working.get(i).compareTo(working.get(i+1)) > 0) {
					working.set(i+1, working.set(i, working.get(i+1)));
				}
			}
			// check if done
			for (int i = 0; i < working.size(); i++) {
				if (i != working.size() - 1)
				if (working.get(i).compareTo(working.get(i+1)) > 0) {
					count++;
				}
			}
			// break loop
			if (count == 0) {
				done = true;
			}
		}
		return working;
	}
}
