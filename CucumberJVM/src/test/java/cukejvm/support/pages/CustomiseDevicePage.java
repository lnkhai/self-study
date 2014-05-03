package cukejvm.support.pages;

import cukejvm.support.forms.CheckOutForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomiseDevicePage extends BasePage {
    public CustomiseDevicePage(WebDriver driver, CheckOutForm checkOutForm) {
        this.checkOutForm = checkOutForm;
        this.driver = driver;
    }

    public void customiseDevice(String size, String color) throws Exception {
        this.click(By.id(size));
        this.click(By.id(color));
        this.click(By.id("btnNext-acc-handsetOptions"));

        // assign the value back to global forms
        checkOutForm.getHandsetCustomiseForm().setColor(color);
        checkOutForm.getHandsetCustomiseForm().setMemorySize(size);

        String summaryText = getText(By.cssSelector("#acc-handsetOptions div.tms-module-summary"));
        Assert.assertTrue("Size is not match\n", summaryText.indexOf(size) >= 0);
        Assert.assertTrue("Color is not match\n", summaryText.indexOf(color) >= 0);
    }

    public void skipCustomiseTab() throws Exception {
        this.click(By.id("btnNext-acc-skipCustomise-handset"));
    }
}
