package cukejvm.step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cukejvm.support.SharedData;
import cukejvm.support.SharedDriver;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lnkhai
 * Date: 20/04/2014
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class LabStepDefs {
    @Given("^I want to print below table:$")
    public void printTable(DataTable infoList) throws Throwable {
        List<NameAndJob> list = infoList.asList(NameAndJob.class);

        for (NameAndJob item: list) {
            System.out.println(item.name + "----" + item.job + "---" + item.age);
        }
    }

    class NameAndJob {
        private String name;
        private String job;
        private int age;

        public NameAndJob(String name, String job, int age) {
            this.name = name;
            this.job = job;
            this.age = age;
        }
    }
}
