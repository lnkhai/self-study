package cukejvm.support.pages;

import cukejvm.support.forms.CheckOutForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: lnkhai
 * Date: 2/05/2014
 * Time: 8:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class ManageNumberPage extends BasePage {
    public ManageNumberPage(WebDriver driver, CheckOutForm checkOutForm) {
        this.driver = driver;
        this.checkOutForm = checkOutForm;
    }

    public void selectOrderType(String orderType) throws Exception {
        String mobileNumber = "";
        if (orderType.equalsIgnoreCase("new")) {
            click(By.id("numberChoice-new"));
        } else if (orderType.equalsIgnoreCase("recontract")) {
            mobileNumber = "0487654010";
            click(By.id("numberChoice-telstra"));
            type(By.id("numberChoice.existingTelstraNumber"), mobileNumber);
        } else if (orderType.equalsIgnoreCase("portin")) {
            click(By.id("numberChoice-port"));
        }

        click(By.id("btnNext-acc-numberChoice"));

        // set data back to checkout form
        checkOutForm.getManageNumberForm().setNumber(mobileNumber);
        checkOutForm.getManageNumberForm().setNumberType(orderType);

        // verify summary text
        String summaryText = getText(By.id("acc-numberChoice"));

        Assert.assertTrue("Summary text header is not correct for Number Management",
                summaryText.indexOf("Your choice for a mobile number") >= 0);
        if (orderType.equalsIgnoreCase("new")) {
            Assert.assertTrue("Order type is not correct for New",
                    summaryText.indexOf("I want a new mobile number") >= 0);
        } else if (orderType.equalsIgnoreCase("recontract")) {
            Assert.assertTrue("Order type is not correct for Recontract",
                    summaryText.indexOf(checkOutForm.getManageNumberForm().getNumber()) >= 0);
        } else if (orderType.equalsIgnoreCase("portin")) {
            Assert.assertTrue("Order type is not correct for Portin",
                    summaryText.indexOf("I want to bring my mobile number from another carrier") >= 0);
        }
    }
}
