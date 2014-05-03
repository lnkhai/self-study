package cukejvm.support.forms;

/**
 * Created with IntelliJ IDEA.
 * User: NhatKhaiLe
 * Date: 3/30/14
 * Time: 3:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class DeliveryAddressForm {
    private String deliveryTo;
    private String deliveryCompanyName;
    private String deliveryAddressLine1;
    private String deliverySuburb;
    private String deliveryState;
    private String deliveryPostCode;

    public static final String HOME = "home";
    public static final String COMPANY = "company";

    public String getDeliveryTo() {
        return deliveryTo;
    }

    public void setDeliveryTo(String deliveryTo) {
        this.deliveryTo = deliveryTo;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public String getDeliveryAddressLine1() {
        return deliveryAddressLine1;
    }

    public void setDeliveryAddressLine1(String deliveryAddressLine1) {
        this.deliveryAddressLine1 = deliveryAddressLine1;
    }

    public String getDeliverySuburb() {
        return deliverySuburb;
    }

    public void setDeliverySuburb(String deliverySuburb) {
        this.deliverySuburb = deliverySuburb;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public String getDeliveryPostCode() {
        return deliveryPostCode;
    }

    public void setDeliveryPostCode(String deliveryPostCode) {
        this.deliveryPostCode = deliveryPostCode;
    }
}
