package cukejvm.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cukejvm.support.SharedData;
import cukejvm.support.SharedDriver;
import org.openqa.selenium.WebDriver;

public class HelloStepDefs {
    private final WebDriver webDriver;
    private SharedData sharedData;

    public HelloStepDefs(SharedDriver webDriver, SharedData sharedData) {
        this.webDriver = webDriver;
        this.sharedData = sharedData;
    }

    @Given("^I have a hello app with you$")
    public void I_have_a_hello_app_with() {
        System.out.println("Hello 1");
    }

    @When("^I ask it to say hi$")
    public void I_ask_it_to_say_hi() {
        System.out.println("Hello 2");
    }

    @Then("^it should answer with you$")
    public void it_should_answer_with() {
        System.out.println("Hello 3");
    }

    @Given("^this is a test drive$")
    public void test_driver() {
        webDriver.get("https://onlineshop.telstra.com.au");
        System.out.println(webDriver.toString());
    }

//    @When("^$")
//    public void I_go_to_checkout_page() {
//        String deeplink = "tso_ma-byo-45-12";
//    }
}
