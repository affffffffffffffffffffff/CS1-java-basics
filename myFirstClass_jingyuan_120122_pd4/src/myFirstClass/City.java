package myFirstClass;

public class City {
	//1. Attributes
	private String name;
	private long population;
	private String province;
	private String country;
	private boolean stillExists;
	private double GDP;
	
	//2. Methods
	//2.1 Constructor
	public City() {}
	public City(String newCity) {
		name = newCity;
	}
	public City(String newCity, String newProvince, String newCountry) {
		name = newCity;
		province = newProvince;
		country = newCountry;
	}
	public City(String newCity, long newPopulation, double newGDP, boolean newExist) {
		name = newCity;
		population = newPopulation;
		GDP = newGDP;
		stillExists = newExist;
	}
	public City(String newCity, long newPopulation, String newProvince, String newCountry, boolean newExist, double newGDP) {
		name = newCity;
		population = newPopulation;
		province = newProvince;
		country = newCountry;
		stillExists = newExist;
		GDP = newGDP;
	}
	//2.2 Accessor
	public String getName() {
		return name;
	}
	public long getPopulation() {
		return population;
	}
	public String getProvince() {
		return province;
	}
	public String getCountry() {
		return country;
	}
	public boolean getExistance() {
		return stillExists;
	}
	public double getGDP() {
		return GDP;
	}
	//2.3 Setter
	public void setName(String newName) {
		name = newName;
	}
	public void setPopulation(long newPopulation) {
		population = newPopulation;
	}
	public void setProvince(String newProvince) {
		province = newProvince;
	}
	public void setCountry(String newCountry) {
		country = newCountry;
	}
	public void setExistance(boolean newExist) {
		stillExists = newExist;
	}
	public void setGDP(double newGDP) {
		GDP = newGDP;
	}
	//2.4 Auxiliary Methods
	public String toString() {
		String str = "City Name :: " + getName() + "\n" +
					 "Population :: " + getPopulation() + "\n" +
					 "Location :: " + getProvince() + ", " + getCountry() + "\n" +
					 "Still Exists :: " + (getExistance() ? "Yes" : "No") + "\n" +
					 "GDP :: " + getGDP()+ "\n";
		return str;
	}
}
