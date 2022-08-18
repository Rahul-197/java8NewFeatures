package com.rahul.java8Features.streamApi.RealUseDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDao {
	public static List<Employee> getEmployee()
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1,"ram","me",57000));
		list.add(new Employee(2,"shyam","cs",67001));
		list.add(new Employee(3,"ganesh","ee",77002));
		list.add(new Employee(4,"mahadev","civil",87003));
		return list;
	}
}