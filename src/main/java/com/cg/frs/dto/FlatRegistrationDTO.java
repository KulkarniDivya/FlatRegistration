package com.cg.frs.dto;

public class FlatRegistrationDTO {
	private int flatId;
	private int ownerId;
	private int flatType;
	private int flatArea;
	public int getFlatId() {
		return flatId;
	}
	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getFlatType() {
		return flatType;
	}
	public void setFlatType(int flatType) {
		this.flatType = flatType;
	}
	public int getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(int flatArea) {
		this.flatArea = flatArea;
	}
	public int getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(int rentAmount) {
		this.rentAmount = rentAmount;
	}
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
	private int rentAmount;
	private int depositAmount;
	public FlatRegistrationDTO(int flatId, int ownerId, int flatType, int flatArea, int rentAmount,
			int depositAmount) {
		// TODO Auto-generated constructor stub
		this.flatId = flatId;
		this.ownerId = ownerId;
		this.flatType = flatType;
		this.flatArea = flatArea;
		this.rentAmount = rentAmount;
		this.depositAmount = depositAmount;
	}
	public FlatRegistrationDTO()
	{
		
	}
	
}
