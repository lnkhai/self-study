package cukejvm.support.forms;

public class CheckOutForm {
    private AddOnForm addOnForm;
    private BillPreferenceForm billPreferenceForm;
    private ContactInformationForm contactInformationForm;
    private CreditCardForm creditCardForm;
    private DeliveryAddressForm deliveryAddressForm;
    private EmploymentDetailForm employmentDetailForm;
    private HandsetCustomiseForm handsetCustomiseForm;
    private HomeAddressForm homeAddressForm;
    private IdentificationForm identificationForm;
    private ManageNumberForm manageNumberForm;
    private NameDOBForm nameDOBForm;
    private PortinForm portinForm;
    private ResidentialStatusForm residentialStatusForm;
    private WhatYouNeedForm whatYouNeedForm;

    public CheckOutForm() {
        addOnForm = new AddOnForm();
        billPreferenceForm = new BillPreferenceForm();
        contactInformationForm = new ContactInformationForm();
        creditCardForm = new CreditCardForm();
        deliveryAddressForm = new DeliveryAddressForm();
        employmentDetailForm = new EmploymentDetailForm();
        handsetCustomiseForm = new HandsetCustomiseForm();
        homeAddressForm = new HomeAddressForm();
        identificationForm = new IdentificationForm();
        manageNumberForm = new ManageNumberForm();
        nameDOBForm = new NameDOBForm();
        portinForm = new PortinForm();
        residentialStatusForm = new ResidentialStatusForm();
        whatYouNeedForm = new WhatYouNeedForm();
    }

    public AddOnForm getAddOnForm() {
        return  addOnForm;
    }

    public BillPreferenceForm getBillPreferenceForm() {
        return billPreferenceForm;
    }

    public void setBillPreferenceForm(BillPreferenceForm billPreferenceForm) {
        this.billPreferenceForm = billPreferenceForm;
    }

    public ContactInformationForm getContactInformationForm() {
        return contactInformationForm;
    }

    public void setContactInformationForm(ContactInformationForm contactInformationForm) {
        this.contactInformationForm = contactInformationForm;
    }

    public CreditCardForm getCreditCardForm() {
        return creditCardForm;
    }

    public void setCreditCardForm(CreditCardForm creditCardForm) {
        this.creditCardForm = creditCardForm;
    }

    public DeliveryAddressForm getDeliveryAddressForm() {
        return deliveryAddressForm;
    }

    public void setDeliveryAddressForm(DeliveryAddressForm deliveryAddressForm) {
        this.deliveryAddressForm = deliveryAddressForm;
    }

    public EmploymentDetailForm getEmploymentDetailForm() {
        return employmentDetailForm;
    }

    public void setEmploymentDetailForm(EmploymentDetailForm employmentDetailForm) {
        this.employmentDetailForm = employmentDetailForm;
    }

    public HomeAddressForm getHomeAddressForm() {
        return homeAddressForm;
    }

    public void setHomeAddressForm(HomeAddressForm homeAddressForm) {
        this.homeAddressForm = homeAddressForm;
    }

    public IdentificationForm getIdentificationForm() {
        return identificationForm;
    }

    public void setIdentificationForm(IdentificationForm identificationForm) {
        this.identificationForm = identificationForm;
    }

    public ManageNumberForm getManageNumberForm() {
        return manageNumberForm;
    }

    public void setManageNumberForm(ManageNumberForm manageNumberForm) {
        this.manageNumberForm = manageNumberForm;
    }

    public NameDOBForm getNameDOBForm() {
        return nameDOBForm;
    }

    public void setNameDOBForm(NameDOBForm nameDOBForm) {
        this.nameDOBForm = nameDOBForm;
    }

    public PortinForm getPortinForm() {
        return portinForm;
    }

    public void setPortinForm(PortinForm portinForm) {
        this.portinForm = portinForm;
    }

    public ResidentialStatusForm getResidentialStatusForm() {
        return residentialStatusForm;
    }

    public void setResidentialStatusForm(ResidentialStatusForm residentialStatusForm) {
        this.residentialStatusForm = residentialStatusForm;
    }

    public WhatYouNeedForm getWhatYouNeedForm() {
        return whatYouNeedForm;
    }

    public void setWhatYouNeedForm(WhatYouNeedForm whatYouNeedForm) {
        this.whatYouNeedForm = whatYouNeedForm;
    }

    public HandsetCustomiseForm getHandsetCustomiseForm() {
        return handsetCustomiseForm;
    }

    public void setHandsetCustomiseForm(HandsetCustomiseForm handsetCustomiseForm) {
        this.handsetCustomiseForm = handsetCustomiseForm;
    }

    public void setAddOnForm(AddOnForm addOnForm) {
        this.addOnForm = addOnForm;
    }
}
