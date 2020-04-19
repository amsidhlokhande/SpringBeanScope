package com.amsidh.mvc.beans;

public class Person {

	private Integer personId;
	private String personName;
	private Address address;

	private Person(Integer personId, String personName, Address address) {
		System.out.println("Person constructor called");
		this.personId = personId;
		this.personName = personName;
		this.address = address;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
