package com.amsidh.mvc.beans;

public class Location {
	private Double longitude;
	private Double latitude;

	public Location(Double longitude, Double latitude) {
		System.out.println("Location constructor called");
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

}
