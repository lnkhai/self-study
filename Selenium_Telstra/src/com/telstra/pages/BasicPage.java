package com.telstra.pages;

import com.thoughtworks.selenium.Selenium;

public class BasicPage {
	protected Selenium selenium;
 
	/**
	 * Default open operation: Open Online Shop Post Paid
	 */
	public void open() {
		selenium.open("/mobileshop");
	}
	
	/**
	 * Start purchase flow
	 */
	public void startPurchaseFlow() {
		//TODO: to be overwritten by children classes
	}
}
