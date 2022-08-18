package com.rahul.java8Features.flatMapAndMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	public static void main(String[] args) {
		List<Customer> customer = EkartDateBase.getAllCustomer();
		//covert list<custome> to lsit<String> from map() like small to uppercase is called data transferming
		//one to one mapping one customer have only one email id
		//cutomer->customer.getEmail() one to one mapping
		/*
		 * System.out.println("------iterate one by one----");
		 * customer.stream().map(cust->cust.getEmail()).forEach(System.out::println);
		 * System.out.println("------print  array----"); List<String> emails =
		 * customer.stream().map(cust->cust.getEmail()).collect(Collectors.toList());
		 * System.out.println(emails);
		 */
		
		
		//=========================list of phoneNo by flatMap()==========
		//stream of stream go for flatMap one to many mapping
		//nested list we go for flatMap
		//data flaTring mean convert to stream of stream in single stream
		
		List phonNo = customer.stream().flatMap(cust->cust.getMobNo().stream()).collect(Collectors.toList());
	System.out.println(phonNo);
	}
}
