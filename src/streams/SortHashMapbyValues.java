package streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapbyValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> budget = new HashMap<>();
		budget.put("clothes", 120);
		budget.put("rent", 150);
		budget.put("grocery", 150);
		budget.put("transportation", 100);
		budget.put("utility", 130);
		budget.put("miscellneous", 90);

		System.out.println("MAP before sorting: " + budget);

		Map<String, Integer> sorted = budget.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println("\n\nMAP after sorting: " + sorted);

		Map<String, Integer> sortedReverse = budget.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println("\n\nMAP after sorting reverse: " + sortedReverse);

		//
		Map<String, Integer> xx = budget.entrySet().stream().sorted((e1, e2) -> e1.getValue() - e2.getValue())
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println("\n\nMAP after sorting: xx " + xx);
		
		
		// JUST PRINTING SORTED
		budget.entrySet()
		.stream()
		.sorted(Map.Entry.<String, Integer>comparingByValue()) //(e1,e2)->e1.getValue()-e2.getValue()
		.forEach(System.out::println); 
		
		
	}

}
