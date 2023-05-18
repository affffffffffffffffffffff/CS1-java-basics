package defaultpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) throws FileNotFoundException {
		int count = 0;
		Scanner dict, abc;
		dict = new Scanner(new File ("src\\defaultpackage\\dictionary_orig.txt"));
		abc = new Scanner(new File ("src\\defaultpackage\\abc_B.txt"));
		ArrayList<String> dictionary, list;
		dictionary = new ArrayList<String>();
		list = new ArrayList<String>();
		while (dict.hasNext()) {
			dictionary.add(dict.next());
		}
		dict.close();
		while (abc.hasNext()) {
			list.add(abc.next());
		}
		abc.close();
		for (int i = 0; i < list.size(); i++) {
			boolean inDict = false;
			for (int j = 0; j < dictionary.size(); j++) {
				if (list.get(i).equals(dictionary.get(j))) {
					inDict = true;
				}
			}
			if (!inDict) {
				count++;
			}
		}
		System.out.println("words not in dictionary_orig.txt: " + count);
	}

}
