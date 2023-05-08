import java.util.ArrayList;
import java.util.Arrays;

public class Arrange1 {
	// 1.1 instance var
	private int[] num;
	
	// 2 method
	// 2.1 construct
	public Arrange1() {}
	public Arrange1(int[] x) {
		setNum(x);
	}
	// 2.2 set
	public void setNum(int[] x) {
		num = x;
	}
	// 2.3 get
	public int[] getNum() {
		return num;
	}
	// aux
	public String toString() {
		return Arrays.toString(getNum());
	}
	public ArrayList<Integer> arrange1() {
		// import num to arraylist
		ArrayList<Integer> working;
		working = new ArrayList<Integer>();
		for (int i = 0; i < getNum().length; i++) {
			working.add(getNum()[i]);
		}
		// loop
		boolean done = false;
		while (!done) {
			// 1 iteration of bubble sort
			int count = 0;
			for (int i = 0; i < working.size(); i++) {
				if (i != working.size() - 1)
				if (working.get(i) > working.get(i+1)) {
					working.set(i+1, working.set(i, working.get(i+1)));
				}
			}
			// check if done
			for (int i = 0; i < working.size(); i++) {
				if (i != working.size() - 1)
				if (working.get(i) > working.get(i+1)) {
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
