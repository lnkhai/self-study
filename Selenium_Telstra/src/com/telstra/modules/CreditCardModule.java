package com.telstra.modules;

public class CreditCardModule {
	private String cardType;
	private String cardNumber;
	private String nameOnCard;
	private String expireMonth;
	private String expireYear;
	private String ccvCode;
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getExpireMonth() {
		return expireMonth;
	}
	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}
	public String getExpireYear() {
		return expireYear;
	}
	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	}
	public String getCcvCode() {
		return ccvCode;
	}
	public void setCcvCode(String ccvCode) {
		this.ccvCode = ccvCode;
	}
}
