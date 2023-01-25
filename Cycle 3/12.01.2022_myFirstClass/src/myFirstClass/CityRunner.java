package myFirstClass;

public class CityRunner {

	public static void main(String[] args) {
		// 2.1
		City city1 = new City();
		City city2 = new City("Funny City");
		City city3 = new City("Random City", "Silly State", "Imaginary Country");
		City city4 = new City("Strange City", 324508694324L, 794592.40, true);
		City city5 = new City("Dead City", 2389475434543L, "Province'd", "Fake Country", false, 23958.45);
		
		// 2.4
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		System.out.println(city4);
		System.out.println(city5);
		
		// 2.2
		System.out.println(city5.getName());
		System.out.println(city5.getPopulation());
		System.out.println(city5.getProvince());
		System.out.println(city5.getCountry());
		System.out.println(city5.getExistance());
		System.out.println(city5.getGDP());
		
		// 2.3
		city1.setName("funni");
		city1.setPopulation(2893774589L);
		city1.setProvince("rice");
		city1.setCountry("United Nations");
		city1.setExistance(true);
		city1.setGDP(3489754315.34);
		
		System.out.println(city1);

	}

}
