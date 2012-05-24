package com.telstra.lab;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telstra.ProjectProperties;
import com.telstra.pages.MobileShopHomePage;
import com.thoughtworks.selenium.Selenium;

public class SelectAllSizeBYOAndMobilePlanTest {
	private WebDriver driver;
	private Selenium selenium;
	private String baseURL;
	private ProjectProperties properties;
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		properties = new ProjectProperties();
		baseURL = properties.getBase_url();
		try {
			selenium = new WebDriverBackedSelenium(driver, baseURL);
		} catch (Exception e) {
			e.printStackTrace();
			selenium = null;
		}
	}
	
	@After 
	public void tearDown() {
		// close the browser
		try {
			selenium.stop();
		} catch (Exception e) {}
	}
	
	@Test
	public void expandBYOAllSizeTest() {
		if (selenium == null) {
			Assert.fail("Could not initialize Selenium!");
		}
		
		MobileShopHomePage homePage = new MobileShopHomePage(selenium);
		homePage.open();
		homePage.expandBYOTab("S");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		
		homePage.expandBYOTab("M");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		
		homePage.expandBYOTab("L");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		
		homePage.expandBYOTab("XL");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		
	}
	
	public void expandMobilePlanAllSizeTest() {
		
	}
}
