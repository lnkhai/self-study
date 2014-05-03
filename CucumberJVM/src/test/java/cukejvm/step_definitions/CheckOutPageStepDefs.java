package cukejvm.step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cukejvm.support.SharedDriver;
import cukejvm.support.forms.CheckOutForm;
import cukejvm.support.pages.*;
import org.openqa.selenium.WebDriver;
import cukejvm.support.forms.AddOn;

import java.util.List;

public class CheckOutPageStepDefs {
    private final WebDriver driver;
    private CheckOutForm checkOutForm;
    private WhatYouNeedPage whatYouNeedPage;
    private CustomiseDevicePage customiseDevicePage;
    private SharedDataPage sharedDataPage;
    private AddOnPage addOnPage;
    private NameDOBPage nameDOBPage;
    private ManageNumberPage manageNumberPage;
    private ContactInformationPage contactInformationPage;

    public CheckOutPageStepDefs(SharedDriver sharedDriver, CheckOutForm checkOutForm) {
        this.driver = sharedDriver;
        this.checkOutForm = checkOutForm;
        whatYouNeedPage = new WhatYouNeedPage(driver, checkOutForm);
        customiseDevicePage = new CustomiseDevicePage(driver, checkOutForm);
        sharedDataPage = new SharedDataPage(driver, checkOutForm);
        addOnPage = new AddOnPage(driver, checkOutForm);
        nameDOBPage = new NameDOBPage(driver, checkOutForm);
        manageNumberPage = new ManageNumberPage(driver, checkOutForm);
        contactInformationPage = new ContactInformationPage(driver, checkOutForm);
    }

    @Given("^customer want to make (New|Recontracting|Porting) Postpaid Order$")
    public void customerWantToBuyPostpaidOrder(String orderType) {
        // this step is to help scenario to be better understandable
    }

    @And("customer click \"Next\" at \"What you need to order\" module")
    public void customerInputWhatYouNeedModule() throws Exception {
        whatYouNeedPage.inputWhatYouNeed();
    }

    @And("^customer select memory size ([0-9]+GB) and ([a-zA-Z]+) color at \"Customise Device\" module$")
    public void selectSizeAndColorModule(String memorySize, String color) throws Exception {
        customiseDevicePage.customiseDevice(memorySize, color);
    }

    @And("^customer select (no|all) extra SIM at Shared Data form$")
    public void selectShareDataModule(String shareData) throws Exception {
        if (shareData.equalsIgnoreCase("all")) {
            sharedDataPage.inputSharedData(true);
        } else {
            sharedDataPage.inputSharedData(false);
        }
    }

    @And("^customer select Add-On with code:$")
    public void selectAddOn(DataTable addOnCodes) throws Exception {
        List<AddOn> list = addOnCodes.asList(AddOn.class);
        addOnPage.selectAddOn(list);
    }

    @And("^customer input their name and date of birth$")
    public void inputNameDOB() throws Exception {
        nameDOBPage.inputNameDOB();
    }

    @And("^customer choose start (new|recontract|portin) order with Telstra$")
    public void selectOrderType(String orderType) throws Exception {
        manageNumberPage.selectOrderType(orderType);
    }

    @And("^customer input contact information$")
    public void inputContactInfo() throws Exception {
        contactInformationPage.inputContactInformation();
    }
}
