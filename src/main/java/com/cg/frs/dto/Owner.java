package com.cg.frs.dto;

public class Owner {
	private String ownerName;
	private String phoneNo;
	public Owner(String ownerName, String phoneNo) {
		// TODO Auto-generated constructor stub
		this.ownerName = ownerName;
		this.phoneNo = phoneNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
