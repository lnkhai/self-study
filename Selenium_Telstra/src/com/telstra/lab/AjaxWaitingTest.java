package com.telstra.lab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.telstra.Constant;
import com.telstra.pages.PurchaseFlowPage;
import com.thoughtworks.selenium.Selenium;

public class AjaxWaitingTest {
	private WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://onlineshop.telstra.com.au";
	}

	@Test
	public void testTest() {
		driver.get(baseUrl + "/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div.grid-handset.grid-handset-XL")).click();
		driver.findElement(By.id("115223-tsofcp-129-24")).click();
		driver.findElement(By.id("personal.firstName")).clear();
		driver.findElement(By.id("personal.firstName")).sendKeys("Khai");
		driver.findElement(By.id("personal.lastName")).clear();
		driver.findElement(By.id("personal.lastName")).sendKeys("Le");
		new Select(driver.findElement(By.id("personal.dobDay"))).selectByVisibleText("17");
		new Select(driver.findElement(By.id("personal.dobMonth"))).selectByVisibleText("Nov");
		new Select(driver.findElement(By.id("personal.dobYear"))).selectByVisibleText("1979");
		driver.findElement(By.id("btnPersonal")).click();
		// wait here
		
		driver.findElement(By.id("numberChoice-new")).click();
		driver.findElement(By.id("btnNumberChoice")).click();
		// wait here
	}
	
	private void waitForModuleToLoad(String anID, String time) {
		WebElement myDynamicElement = (new WebDriverWait(driver, 30)).
				until(new ExpectedCondition<WebElement>(){
					@Override
					public WebElement apply(WebDriver d) {
						return d.findElement(By.id("someID"));
					}});
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
