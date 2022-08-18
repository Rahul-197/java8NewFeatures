package com.rahul.java8Features.supplierFunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class SupplierWithListLemda {
	public static void main(String[] args) {
		 List<String> list = Arrays.asList("a","b","c");
		 List<String> list1 = Arrays.asList();
			 
		 System.out.println(list1.stream().findAny().orElseGet(()->"hi java"));
	}
}
  