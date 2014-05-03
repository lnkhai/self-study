package cukejvm.support.pages;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import cukejvm.support.SharedDriver;
import cukejvm.support.forms.CheckOutForm;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected CheckOutForm checkOutForm;

    // maximum waiting time by second
    private static long MAX_WAIT_TIME = 60;

    public BasePage(SharedDriver webDriver, CheckOutForm checkOutForm) {
        this.driver = webDriver;
        this.checkOutForm = checkOutForm;
    }

    public BasePage() { }

    public void open(String url) {
        driver.get(url);
    }

    /**
     * Get HTML source of web element base on its ID
     * @param id
     * @return HTML Source
     */
    public String getElementHTMLSource(String id) {
        String htmlSource = "";

        try {
//            htmlSource = (String) selenium.getEval("document.getElementById('" + id + "').innerHTML");
        } catch (Exception e) {
            htmlSource = "";
        }

        return htmlSource;
    }

    public void waitForVisible(By by) throws ElementNotVisibleException {
        boolean found = false;
        for (int i = 0; i < MAX_WAIT_TIME; i++) {
            sleep(1000);
            if (driver.findElements(by).size() > 0) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new ElementNotVisibleException("Element: is not visible\n");
        }
    }

    public void sleep(long milisec) {
        try {
            Thread.sleep( milisec);
        } catch (Exception e) {}
    }

    /**
     * Wrapper of selenium.type
     * @param by The element
     * @param value Value to assign to element
     * @throws Exception if could not locate element
     */
    public void type(By by, String value) throws Exception {
        waitForVisible(by);
        driver.findElements(by).get(0).sendKeys(value);
    }

    /**
     * @param by The element
     * @param label Label of item in combobox
     * @throws Exception if could not locate element
     */
    public void select(By by, String label) throws Exception {
        waitForVisible(by);
        new Select(driver.findElements(by).get(0)).selectByValue(label);
    }

    public void click(By by) throws Exception {
        waitForVisible(by);
        driver.findElements(by).get(0).click();
    }

    /**
     * Return list of text from webelements that have the same CSS Selector
     * @param driver
     * @param cssSelector
     * @return the list of text in case of successfully retrieve, blank list if vice versa
     */
    public List<String> getStringsFromSimilarCSS(WebDriver driver, String cssSelector) {
        List<String> textList = new ArrayList<String>();

        try {
            List<WebElement> elements = driver.findElements(By.cssSelector(cssSelector));

            for (WebElement element: elements) {
                textList.add(element.getText());
                System.out.println("Text: " + element.getText());
            }
        } catch (Exception e) {
            textList = new ArrayList<String>();
        }

        return textList;
    }

    public String getText(By by) throws Exception {
        String text = "";
        try {
            text = driver.findElements(by).get(0).getText();
        } catch (Exception e) {
            throw new Exception("Couldn't grab element's text\n");
        }

        return text;
    }

}
