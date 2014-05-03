package cukejvm.support.pages;

import cukejvm.support.forms.CheckOutForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SharedDataPage extends BasePage {
    public SharedDataPage(WebDriver driver, CheckOutForm checkOutForm) {
        this.driver = driver;
        this.checkOutForm = checkOutForm;
    }

    public void inputSharedData(boolean requiredSharedData) throws Exception {
        if (requiredSharedData) {
            // select all three extra SIM: 1 standard, 1 micro and 1 nano SIM
            click(By.id("sdpUpgradeYes"));
            click(By.id("sdpSim0Type0"));
            click(By.id("sdpSimTgl1"));
            click(By.id("sdpSim0Type1"));
            click(By.id("sdpSimTgl2"));
            click(By.id("sdpSim0Type2"));
        }

        click(By.id("btnNext-acc-sharedDataPlan"));

        String summaryText = getText(By.cssSelector("#acc-sharedDataPlan div.tms-module-summary"));
        Assert.assertTrue("Summary is not correct for SharedData", summaryText.indexOf("Your Data Share Package") >= 0);
        if (requiredSharedData) {
            Assert.assertTrue("Summary is not correct for SharedData", summaryText.indexOf("Your Data Share Package") >= 0);
            Assert.assertTrue("Summary is not correct for SharedData", summaryText.indexOf("x3 Data Share SIMs") >= 0);
        } else {
            Assert.assertTrue("Summary is not correct for non-SharedData", summaryText.indexOf("None") >= 0);
        }
    }
}
