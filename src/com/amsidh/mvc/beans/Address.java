package com.amsidh.mvc.beans;

public class Address {

	private Integer addressId;
	private String city;
	private String state;
	private Long pincode;
	private Location location;

	public Address(Integer addressId, String city, String state, Long pincode, Location location) {
		System.out.println("Address constructor called");
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.location = location;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
