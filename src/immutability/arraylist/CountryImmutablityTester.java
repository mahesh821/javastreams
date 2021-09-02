package immutability.arraylist;

import java.util.ArrayList;

public class CountryImmutablityTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listOfStates = new ArrayList<String>();
		listOfStates.add("Madhya Pradesh");
		listOfStates.add("Maharastra");
		listOfStates.add("Gujrat");

		Country country = new Country("India", listOfStates);

		System.out.println("Country : " + country.getCountryName());
		System.out.println("List of states : " + country.getListOfStates());
		
		
		// It will be added to the list because we did not use clone in getListOfStates
		country.getListOfStates().add("Kerala");
		
		
		// It will be added to the list because we did not use deep copy in constructor
		listOfStates.add("Rajasthan");
		
		System.out.println("Updated List of states : " + country.getListOfStates());

	}

}
