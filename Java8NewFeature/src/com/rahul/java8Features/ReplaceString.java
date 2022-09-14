package com.rahul.java8Features;

public class ReplaceString {

	public static void main(String[] args) {
		String str ="coderbyte";
		String OutPut ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			OutPut = OutPut+str.charAt(i);
		}
		int count =0;
		String finalOutPut ="";
		OutPut = OutPut+"jv457hub8";
		for(int i =0;i<OutPut.length();i++)
		{
			count++;
			if(count ==3)
			{
				finalOutPut =finalOutPut+"X";
				count=0;
				continue;
			}
			finalOutPut=finalOutPut+OutPut.charAt(i);
		}
		System.out.println(finalOutPut);
	}
}
