package com.rahul.java8Features.flatMapAndMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDateBase {
	public static List<Customer> getAllCustomer()
	{
		return Stream.of(
				new Customer(101, "ram", "ram@191", Arrays.asList("785956","7575447")),
				new Customer(101, "ram3", "ram@192", Arrays.asList("785953","7575347")),
				new Customer(101, "ram2", "ram@194", Arrays.asList("785952","7572547")),
				new Customer(101, "ram5", "ram@193", Arrays.asList("785958","7575647")),
				new Customer(101, "ram1", "ram@195", Arrays.asList("785595","7537547"))
				).collect(Collectors.toList());
	}
}
