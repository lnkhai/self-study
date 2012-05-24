package com.telstra.modules;

public class DeliveryAddressModule {
	private String deliveryCompanyName;
	private String deliveryAddressLine1;
	private String deliveryAddressLine2;
	private String deliverySuburb;
	private String deliveryState;
	private String deliveryPostCode;
	private String recommendedFullAddress;
	
	public String getDeliveryCompanyName() {
		return deliveryCompanyName;
	}
	public void setDeliveryCompanyName(String deliveryCompanyName) {
		this.deliveryCompanyName = deliveryCompanyName;
	}
	public String getDeliveryAddressLine1() {
		return deliveryAddressLine1;
	}
	public void setDeliveryAddressLine1(String deliveryAddressLine1) {
		this.deliveryAddressLine1 = deliveryAddressLine1;
	}
	public String getDeliveryAddressLine2() {
		return deliveryAddressLine2;
	}
	public void setDeliveryAddressLine2(String deliveryAddressLine2) {
		this.deliveryAddressLine2 = deliveryAddressLine2;
	}
	public String getDeliverySuburb() {
		return deliverySuburb;
	}
	public void setDeliverySuburb(String deliverySuburb) {
		this.deliverySuburb = deliverySuburb;
	}
	public String getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}
	public String getDeliveryPostCode() {
		return deliveryPostCode;
	}
	public void setDeliveryPostCode(String deliveryPostCode) {
		this.deliveryPostCode = deliveryPostCode;
	}
	public String getRecommendedFullAddress() {
		return recommendedFullAddress;
	}
	public void setRecommendedFullAddress(String recommendedFullAddress) {
		this.recommendedFullAddress = recommendedFullAddress;
	}
}
