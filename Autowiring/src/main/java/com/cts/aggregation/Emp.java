package com.cts.aggregation;

/*In this example, Employee has an object of Address, address object
 *  contains its own informations such as city,state, country etc. 
 *  In such case relationship is Employee HAS-A address.*/

public class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "india");
		Address address2 = new Address("gno", "UP", "india");

		Emp e = new Emp(111, "varun", address1);
		Emp e2 = new Emp(112, "arun", address2);

		e.display();
		e2.display();

	}
}