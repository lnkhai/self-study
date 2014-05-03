package cukejvm.support.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: kln
 * Date: 25/04/14
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExplorePage extends BasePage {
    public ExplorePage(WebDriver driver) {
        this.driver = driver;
    }

    public String buildSelectorExplorePage(String panel, String offerCode) {
        String cssSelector = "";
        String size = "";
        String type = "";

        type = (offerCode.indexOf("-12") >=0) ? "BYO" : "Handset";
        if ((offerCode.indexOf("45-12") >=0) || (offerCode.indexOf("55-24") >=0)) {
            size = "S";
        } else if ((offerCode.indexOf("55-12") >=0) || (offerCode.indexOf("70-24") >=0)) {
            size = "M";
        } else if ((offerCode.indexOf("70-12") >=0) || (offerCode.indexOf("95-24") >=0)) {
            size = "L";
        } else if ((offerCode.indexOf("95-12") >=0) || (offerCode.indexOf("130-24") >=0)) {
            size = "XL";
        }

        if (panel.equalsIgnoreCase("size")) {
            String template = "#pricePoint-#SIZE# div.tms-explore-plan-summary";
            cssSelector = template.replaceAll("#SIZE#", size);
        } else if (panel.equalsIgnoreCase("grid")) {
            String template = "#tmsExploreAccordion#TYPE#-#SIZE#";
            template = template.replaceAll("#SIZE#", size);
            cssSelector = template.replaceAll("#TYPE#", type);
        }

        return cssSelector;
    }

    public void goToCheckOutPageBaseOnOfferCode(String offerCode) throws Exception {
        // expand size panel
        this.click(By.cssSelector(buildSelectorExplorePage("size", offerCode)));

        // expand the BYO/Mobile grid
        this.click(By.cssSelector(buildSelectorExplorePage("grid", offerCode)));

        // click Buy Now
        this.click(By.id(offerCode));
    }
}
