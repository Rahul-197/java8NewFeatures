package com.rahul.java8Features.predicateFunctionalInterface;
//traditional way
import java.util.function.Predicate;

public class PredicateDemoFunctnIntr implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if(t%2==0)return true;
		else return false;
	}
	public static void main(String[] args) {
		Predicate<Integer> prd = new PredicateDemoFunctnIntr();
		System.out.println(prd.test(5));
	}

}
