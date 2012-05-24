package com.telstra.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.telstra.pages.BasicPage;
import com.thoughtworks.selenium.Selenium;

@RunWith(Parameterized.class)
public class CreateNewContractTransaction {
	private WebDriver driver;
	private Selenium selenium;
	private Object info;
	
	public CreateNewContractTransaction(Object info) {
		this.info = info;
	}
	
	@Parameters
	public static Collection<Object[]> getTestData() {
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		List<Object> infoList = new ArrayList<Object>();
		
		infoList.add(new Object());
		infoList.add(new Object());

		// generate collection of data for test suite
		for (Object item: infoList) {
			data.add(new Object[] {item});
		}
				
		return data;
	}
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		selenium = new WebDriverBackedSelenium(driver, "https://onlineshop.telstra.com.au");
	}

	@Test
	public void testCreateNewDefect() throws Exception {
		BasicPage custInfoPage = new BasicPage();
				
		try {
			custInfoPage.open();
			custInfoPage.startPurchaseFlow();
		} catch (Exception e) {
			System.out.println(e.toString());
			Assert.fail("Testcase failed because of controlling page!!!" + "<br/>" + info.toString());
		}	
	}

	@After
	public void tearDown() throws Exception {
		// close the browser
		try {
			selenium.stop();
		} catch (Exception e) {}
	}
}
