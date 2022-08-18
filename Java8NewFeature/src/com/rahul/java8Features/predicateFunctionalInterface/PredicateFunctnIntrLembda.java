package com.rahul.java8Features.predicateFunctionalInterface;

import java.util.function.Predicate;

public class PredicateFunctnIntrLembda {

	public static void main(String[] args) {
		Predicate<Integer> prd =t->t%2==0;
		System.out.println(prd.test(4));
	}
}
