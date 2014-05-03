package cukejvm.support.pages;

import cukejvm.support.forms.CheckOutForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatYouNeedPage extends BasePage {
    public WhatYouNeedPage(WebDriver driver, CheckOutForm checkOutForm) {
        this.driver = driver;
        this.checkOutForm = checkOutForm;
    }

    public void inputWhatYouNeed() throws Exception {
        this.click(By.id("btnNext-acc-whatYouNeed"));

        Assert.assertTrue(getText(By.id("acc-whatYouNeed")).indexOf("What you need to order") >= 0);
    }
}
