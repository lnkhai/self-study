package cukejvm.support.pages;

import cukejvm.support.Utilities;
import cukejvm.support.forms.CheckOutForm;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NameDOBPage extends BasePage {
    public NameDOBPage(WebDriver driver, CheckOutForm checkOutForm) {
        this.driver = driver;
        this.checkOutForm = checkOutForm;
    }

    public void inputNameDOB() throws Exception {
        String day = new Integer(checkOutForm.getNameDOBForm().getDobDay()).toString();
        String month = new Integer(checkOutForm.getNameDOBForm().getDobMonth()).toString();
        String year = new Integer(checkOutForm.getNameDOBForm().getDobYear()).toString();
        String title = checkOutForm.getNameDOBForm().getTitle();
        String firstName = checkOutForm.getNameDOBForm().getFirstName();
        String lastName = checkOutForm.getNameDOBForm().getLastName();
        String fullNameAndTitle = title + " " + firstName + " " + lastName;
        String fullDOB = new Integer(checkOutForm.getNameDOBForm().getDobDay()).toString() + " " +
                Utilities.convertMonthFormat_xx_to_YYY(checkOutForm.getNameDOBForm().getDobMonth()) + " " +
                new Integer(checkOutForm.getNameDOBForm().getDobYear()).toString();
        select(By.id("personal.title"), title);
        type(By.id("personal.firstName"), firstName);
        type(By.id("personal.lastName"), lastName);
        select(By.id("personal.dobDay"), day);
        select(By.id("personal.dobMonth"), month);
        select(By.id("personal.dobYear"), year);

        click(By.id("btnNext-acc-personal"));

        // verify summary text
        String summaryText = getText(By.id("acc-personal"));
        Assert.assertTrue("Header is not correct at NameDOB Summary", summaryText.indexOf("Your name and birthday") >= 0);
        Assert.assertTrue("Name is not correct at NameDOB Summary", summaryText.indexOf(fullNameAndTitle) >= 0);
        Assert.assertTrue("DOB is not correct at NameDOB Summary", summaryText.indexOf(fullDOB) >= 0);
    }
}
