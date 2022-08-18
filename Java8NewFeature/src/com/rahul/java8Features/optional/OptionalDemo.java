package com.rahul.java8Features.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.rahul.java8Features.flatMapAndMap.Customer;
import com.rahul.java8Features.flatMapAndMap.EkartDateBase;

public class OptionalDemo {
	
	/* 3way to create optional class 
	1. empty
	
	2. of
	3. ofNullable
	
	*/
	
	public static void main(String[] args) {
	
		Customer customer =new Customer(101, "ram", "rp@", Arrays.asList("11","22"));
		
	Optional<Object> emptyOptional	=Optional.empty();
	System.out.println(emptyOptional);
	
	Optional<Object> ofOptional	=Optional.of(customer.getEmail());
	System.out.println(ofOptional);
	
	Optional<Object> ofNullableOptional	=Optional.ofNullable(customer.getEmail());
	System.out.println(ofNullableOptional);
	
	}
	
}
