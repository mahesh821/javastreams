/*
 * 
 * Make your class final : 
 * 		If you make your class final, no class will be able to extend it, hence will
 * not be able override methods of this class.
 * 
 * Declare all instance variable with private and final : 
 * 		If you make instance variable private, no outside class will be able to
 * access instance variables and if you make them final, you can not change it.
 * 
 * Say no to setter methods :
 * 		Don’t create setter method for any instance variables, hence there will be
 * no explicit way to change state of instance variables.
 * 
 * Initialize all variables in constructor :
 * 		You can initialize variables in constructor. You need to take special care
 * while working with mutable object. You need to do deep copy in case of
 * immutable objects.
 * 
 * Perform cloning of mutable objects while returning from getter method:
 * 		If you return clone of object from getter method, it won’t return original
 * object, so your original object will remain intact.
 * 
 * 
 * 
 */
package immutability.arraylist;

import java.util.ArrayList;

public final class Country {

	private final String countryName;
	private final ArrayList<String> listOfStates;

	public Country(String countryName, ArrayList<String> listOfStates) {
		super();
		this.countryName = countryName;
		ArrayList<String> tempList =new ArrayList<String>();
		for(String state: listOfStates) {
			tempList.add(state);
		}
		this.listOfStates=tempList;
	}

	public String getCountryName() {
		return countryName;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<String> getListOfStates() {
//		return listOfStates;  We did not use clone in getListOfStates() method, 
//		so we are able to add “Kerala” to the listOfStates.
		
		return (ArrayList<String>) listOfStates.clone();
	}
	
	
}
