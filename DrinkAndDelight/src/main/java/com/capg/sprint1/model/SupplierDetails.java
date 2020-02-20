package com.capg.sprint1.model;

public class SupplierDetails {
	
	String supplierId;
	String name;
	String address;
	long phoneNumber;
	
	public SupplierDetails() {
		super();
	}

	public SupplierDetails(String supplierId, String name, String address, long phoneNumber) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
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
		return "SupplierDetails [supplierId=" + supplierId + ", name=" + name + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	}
