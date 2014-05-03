package cukejvm.support;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;

/**
 * Created with IntelliJ IDEA.
 * User: lnkhai
 * Date: 21/04/2014
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class SharedData {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public SharedData() {
        name = "Nhat Khai Le";
        age = 35;
    }

    @Before
    public void resetData() {
        name = "Khai";
        age = 35;
    }

    @After
    public void cleanupData() {
    }
}
