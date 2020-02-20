package com.capg.sprint1.model;

import java.util.Date;

public class ProductOrder {

	 String orderId;
	 String deliveryStatus;
	String name;
	double pricePerUnit;
	double quantityValue;
	double quantityUnit;
	double price;
	String wareouseId;
	Date deliveryDate;
	Date manufacturinDate;
	Date expiryDate;
	String qualityCheck;
	Date processDate;
	String distributorId;
	
	public ProductOrder() {
		super();
	}

	public ProductOrder(String orderId,String deliveryStatus,String name, double pricePerUnit, double quantityValue, double quantityUnit, double price,
			String wareouseId, Date deliveryDate, Date manufacturinDate, Date expiryDate, String qualityCheck,
			Date processDate, String distributorId) {
		super();
		this.orderId =orderId;
		this.deliveryStatus=deliveryStatus;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.wareouseId = wareouseId;
		this.deliveryDate = deliveryDate;
		this.manufacturinDate = manufacturinDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
		this.processDate = processDate;
		this.distributorId=distributorId;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public double getQuantityValue() {
		return quantityValue;
	}

	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}

	public double getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getWareouseId() {
		return wareouseId;
	}

	public void setWareouseId(String wareouseId) {
		this.wareouseId = wareouseId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Date getManufacturinDate() {
		return manufacturinDate;
	}

	public void setManufacturinDate(Date manufacturinDate) {
		this.manufacturinDate = manufacturinDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getQualityCeck() {
		return qualityCheck;
	}

	public void setQualityCeck(String qualityCeck) {
		this.qualityCheck = qualityCeck;
	}

	public Date getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	@Override
	public String toString() {
		return "ProductOrder [orderId=" + orderId + ", deliveryStatus=" + deliveryStatus + ", name=" + name
				+ ", pricePerUnit=" + pricePerUnit + ", quantityValue=" + quantityValue + ", quantityUnit="
				+ quantityUnit + ", price=" + price + ", wareouseId=" + wareouseId + ", deliveryDate=" + deliveryDate
				+ ", manufacturinDate=" + manufacturinDate + ", expiryDate=" + expiryDate + ", qualityCheck="
				+ qualityCheck + ", processDate=" + processDate + ", distributorId=" + distributorId + "]";
	}

	
	}

	
	

