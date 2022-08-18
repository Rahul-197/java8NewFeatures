package com.rahul.java8Features;
 
interface Calculator
{
	int sum(int i,int j);
}
public class StreamPro {
	public static void main(String[] args) {
		System.out.println("hello Java 8====>");
		
		Calculator cal =(i,j)->i+j;
		System.out.println(cal.sum(10,20));
	}
}