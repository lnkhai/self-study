package cukejvm.support.forms;

/**
 * Created with IntelliJ IDEA.
 * User: NhatKhaiLe
 * Date: 3/30/14
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResidentialStatusForm {
    private String residentialStatus;
    private String currentYear;
    private String currentMonth;
    private String previousCountry;
    private String previousAddress;
    private String previousYear;
    private String previousMonth;
    private String previousAddressRequried;
    private String previousRecommendedAddress;

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public String getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(String currentYear) {
        this.currentYear = currentYear;
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth;
    }

    public String getPreviousCountry() {
        return previousCountry;
    }

    public void setPreviousCountry(String previousCountry) {
        this.previousCountry = previousCountry;
    }

    public String getPreviousAddress() {
        return previousAddress;
    }

    public void setPreviousAddress(String previousAddress) {
        this.previousAddress = previousAddress;
    }

    public String getPreviousYear() {
        return previousYear;
    }

    public void setPreviousYear(String previousYear) {
        this.previousYear = previousYear;
    }

    public String getPreviousMonth() {
        return previousMonth;
    }

    public void setPreviousMonth(String previousMonth) {
        this.previousMonth = previousMonth;
    }

    public String getPreviousAddressRequried() {
        return previousAddressRequried;
    }

    public void setPreviousAddressRequried(String previousAddressRequried) {
        this.previousAddressRequried = previousAddressRequried;
    }

    public String getPreviousRecommendedAddress() {
        return previousRecommendedAddress;
    }

    public void setPreviousRecommendedAddress(String previousRecommendedAddress) {
        this.previousRecommendedAddress = previousRecommendedAddress;
    }
}
