package cukejvm.support.forms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lnkhai
 * Date: 29/04/2014
 * Time: 9:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class AddOnForm {
    private List<AddOn> addOnList;

    public AddOnForm() {
        addOnList = new ArrayList<AddOn>();
    }

    public List<AddOn> getAddOnList() {
        return addOnList;
    }

    public void setAddOnList(List<AddOn> addOnList) {
        this.addOnList = addOnList;
    }
}
