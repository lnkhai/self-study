package com.telstra.pages;

import com.telstra.Constant;
import com.thoughtworks.selenium.Selenium;

public class PurchaseFlowPage extends BasicPage {
	public PurchaseFlowPage(Selenium selenium) {
		this.selenium = selenium;
	}

	// leave the first handset selected as default
	public void inputVariantPhoneModule(String moduleIndex, boolean withAFL) {
		selenium.click("id=btnHandsetOptions"); 
		
		// waiting for this module to finish
		if (withAFL) {
//			waitForModuleToFinish(Constant.MODULE_AFL_SELECT_VARIANT_INDEX);
		} else {
//			waitForModuleToFinish(Constant.MODULE_NO_AFL_SELECT_VARIANT_INDEX);
		}
	}

	public void inputNameAndDOBModule(String moduleIndex, boolean withAFL) {
		selenium.type("id=personal.firstName", "Khai");
		selenium.type("id=personal.lastName", "Le");
		selenium.select("id=personal.dobDay", "label=15");
		selenium.select("id=personal.dobMonth", "label=Oct");
		selenium.select("id=personal.dobYear", "label=1980");
		selenium.click("id=btnPersonal");
		
		// waiting for this module to finish
		if (withAFL) {
//			waitForModuleToFinish(Constant.MODULE_AFL_NAME_AND_DOB_INDEX);
		} else {
//			waitForModuleToFinish(Constant.MODULE_NO_AFL_NAME_AND_DOB_INDEX);
		}
	}

	public void inputOrderTypeModule_NewContract(String moduleIndex, boolean withAFL) {
		selenium.click("id=numberChoice-new");
		selenium.click("id=btnNumberChoice");
		
		// waiting for this module to finish
		if (withAFL) {
//			waitForModuleToFinish(Constant.MODULE_AFL_CONTRACT_TYPE_INDEX);
		} else {
//			waitForModuleToFinish(Constant.MODULE_NO_AFL_CONTRACT_TYPE_INDEX);
		}
	}

	public void inputOrderTypeModule_Recontract(String moduleIndex) {
//		String condition = "window.document.getElementsByClassName('tms-accordion-form')[" + moduleIndex + "].style.display == 'none'";
	}
	
	public void inputOrderTypeModule_Portin(String moduleIndex) {
//		String condition = "window.document.getElementsByClassName('tms-accordion-form')[" + moduleIndex + "].style.display == 'none'";
	}

	public void inputContactInformationModule(String moduleIndex, boolean withAFL) {
		try {
			selenium.type("id=contact.emailAddress", "a@b.c");
			selenium.type("id=contact.confirmEmailAddress", "a@b.c");
			selenium.type("id=contact.phoneNumber", "0450054743");
			selenium.type("id=contact.homeAddress.addressLine1", "5 Gardenia Avenue");
			selenium.type("id=contact.homeAddress.suburb", "Bankstown");
			selenium.type("id=contact.homeAddress.postcode", "2200");
			selenium.click("id=btnContact");
	
			// wait for verifying home address
			selenium.waitForCondition("window.document.getElementById('contact_error').innerHTML == ''", Constant.WAIT_TIME);
			
			selenium.select("id=contact-addr-select", "label=5 Gardenia Avenue, Bankstown, NSW 2200");
			selenium.click("id=btnContact");
	
			// waiting for this module to finish
			if (withAFL) {
//				waitForModuleToFinish(Constant.MODULE_AFL_CONTACT_INFO_INDEX);
			} else {
//				waitForModuleToFinish(Constant.MODULE_NO_AFL_CONTACT_INFO_INDEX);
			}
		} catch (Exception e) {
			System.out.println("Couldn't finish module Contact Information");
		}
	}
	
	public void inputDeliveryAddressModule_UseHome(String moduleIndex, boolean withAFL) {
		try {
			selenium.click("id=btnDelivery");
		
			// waiting for this module to finish
			if (withAFL) {
//				waitForModuleToFinish(Constant.MODULE_AFL_DELIVERY_INDEX);
			} else {
//				waitForModuleToFinish(Constant.MODULE_NO_AFL_DELIVERY_INDEX);
			}
		} catch (Exception e) {
			System.out.println("Couldn't finish module Delivery Address");
		}
	}
	
	public void inputDeliveryAddressModule_UseCompany(String moduleIndex) {
		
	}
	
