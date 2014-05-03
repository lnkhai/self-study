package cukejvm.support.forms;

/**
 * Created with IntelliJ IDEA.
 * User: lnkhai
 * Date: 27/04/2014
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class HandsetCustomiseForm {
    private String memorySize;
    private String color;

    public HandsetCustomiseForm() {
        memorySize = "8GB";
        color = "Black";
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
