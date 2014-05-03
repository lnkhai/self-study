package cukejvm.support;

/**
 * Created with IntelliJ IDEA.
 * User: kln
 * Date: 25/04/14
 * Time: 9:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Utilities {
    /**
     * Check if an OS is supported by OnlineShop. Mac/Window/iOS is supported. All Unix/Linux are not
     * @return true if supported, false if vice versa
     */
    public static boolean isSupportOS() {
        boolean isSupported = true;
        String os = System.getProperty("os.name").toLowerCase();
        if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0 || os.indexOf("aix") > 0 ) {
            isSupported = false;
        }

        return isSupported;
    }

    /**
     * Convert cent value to money format
     * 1400 cent => 14
     * 1495 cent => 14.95
     * @param cent
     * @return
     */
    public static String currencyFormat(long cent, boolean showDoubleZero) {
        String formated = "";
        long dollarValue = cent / 100;
        long centValue = cent % 100;

        String integerPart = new Long(dollarValue).toString();
        String decimalPart = new Long(centValue).toString();

        if (showDoubleZero == true) {
            formated = (centValue > 0) ? (integerPart + "." + decimalPart) : (integerPart + ".00");
        } else {
            formated = (centValue > 0) ? (integerPart + "." + decimalPart) : (integerPart);
        }

        return formated;
    }

    /**
     * Convert a number to have xx format (for Money: cent or date of month)
     * 1  => 01
     * 10 => 10
     * @param number
     * @return
     */
    public static String converToTwoNumberString(int number) {
        String newValue = "";

        try {
            if (number >= 10) {
                newValue = new Integer(number).toString();
            } else if ((number < 10) && (number >= 0)) {
                newValue = "0" + new Integer(number).toString();
            }
        } catch (Exception e) {
            newValue = "";
        }

        return newValue;
    }

    /**
     * Convert the format of Month to YYY format (ie 11 => Nov)
     * @param month
     * @return
     */
    public static String convertMonthFormat_xx_to_YYY(int month) {
        String monthString = "";

        switch (month) {
            case 1:  monthString = "Jan"; break;
            case 2:  monthString = "Feb"; break;
            case 3:  monthString = "Mar"; break;
            case 4:  monthString = "Apr"; break;
            case 5:  monthString = "May"; break;
            case 6:  monthString = "Jun"; break;
            case 7:  monthString = "Jul"; break;
            case 8:  monthString = "Aug"; break;
            case 9:  monthString = "Sep"; break;
            case 10:  monthString = "Oct"; break;
            case 11: monthString = "Nov"; break;
            case 12: monthString = "Dec"; break;
        }

        return monthString;
    }
}
