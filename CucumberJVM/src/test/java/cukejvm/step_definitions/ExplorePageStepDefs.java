package cukejvm.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cukejvm.support.SharedDriver;

import cukejvm.support.Utilities;
import cukejvm.support.pages.ExplorePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: kln
 * Date: 25/04/14
 * Time: 9:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExplorePageStepDefs {
    private final WebDriver driver;
    private ExplorePage explorePage;

    public ExplorePageStepDefs(SharedDriver driver) {
        this.driver = driver;
        explorePage = new ExplorePage(driver);
    }

    @When("^customer open Postpaid Explore page$")
    public void customerOpenExplorePage() throws Exception {
        explorePage.open("https://onlineshop.telstra.com.au");

        // close the warning message if test case is executed on non-supported OS
        if(!Utilities.isSupportOS()) {
            explorePage.click(By.cssSelector("#tmsLBPlatform div.tms-lb-header button"));
        }
    }

    @And("^select offer with code \"(.*?)\"$")
    public void customerSelectOffer(String offerCode) throws Exception {
        explorePage.goToCheckOutPageBaseOnOfferCode(offerCode);
    }
}
