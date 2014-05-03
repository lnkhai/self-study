package cukejvm;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        format={"pretty", "html:target/cucumber"}
)
/*
@CucumberOptions(
    format={"pretty", "html:target/cucumber"},
    resources="src/test/resources"
)
 */
public class RunCukesTest {
}
