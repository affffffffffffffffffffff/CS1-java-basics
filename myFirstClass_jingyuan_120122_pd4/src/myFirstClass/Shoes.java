package myFirstClass;

public class Shoes {
	// 1. Attributes
	private double size;
	private String color;
		
	// 2. Methods
	// 2.1 Constructor
	public Shoes() {} // default constructor
	public Shoes(String c) {
		color = c;
	}
	public Shoes(String c, double s) {
		color = c;
		size = s;
	}
	public Shoes(double s, String c) {
		size = s;
		color = c;
	}//method overloading
	//2.2 Accessors
	public double getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	//2.3 Setter
	public void setSize(double newSize) {
		size = newSize;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	//2.4 Auxiliary
	public String toString() {
		String str = "size: " + getSize() + "\n" + 
					 "color: " + getColor() + "\n";
		return str;
	}

}//end of class Shoes
