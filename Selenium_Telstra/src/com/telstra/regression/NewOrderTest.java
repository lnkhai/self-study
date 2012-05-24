package com.telstra.regression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.opera.core.systems.OperaDriver;
import com.telstra.ProjectProperties;
import com.telstra.modules.AllInputModules;
import com.thoughtworks.selenium.Selenium;

public class NewOrderTest {
	private Selenium selenium;
	private WebDriver driver;
	private ProjectProperties properties;
	private String browser;
	
	public NewOrderTest(String browser) {
		this.browser = browser;
	}
	
	@Parameters
	public static Collection<Object[]> getTestData() {
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		List<String> browserList = new ArrayList<String>();
		ProjectProperties prop = new ProjectProperties();
		
		browserList.add("chrome");
		if (prop.getAll_browser().equalsIgnoreCase("true")) {
			browserList.add("ie");
			browserList.add("firefox");
			browserList.add("safari");
		}
		
		// generate collection of data for test suite
		for (String item: browserList) {
			data.add(new Object[] {item});
		}
		
		return data;
	}
	
	@Before
	public void setUp() throws Exception {
		ProjectProperties properties = new ProjectProperties();
		if (browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		
		selenium = new WebDriverBackedSelenium(driver, properties.getBase_url());
	}
	
	@After
	public void tearDown() throws Exception {
		try {
			selenium.stop();
		} catch (Exception e) { }
	}
}
