package com.rahul.java8Features.streamApi.RealUseDemo;

public class TexEligiable {
	public static  void evaluteTaxUsers()
	{
		// return ListDao.getEmployee().stream().filter(emp->emp.getSalary()<66000).collect(Collectors.toList());
		 ListDao.getEmployee().stream().filter(emp->emp.getSalary()>76000).forEach(emp->System.out.println(emp));
	}
	public static void main(String[] args) {
		evaluteTaxUsers();
		System.out.println();
	}
}