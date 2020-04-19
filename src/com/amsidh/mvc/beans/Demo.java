package com.amsidh.mvc.beans;

public class Demo {
	private Integer id;
	private String name;
	private Demo(){
		System.out.println("Demo default constructor called");
	}
	private Demo(Integer id, String name) {
		System.out.println("Demo with field constructor called");
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	

	
}
