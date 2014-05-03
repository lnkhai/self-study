package cukejvm.support.forms;

/**
 * Created with IntelliJ IDEA.
 * User: NhatKhaiLe
 * Date: 3/30/14
 * Time: 3:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class HomeAddressForm {
    private String homeAddress;
    private String recommendedAddress;

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getRecommendedAddress() {
        return recommendedAddress;
    }

    public void setRecommendedAddress(String recommendedAddress) {
        this.recommendedAddress = recommendedAddress;
    }
}