	public void inputResidentialStatusModule(String moduleIndex, boolean withAFL) {
		selenium.select("id=residence.currentAddressYears", "label=2");
		selenium.click("id=btnResidence");
		
		// waiting for this module to finish
		if (withAFL) {
//			waitForModuleToFinish(Constant.MODULE_AFL_RESIDENTIAL_INDEX);
		} else {
//			waitForModuleToFinish(Constant.MODULE_NO_AFL_RESIDENTIAL_INDEX);
		}
	}
	
	public void inputIdentificationModule(String moduleIndex, boolean withAFL) {
		selenium.type("id=identity.documentId", "19903834");
		selenium.select("id=identity.expiryDay", "label=15");
		selenium.select("id=identity.expiryMonth", "label=Nov");
		selenium.select("id=identity.expiryYear", "label=2027");
		selenium.click("id=btnIdentity");
		
		// waiting for this module to finish
		if (withAFL) {
//			waitForModuleToFinish(Constant.MODULE_AFL_IDENTIFICATION_INDEX);
		} else {
//			waitForModuleToFinish(Constant.MODULE_NO_AFL_IDENTIFICATION_INDEX);
		}
	}
	
	//module 8: Employment
	public void inputEmploymentModule(String moduleIndex, boolean withAFL) {
		selenium.select("id=employment.occupationCategory", "label=Others");
		selenium.click("id=occupation_HOME_DUTIES");
		selenium.click("id=btnEmployment");
		
		// waiting for this module to finish
		if (withAFL) {
//			waitForModuleToFinish(Constant.MODULE_AFL_EMPLOYMENT_INDEX);
		} else {
//			waitForModuleToFinish(Constant.MODULE_NO_AFL_EMPLOYMENT_INDEX);
		}
	}
	
	//module 9: Your offer
	public void inputOfferModule(String moduleIndex, boolean withAFL) {
		selenium.click("id=vasOptions.optIn1");
		selenium.click("id=btnVasOptions");
		
		// waiting for this module to finish
		if (withAFL) {
//			waitForModuleToFinish(Constant.MODULE_AFL_OFFER_INDEX);
		} else {
//			waitForModuleToFinish(Constant.MODULE_NO_AFL_OFFER_INDEX);
		}
	}
	
	//module 10: Billing Reference
	public void inputBillingReferenceModule(String moduleIndex, boolean withAFL) {
		selenium.click("id=billing-new");
		selenium.click("id=btnBilling");
		
		// waiting for this module to finish
		if (withAFL) {
//			waitForModuleToFinish(Constant.MODULE_AFL_BILLING_REF_INDEX);
		} else {
//			waitForModuleToFinish(Constant.MODULE_NO_AFL_BILLING_REF_INDEX);
		}
	}
	
	//module 11: Order summary
	public void displayOrderSummaryModule(String moduleIndex, boolean withAFL) {
		selenium.click("id=btnTandC");
		selenium.click("id=btnTandCAccept");
		selenium.click("id=btnTandC");
		
		// waiting for this module to finish
		if (withAFL) {
//			waitForModuleToFinish(Constant.MODULE_AFL_ORDER_SUMMARY_INDEX);
		} else {
//			waitForModuleToFinish(Constant.MODULE_NO_AFL_ORDER_SUMMARY_INDEX);
		}
	}
	
	//module 12: Credit detail
	public void inputCreditDetailModule(String moduleIndex) {
		selenium.type("id=creditCard.cardNumber", "4444333322221111");
		selenium.type("id=creditCard.nameOnCard", "Test");
		selenium.select("id=creditCard.expiryMonth", "label=01");
		selenium.select("id=creditCard.expiryYear", "label=2016");
		selenium.type("id=creditCard.cvvNumber", "123");
//		selenium.click("id=btnCreditCard");

		// waiting for this module to finish
//		selenium.waitForPageToLoad(Constant.WAIT_TIME);
	}
	
	public void waitForModuleToFinish(String moduleIndex) {
		String condition = "window.document.getElementsByClassName('tms-accordion-form')[" + moduleIndex + "].style.display == 'none'";
		selenium.waitForCondition(condition, Constant.WAIT_TIME);
	}
	
	public void waitForModuleToLoad(String moduleIndex) {
		String condition = "window.document.getElementsByClassName('tms-accordion-form')[" + moduleIndex + "].style.display == 'block'";
		selenium.waitForCondition(condition, Constant.WAIT_TIME);
	}
}
