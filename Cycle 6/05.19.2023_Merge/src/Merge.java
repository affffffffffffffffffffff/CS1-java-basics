import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Merge {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner a, b;
		ArrayList<String> merged = new ArrayList<String>();
		a = new Scanner(new File("src\\abc_A.txt"));
		while (a.hasNext()) {
			merged.add(a.next());
		}
		a.close();
		b = new Scanner(new File("src\\abc_B.txt"));
		while (b.hasNext()) {
			merged.add(b.next());
		}
		b.close();
		alphabetize(merged);
		PrintWriter outFile = new PrintWriter(new FileWriter("abc_c.cvhs"));
		for (int i = 0; i < merged.size(); i++) {
			outFile.println(merged.get(i));
		}
		outFile.close();
	}
	
	public static void alphabetize(ArrayList<String> in) {
		boolean done = false;
		while (!done) {
			int count = 0;
			for (int i = 0; i < in.size(); i++) {
				if (i < in.size() - 1)
					if (in.get(i).compareToIgnoreCase(in.get(i + 1)) > 0)
						in.set(i + 1, in.set(i, in.get(i+1)));
			}
			for (int i = 0; i < in.size(); i++) {
				if (i < in.size() - 1) 
					if (in.get(i).compareToIgnoreCase(in.get(i + 1)) > 0)
						count++;
			}
			if (count == 0)
				done = true;
		}
		return;
	}

}
