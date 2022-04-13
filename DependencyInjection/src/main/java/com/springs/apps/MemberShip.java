package com.springs.apps;

public class MemberShip {
	private int membershipId;
	private String membershipType;
	private int visitsPerYear;

	public MemberShip(int membershipId, String membershipType, int visitsPerYear) {
		super();
		this.membershipId = membershipId;
		this.membershipType = membershipType;
		this.visitsPerYear = visitsPerYear;

	}

	public String toString() {
		return membershipId + " " + membershipType + " " + visitsPerYear;
	}
}
