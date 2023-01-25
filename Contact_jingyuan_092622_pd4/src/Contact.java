
public class Contact {
	private String name;
	private int phoneNumber;
	
	public Contact(String n, int pn) {
		name = n;
		phoneNumber = pn;
	}
	public String toString() {
		return "Name = " + name + "\nPhone Number = " + phoneNumber;
	}
}
