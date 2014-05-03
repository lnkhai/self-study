package cukejvm.support.forms;

/**
 * Created with IntelliJ IDEA.
 * User: lnkhai
 * Date: 29/04/2014
 * Time: 9:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class AddOn {
    private String addOnCode;
    private String addOnName;
    private long addOnPrice;

    public AddOn(String addOnCode, String addOnName, long addOnPrice) {
        this.addOnCode = addOnCode;
        this.addOnName = addOnName;
        this.addOnPrice = addOnPrice;
    }

    public String getAddOnCode() {
        return addOnCode;
    }

    public void setAddOnCode(String addOnCode) {
        this.addOnCode = addOnCode;
    }

    public String getAddOnName() {
        return addOnName;
    }

    public void setAddOnName(String addOnName) {
        this.addOnName = addOnName;
    }

    public long getAddOnPrice() {
        return addOnPrice;
    }

    public void setAddOnPrice(long addOnPrice) {
        this.addOnPrice = addOnPrice;
    }
}
