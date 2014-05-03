package cukejvm.support;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: kln
 * Date: 25/04/14
 * Time: 10:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class UtilitiesTest {
    @Test
    public void currencyFormatTest() {
        Assert.assertTrue(Utilities.currencyFormat(1495, false).equals("14.95"));
        Assert.assertTrue(Utilities.currencyFormat(1495, true).equals("14.95"));
        Assert.assertTrue(Utilities.currencyFormat(1400, false).equals("14"));
        Assert.assertTrue(Utilities.currencyFormat(1400, true).equals("14.00"));
    }
}
