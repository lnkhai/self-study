package com.telstra.pages;

import com.telstra.IDString;
import com.thoughtworks.selenium.Selenium;

public class MobileShopHomePage extends BasicPage {
	public MobileShopHomePage(Selenium selenium) {
		this.selenium = selenium;
	}
	
	public void open() {
		selenium.open("/");
	}
	
	/**
	 * select different tab size at home page 
	 */
	public void selectSizeTab(String size) {
		if (size.equalsIgnoreCase("S")) {
			selenium.click(IDString.HOME_PAGE_SIZE_S_TAB);
		} else if (size.equalsIgnoreCase("M")) {
			selenium.click(IDString.HOME_PAGE_SIZE_M_TAB);
		} else if (size.equalsIgnoreCase("L")) {
			selenium.click(IDString.HOME_PAGE_SIZE_L_TAB);
		} else if (size.equalsIgnoreCase("XL")) {
			selenium.click(IDString.HOME_PAGE_SIZE_XL_TAB);
		}
	}
	
	/**
	 * 
	 */
	public void expandBYOTab(String size) {
		selectSizeTab(size);
		try {
			selenium.click(IDString.HOME_PAGE_BYO_PANEL_EXPAND);
		} catch (Exception e) {	}
	}
	
	/**
	 * 
	 */
	public void expandMobilePlanTab(String size) {
		
	}
	
	/**
	 * 
	 */
	public void selectSpecifiedHandset(String handsetCode) {
		
	}
	
	 
}
