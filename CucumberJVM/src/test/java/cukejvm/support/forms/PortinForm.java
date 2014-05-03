package cukejvm.support.forms;

/**
 * Created with IntelliJ IDEA.
 * User: NhatKhaiLe
 * Date: 3/30/14
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class PortinForm {
    private String mobileNumber;
    private String serviceProvider;
    private String serviceType;
    private String accountNumber;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
