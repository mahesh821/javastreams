package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsWithInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(8);
		list.add(9);
		list.add(5);

		Stream<Integer> s = list.stream();

		// for each
		System.out.println("forEach: \n\n");
		s.forEach(System.out::println);

		// filter.
		System.out.println("\nMAP: \n\n");
		list.stream().filter(i -> i >= 5).forEach(System.out::println);

		// map
		System.out.println("\nMAP: \n\n");
		list.stream().map(i -> i * 2).forEach(System.out::println);

		// minimum
		System.out.println("\nMin: " + list.stream().min((i1, i2) -> i1 - i2).get());

		// maximum
		System.out.println("\nMax: " + list.stream().max((i1, i2) -> i1 - i2).get());

		// count

		System.out.println("\nCount Elements: " + list.stream().count());

		// collect

		List<Integer> streamList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println("Collected using collect: " + streamList);

		List<Integer> sortedByStream = list.stream().sorted((i1, i2) -> i2 - i1).collect(Collectors.toList());

		System.out.println("Sorted using Stream: " + sortedByStream);

		System.out.println("Original List: " + list);
		

	}

}
