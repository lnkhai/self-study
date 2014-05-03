package cukejvm.support.forms;

/**
 * Created with IntelliJ IDEA.
 * User: NhatKhaiLe
 * Date: 3/30/14
 * Time: 3:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class BillPreferenceForm {
    private String type;
    private String previousNumber;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPreviousNumber() {
        return previousNumber;
    }

    public void setPreviousNumber(String previousNumber) {
        this.previousNumber = previousNumber;
    }
}
