package cukejvm;

/**
 * Created with IntelliJ IDEA.
 * User: lnkhai
 * Date: 30/04/2014
 * Time: 9:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class Lab {
    public static void main(String[] args) {
        long cent1 = 1495;
        long cent2 = 1400;

        long converted1 = cent1 / 100;
        long converted2 = cent1 % 100;
        Lab lab = new Lab();

        System.out.println(converted1 + "----" + converted2);
        System.out.println(lab.formatedValue(cent1, true));
        System.out.println(lab.formatedValue(cent1, false));
        System.out.println(lab.formatedValue(cent2, true));
        System.out.println(lab.formatedValue(cent2, false));
    }

    public String formatedValue(long cent, boolean showDoubleZero) {
        String formated = "";
        long dollarValue = cent / 100;
        long centValue = cent % 100;

        String integerPart = new Long(dollarValue).toString();
        String decimalPart = new Long(centValue).toString();

        if (showDoubleZero == true) {
            formated = integerPart + "." + decimalPart;
        } else {
            formated = (centValue > 0) ? (integerPart + ":" + decimalPart) : (integerPart);
        }

        return formated;
    }
}
