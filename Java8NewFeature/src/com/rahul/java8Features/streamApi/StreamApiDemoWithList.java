package com.rahul.java8Features.streamApi;

import java.util.Arrays;
import java.util.List;

//we can achive functional programing, reduce code,bulk operation
//two method =>filter use for coditional check and foreach use for iteration
 
public class StreamApiDemoWithList 
{
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ram","Shyam","vishanu","shiv","brahma");
		list.stream().forEach((t)->System.out.println(t));
	}
}
