package com.springs.apps;

public class Customer {
	private int custId;
	private String custName;
	private String emailId;
	private long contactNo;
	private MemberShip memberShip;

	

	public Customer(int custId, String custName, String emailId, long contactNo,MemberShip memberShip) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.emailId = emailId;
		this.contactNo = contactNo;
		this.memberShip=memberShip;
	}

	
	void show() {
		System.out.println(custId + " " + custName + " " + emailId + " " + contactNo);
        System.out.println(memberShip.toString());
	}

}
