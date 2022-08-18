package com.rahul.java8Features.flatMapAndMap;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String email;
	private List<String> mobNo;
	public Customer(int i, String string, String string2, List<String> list) {
		super();
		this.id = i;
		this.name = string;
		this.email = string2;
		this.mobNo = list;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getMobNo() {
		return mobNo;
	}
	public void setMobNo(List<String> mobNo) {
		this.mobNo = mobNo;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", mobNo=" + mobNo + "]";
	}
	
	
}
