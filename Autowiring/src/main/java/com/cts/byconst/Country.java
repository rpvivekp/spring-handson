
package com.cts.byconst;

public class Country {

	String countryName;
	Capital capitalObj;

	public Country(String countryName, Capital capitalObj) {
		super();
		this.countryName = countryName;
		this.capitalObj = capitalObj;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Capital getCapitalObj() {
		return capitalObj;
	}

	public void setCapitalObj(Capital capitalObj) {
		this.capitalObj = capitalObj;
	}

}