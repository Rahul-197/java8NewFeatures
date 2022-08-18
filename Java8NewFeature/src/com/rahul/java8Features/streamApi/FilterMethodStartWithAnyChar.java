package com.rahul.java8Features.streamApi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterMethodStartWithAnyChar {
	public static void main(String[] args) {
		//list iterate
		List<String> list = Arrays.asList("Ram","Shyam","vishanu","Shiv","brahma");
		//traditional way ==>
		
		for(String lis : list)
		{
			if(lis.startsWith("S"))System.out.println(lis);
		}
	//with filter method lemda ===>
		list.stream().filter(t->t.startsWith("S")).forEach(t->System.out.println(t));
	//map iterate
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(5, "c");
		map.put(3, "b");
		map.put(2, "d");
		map.put(4, "f");
		map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t->System.out.println(t));
	}
}
