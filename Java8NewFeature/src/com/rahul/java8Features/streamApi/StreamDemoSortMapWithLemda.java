package com.rahul.java8Features.streamApi;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.rahul.java8Features.streamApi.RealUseDemo.Employee;

public class StreamDemoSortMapWithLemda {
public static void main(String[] args) {
	Map<Employee,Integer> map = new TreeMap<>((o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
//	Map<Employee,Integer> map = new TreeMap();
	map.put(new Employee(1,"ram","me",57000),50);
	map.put(new Employee(2,"shyam","cs",67001),60);
	map.put(new Employee(3,"ganesh","ee",77002),30);
	map.put(new Employee(4,"mahadev","civil",87003),40);
	map.put(new Employee(5,"mahakal","computer",87006),10);
	map.put(new Employee(5,"bhole","it",87009),100);
	System.out.println(map);
	
//key object then how to use stream here==>
	//increasing order by salary
   map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
	//decreasing order by salary
   System.out.println("-----------by salary---------------");
   map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
//by dept
   System.out.println("--------by dept ---------------");
   map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept))).forEach(System.out::println);

}
}
