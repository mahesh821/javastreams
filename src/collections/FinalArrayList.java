package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final ArrayList<Integer> list = new ArrayList<>();
		System.out.println("List After Decleration: " + list);
		list.add(2);
		list.add(3);
		System.out.println("List After adding elements: " + list);
		
		List<Integer> unmodifiableList = Collections.unmodifiableList(list);
		
		System.out.println("unmodifiableList After adding elements: " + unmodifiableList);
		
		// unmodifiableList.add(10); gives UnsupportedOperationException
		// list=new ArrayList<>(); reinitialize cannot be done beacause list is final.

	}

}
