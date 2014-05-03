package cukejvm.support.pages;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: kln
 * Date: 25/04/14
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExplorePageTest {
    @Test
    public void testBuildCSSSelector() {
        ExplorePage explorePage = new ExplorePage(null);

        Assert.assertTrue(explorePage.buildSelectorExplorePage("size","116388-tso_ma-55-24").equalsIgnoreCase("#pricePoint-S div.tms-explore-plan-summary"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("size","116388-tso_ma-70-24").equalsIgnoreCase("#pricePoint-M div.tms-explore-plan-summary"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("size","116388-tso_ma-95-24").equalsIgnoreCase("#pricePoint-L div.tms-explore-plan-summary"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("size","116388-tso_ma-130-24").equalsIgnoreCase("#pricePoint-XL div.tms-explore-plan-summary"));

        Assert.assertTrue(explorePage.buildSelectorExplorePage("size","tso_ma-byo-45-12").equalsIgnoreCase("#pricePoint-S div.tms-explore-plan-summary"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("size","tso_ma-byo-55-12").equalsIgnoreCase("#pricePoint-M div.tms-explore-plan-summary"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("size","tso_ma-byo-70-12").equalsIgnoreCase("#pricePoint-L div.tms-explore-plan-summary"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("size","tso_ma-byo-95-12").equalsIgnoreCase("#pricePoint-XL div.tms-explore-plan-summary"));

        Assert.assertTrue(explorePage.buildSelectorExplorePage("grid", "116388-tso_ma-55-24").equalsIgnoreCase("#tmsExploreAccordionHandset-S"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("grid", "116388-tso_ma-70-24").equalsIgnoreCase("#tmsExploreAccordionHandset-M"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("grid", "116388-tso_ma-95-24").equalsIgnoreCase("#tmsExploreAccordionHandset-L"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("grid", "116388-tso_ma-130-24").equalsIgnoreCase("#tmsExploreAccordionHandset-XL"));

        Assert.assertTrue(explorePage.buildSelectorExplorePage("grid","tso_ma-byo-45-12").equalsIgnoreCase("#tmsExploreAccordionBYO-S"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("grid","tso_ma-byo-55-12").equalsIgnoreCase("#tmsExploreAccordionBYO-M"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("grid","tso_ma-byo-70-12").equalsIgnoreCase("#tmsExploreAccordionBYO-L"));
        Assert.assertTrue(explorePage.buildSelectorExplorePage("grid","tso_ma-byo-95-12").equalsIgnoreCase("#tmsExploreAccordionBYO-XL"));
    }
}
