package cukejvm.support.pages;

import cukejvm.support.forms.CheckOutForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: lnkhai
 * Date: 2/05/2014
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContactInformationPage extends BasePage {
    public ContactInformationPage(WebDriver driver, CheckOutForm checkOutForm) {
        this.driver = driver;
        this.checkOutForm = checkOutForm;
    }

    public void inputContactInformation() throws Exception {
        type(By.id("contact.emailAddress"), checkOutForm.getContactInformationForm().getPreferredEmail());
        type(By.id("contact.confirmEmailAddress"), checkOutForm.getContactInformationForm().getConfirmEmail());
        type(By.id("contact.phoneNumber"), checkOutForm.getContactInformationForm().getContactNumber());
        click(By.id("btnNext-acc-contact"));

        String summaryText = getText(By.id("acc-contact"));
        Assert.assertTrue("Summary header is not correct for Contact Info",
                summaryText.indexOf("Your contact information") >= 0);
        Assert.assertTrue("Email is not correct for Contact Info",
                summaryText.indexOf(checkOutForm.getContactInformationForm().getPreferredEmail()) >= 0);
        Assert.assertTrue("Contact number is not correct for Contact Info",
                summaryText.indexOf(checkOutForm.getContactInformationForm().getContactNumber()) >= 0);
    }
}
