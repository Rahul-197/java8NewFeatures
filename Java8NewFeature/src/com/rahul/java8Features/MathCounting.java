package com.rahul.java8Features;

import java.util.Iterator;

public class MathCounting {
	public static void main(String[] args) {
		
		int sum =0;
		for (int j = 1; j <=12; j++) {
			sum +=j;
			
		}
		
		String outPut = sum+"jv457hub8";
		int count =0;
		String finalOutPut="";
		for(int i =0;i<outPut.length();i++)
		{
			count++;
			if(count ==3)
			{
				finalOutPut =finalOutPut+"X";
				count=0;
				continue;
			}
			finalOutPut=finalOutPut+outPut.charAt(i);
		}
		System.out.println(finalOutPut);
	}
}
