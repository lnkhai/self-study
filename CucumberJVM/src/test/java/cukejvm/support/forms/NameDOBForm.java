package cukejvm.support.forms;

/**
 * Created with IntelliJ IDEA.
 * User: NhatKhaiLe
 * Date: 3/30/14
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class NameDOBForm {
    private String title;
    private String firstName;
    private String lastName;
    private int dobDay;
    private int dobMonth;
    private int dobYear;

    public NameDOBForm() {
        this.title = "Mr";
        this.firstName = "KFirst";
        this.lastName = "KLast";
        this.dobDay = 1;
        this.dobMonth = 10;
        this.dobYear = 1990;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDobDay() {
        return dobDay;
    }

    public void setDobDay(int dobDay) {
        this.dobDay = dobDay;
    }

    public int getDobMonth() {
        return dobMonth;
    }

    public void setDobMonth(int dobMonth) {
        this.dobMonth = dobMonth;
    }

    public int getDobYear() {
        return dobYear;
    }

    public void setDobYear(int dobYear) {
        this.dobYear = dobYear;
    }
}
