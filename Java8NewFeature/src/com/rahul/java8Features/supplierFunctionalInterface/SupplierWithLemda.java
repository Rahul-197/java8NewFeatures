package com.rahul.java8Features.supplierFunctionalInterface;

import java.util.function.Supplier;

public class SupplierWithLemda 
	{
		public static void main(String[] args) 
		{
			Supplier<String> spl = ()->"Hi java example supplier interface with lemda ";
			System.out.println(spl.get());
		}
	}
