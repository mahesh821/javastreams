package immutability.hashmap;

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
import java.util.HashMap;


public class MarksMapImmutablityTester {

	public static void main(String[] args) {
		
		HashMap<String, Integer> marksMap=new HashMap<>();
		marksMap.put("A", 50);
		marksMap.put("B", 40);
		marksMap.put("C", 60);
		marksMap.put("D", 80);
		
		Marks marks= new Marks(marksMap);
		
		System.out.println("Marks map: "+ marks.getMarks());
		
		marksMap.put("E", 90);
		
		System.out.println("Marks map(after adding E): "+ marks.getMarks());
		
		marks.getMarks().put("F",100);
		
		System.out.println("Marks map(after adding F): "+ marks.getMarks());
		
	}

}
