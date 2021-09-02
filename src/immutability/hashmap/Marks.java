package immutability.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

final public class Marks {
	
	private final HashMap<String, Integer> marks;

	public Marks(HashMap<String, Integer> marks) {
		super();
		HashMap<String, Integer> temp=new HashMap<String, Integer>();
		for(Entry<String,Integer> e: marks.entrySet()) {
			temp.put(e.getKey(), e.getValue());
			
		}
		this.marks=temp;
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, Integer> getMarks() {
		return (HashMap<String, Integer>) marks.clone();
	}
	
	
}
