package com.spring.setter;

public class Address {

	private String addressLine1, city, state, country;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return addressLine1 + " " + city + " " + state + " " + country;
	}

	/*
	 * public void init() { System.out.println("Bean is going through init."); }
	 * 
	 * public void destroy() { System.out.println("Bean will destroy now."); }
	 */
}
