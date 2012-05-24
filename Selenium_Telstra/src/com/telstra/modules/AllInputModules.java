package com.telstra.modules;

public class AllInputModules {
	private HandsetOptionModule handsetOption;
	private ContactInformationModule contactInformation;
	private DeliveryAddressModule delivery;
	private ResidentialStatusModule residential;
	private CreditCardModule creditCard;
	private EmploymentDetailModule employmentDetail;
	private IdentificationModule identification;
	private NameAndDOBModule nameAndDOB;
	private BillPreferenceModule billReference;

	public HandsetOptionModule getHandsetOption() {
		return handsetOption;
	}
	public void setHandsetOption(HandsetOptionModule handsetOption) {
		this.handsetOption = handsetOption;
	}
	public ContactInformationModule getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(ContactInformationModule contactInformation) {
		this.contactInformation = contactInformation;
	}
	public DeliveryAddressModule getDelivery() {
		return delivery;
	}
	public void setDelivery(DeliveryAddressModule delivery) {
		this.delivery = delivery;
	}
	public ResidentialStatusModule getResidential() {
		return residential;
	}
	public void setResidential(ResidentialStatusModule residential) {
		this.residential = residential;
	}
	public CreditCardModule getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCardModule creditCard) {
		this.creditCard = creditCard;
	}
	public EmploymentDetailModule getEmploymentDetail() {
		return employmentDetail;
	}
	public void setEmploymentDetail(EmploymentDetailModule employmentDetail) {
		this.employmentDetail = employmentDetail;
	}
	public IdentificationModule getIdentification() {
		return identification;
	}
	public void setIdentification(IdentificationModule identification) {
		this.identification = identification;
	}
	public NameAndDOBModule getNameAndDOB() {
		return nameAndDOB;
	}
	public void setNameAndDOB(NameAndDOBModule nameAndDOB) {
		this.nameAndDOB = nameAndDOB;
	}
	public BillPreferenceModule getBillReference() {
		return billReference;
	}
	public void setBillReference(BillPreferenceModule billReference) {
		this.billReference = billReference;
	}
}
