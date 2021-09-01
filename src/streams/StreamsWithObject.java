package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsWithObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"A",30000));
		list.add(new Employee(2,"F",20000));
		list.add(new Employee(3,"C",40000));
		list.add(new Employee(4,"E",50000));
		list.add(new Employee(5,"B",40000));
		list.add(new Employee(6,"A",10000));
		
		// forEach
		list.stream().forEach(System.out::println);
		
		// filter
		System.out.println("\nFILTER: e.getSalary() ");
		list.stream().filter(e -> e.getSalary()>=30000).forEach(System.out::println);
		
		System.out.println("\nFILTER: e.salary ");
		list.stream().filter(e -> e.salary>=30000).forEach(System.out::println);
		
		// map
		System.out.println("\nMap : update employee slary by 100 ");
		
		
		list.stream().map(e ->{ 
				e.setSalary(e.salary+100);
				return e;
				}
			).forEach(System.out::println);
				
		
		System.out.println("\nMap : Name and their count");
		
		Set<String> set = list.stream().map(e -> 
		    	{
		         return e+" ("+Collections.frequency(list, e)+")";
		     }).collect(Collectors.toSet());
		
		System.out.println(set);
		
		// minimum salary
		
		System.out.println("Minimum Salary: " + list.stream().min((e1,e2) -> e1.salary-e2.salary).get());
		
		// max salary
		
		System.out.println("Minimum Salary: " + list.stream().max((e1,e2) -> e1.salary-e2.salary).get());
				
		
		System.out.println("Original List: "+list);
		
		// add to map key=id value=name
		Map<Integer, String> employeemapidName = list.stream().collect( 
				Collectors.toMap(Employee::getId, Employee::getName) );
		System.out.println(employeemapidName);
		
		
		// add to hashMap id -> employee
		Map<Integer, Employee> employeesMap = list.stream().collect( 
				Collectors.toMap(Employee::getId, Function.identity()) );
		System.out.println(employeesMap);
		
		// add to map group by name
		
		 Map<String, List<Employee>> groupbyInMAP = list.stream()
                 .collect(Collectors.groupingBy(Employee::getName));
		 
		 System.out.println(groupbyInMAP);
		 
		
		 
		
	}

}
