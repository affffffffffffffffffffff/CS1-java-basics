import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker {
	private String line;
	private int breaker;

	public LineBreaker() {
		setLineBreaker("", 0);
	}

	public LineBreaker(String s, int b) {
		setLineBreaker(s, b);
	}

	public void setLineBreaker(String s, int b) {
		line = s;
		breaker = b;
	}

	public String getLine() {
		return line;
	}

	public String[] getLineBreaker() {
		double numChar = 0;
		Scanner glb1 = new Scanner(getLine());
		while(glb1.hasNext()) {
			numChar += 1.0;
			glb1.next();
		}
		glb1.close();
		int numStr = (int)Math.ceil(numChar / breaker);
		String[] box = new String[numStr];
		Scanner glb2 = new Scanner(getLine());
		for (int i = 0; i < numStr; i++) {
			box[i] = "";
			for (int j = 0; j < breaker; j++) {
				if(glb2.hasNext()) box[i] = box[i] + glb2.next();
			}
		}
		glb2.close();
		return box;
	}

	public String toString() {
		String str = getLine() + "\n";
		String box[] = getLineBreaker();
		for (int i = 0; i < box.length; i++) {
			str = str + box[i] + "\n";
		}
		return str;
	}
}