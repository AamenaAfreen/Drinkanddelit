package com.capg.sprint1.model;

public class DistributorDetails {

	String distributorId;
	String name;
	String address;
	long phoneNumber;
	
	public DistributorDetails() {
		super();
	}

	public DistributorDetails(String distributorId, String name, String address, long phoneNumber) {
		super();
		this.distributorId = distributorId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "DistributorDetails [distributorId=" + distributorId + ", name=" + name + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
