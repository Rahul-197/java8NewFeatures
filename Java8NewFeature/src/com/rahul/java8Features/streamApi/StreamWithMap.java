package com.rahul.java8Features.streamApi;

import java.util.HashMap;
import java.util.Map;

public class StreamWithMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(5, "c");
		map.put(3, "b");
		map.put(2, "d");
		map.put(4, "f");
		map.forEach((key,value)->System.out.println(key +" : "+value));
		map.entrySet().stream().forEach((obj)->System.out.println(obj));
	}
}
