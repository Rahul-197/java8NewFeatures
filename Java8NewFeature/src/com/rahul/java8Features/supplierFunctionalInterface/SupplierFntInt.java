package com.rahul.java8Features.supplierFunctionalInterface;

import java.util.function.Supplier;

//that method don't have any argument but it always expect return 
//traditional way
public class SupplierFntInt implements Supplier<String> {

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "supplier get method";
	}
	public static void main(String[] args) {
		Supplier<String> spl = new SupplierFntInt();
		System.out.println(spl.get());
	}

}
