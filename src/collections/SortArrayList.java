package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(8);
		list.add(9);
		list.add(5);
		
		System.out.println("Given list: "+list);
		
		// sort.
		Collections.sort(list, (i1,i2) -> i2>i1?1:i2<i1?-1:0);
		
//		Collections.sort(list, (i1,i2) -> i2-i1);		
		// This approach also works
//		Collections.sort(list, (i1,i2) -> i1.compareTo(i2));
		
	
		System.out.println("After Sorting the  list: "+list);

	}

}
