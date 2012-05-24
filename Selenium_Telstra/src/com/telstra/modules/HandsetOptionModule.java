package com.telstra.modules;

import com.telstra.Constant;
import com.telstra.ProjectProperties;
import com.telstra.Utilities;

public class HandsetOptionModule {
	private String handsetCode;
	private String genericName;
	private String specificName;
	
	/**
	 * Generate a HandetOptionModule with random values
	 */
	public HandsetOptionModule() {
		ProjectProperties properties = new ProjectProperties();
		String testData = Utilities.getRandomRecord(properties.getFile_name(), Constant.EXCEL_SHEET_HANDSET_OPTION);
		String[] values = testData.split(Constant.FIELD_SEPARATOR);
		
		this.setHandsetCode(values[0]);
		this.setGenericName(values[1]);
		this.setSpecificName(values[2]);
	}
	
	/**
	 * Generate HandsetOptionModule with specific data
	 * The format of data must be: 
	 * 		HandsetCode;GenericName;SpecificName;
	 * @param testData
	 */
	public HandsetOptionModule(String testData) {
		String[] values = testData.split(Constant.FIELD_SEPARATOR);
		
		this.setHandsetCode(values[0]);
		this.setGenericName(values[1]);
		this.setSpecificName(values[2]);
	}
	
	public String getHandsetCode() {
		return handsetCode;
	}
	public void setHandsetCode(String handsetCode) {
		this.handsetCode = handsetCode;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public String getSpecificName() {
		return specificName;
	}
	public void setSpecificName(String specificName) {
		this.specificName = specificName;
	}	
}
