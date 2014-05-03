package cukejvm.support.pages;

import cukejvm.support.Utilities;
import cukejvm.support.forms.AddOn;
import cukejvm.support.forms.CheckOutForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lnkhai
 * Date: 27/04/2014
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class AddOnPage extends BasePage {
    private List<String> addOnList;
    public AddOnPage(WebDriver driver, CheckOutForm checkOutForm) {
        this.driver = driver;
        this.checkOutForm = checkOutForm;
        addOnList = new ArrayList<String>();
    }

    public void selectAddOn(List<AddOn> addOns) throws Exception {
        if (addOns.size() > 0) {
            for (AddOn addOn : addOns) {
                click(By.id(addOn.getAddOnCode()));
            }

            // update the checkout form
            checkOutForm.getAddOnForm().setAddOnList(addOns);
        }

        click(By.id("btnNext-acc-addons"));

        // go back to the Add On Module to check the summarisation
        click(By.id("tabBtn0")); sleep(2000); click(By.id("tabBtn0"));
        String summaryText = getText(By.id("acc-addons"));

//        if (addOns.size() > 0) {
//            for (AddOn addOn : addOns) {
//                String priceToString = "$" + Utilities.currencyFormat(addOn.getAddOnPrice(), false) + " per month";
//                Assert.assertTrue("Addon Price is not correct", summaryText.indexOf(priceToString) >= 0);
//                Assert.assertTrue("Addon Name is not correct", summaryText.indexOf(addOn.getAddOnName()) >= 0);
//            }
//        } else {
//            Assert.assertTrue("Summary is not correct", summaryText.indexOf("No add ons") >= 0);
//        }
//
//        Assert.assertTrue("Summary Header is not correct", summaryText.indexOf("Optional extras") >= 0);
//
//        click(By.id("tabBtn1"));
//        click(By.id("tabBtn1"));
    }
}
