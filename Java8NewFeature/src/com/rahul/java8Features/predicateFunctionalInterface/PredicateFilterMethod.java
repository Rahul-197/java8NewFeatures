package com.rahul.java8Features.predicateFunctionalInterface;

import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PredicateFilterMethod {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,8,5,4,3,9,5,5);
		list.stream().filter(t->t%2==0).forEach(t->System.out.println("print even : "+t));
	}
}
