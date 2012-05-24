package com.telstra.modules;

public class ContactInformationModule {
	private String preferredEmail;
	private String confirmEmail;
	private String contactNumber;
	private String homeAddressLine1;
	private String homeAddressLine2;
	private String homeSuburb;
	private String homeState;
	private String homePostCode;
	private String recommendedFullAddress;
	
	public String getPreferredEmail() {
		return preferredEmail;
	}
	public void setPreferredEmail(String preferredEmail) {
		this.preferredEmail = preferredEmail;
	}
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getHomeAddressLine1() {
		return homeAddressLine1;
	}
	public void setHomeAddressLine1(String homeAddressLine1) {
		this.homeAddressLine1 = homeAddressLine1;
	}
	public String getHomeAddressLine2() {
		return homeAddressLine2;
	}
	public void setHomeAddressLine2(String homeAddressLine2) {
		this.homeAddressLine2 = homeAddressLine2;
	}
	public String getHomeSuburb() {
		return homeSuburb;
	}
	public void setHomeSuburb(String homeSuburb) {
		this.homeSuburb = homeSuburb;
	}
	public String getHomeState() {
		return homeState;
	}
	public void setHomeState(String homeState) {
		this.homeState = homeState;
	}
	public String getHomePostCode() {
		return homePostCode;
	}
	public void setHomePostCode(String homePostCode) {
		this.homePostCode = homePostCode;
	}
	public String getRecommendedFullAddress() {
		return recommendedFullAddress;
	}
	public void setRecommendedFullAddress(String recommendedFullAddress) {
		this.recommendedFullAddress = recommendedFullAddress;
	}
}
