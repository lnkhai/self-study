package cukejvm.support.forms;

/**
 * Created with IntelliJ IDEA.
 * User: NhatKhaiLe
 * Date: 3/30/14
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContactInformationForm {
    private String preferredEmail;
    private String confirmEmail;
    private String contactNumber;

    public String getPreferredEmail() {
        return preferredEmail;
    }

    public void setPreferredEmail(String preferredEmail) {
        this.preferredEmail = preferredEmail;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
