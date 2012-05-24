package com.telstra.modules;

import com.telstra.Constant;
import com.telstra.ProjectProperties;
import com.telstra.Utilities;

public class NameAndDOBModule {
	private String title;
	private String firstName;
	private String lastName;
	private String dobDay;
	private String dobMonth;
	private String dobYear;
	
	/**
	 * Generate a NameAndDOBModule with random values
	 */
	public NameAndDOBModule() {
		ProjectProperties properties = new ProjectProperties();
		String testData = Utilities.getRandomRecord(properties.getFile_name(), Constant.EXCEL_SHEET_NAME_DOB);
		String[] values = testData.split(Constant.FIELD_SEPARATOR);
		try {
			this.setTitle(values[0]);
			this.setFirstName(values[1]);
			this.setLastName(values[2]);
			this.setDobDay(values[3]);
			this.setDobMonth(values[4]);
			this.setDobYear(values[5]);
		} catch (Exception e) {
			this.setTitle("");
			this.setFirstName("");
			this.setLastName("");
			this.setDobDay("");
			this.setDobMonth("");
			this.setDobYear("");
		}
	}
	
	/**
	 * Generate NameAndDOBModule with specific data
	 * The format of data must be separated by ";", i.e field1;field2;...
	 * @param testData
	 */
	public NameAndDOBModule(String testData) {
		String[] values = testData.split(Constant.FIELD_SEPARATOR);
		try {
			this.setTitle(values[0]);
			this.setFirstName(values[1]);
			this.setLastName(values[2]);
			this.setDobDay(values[3]);
			this.setDobMonth(values[4]);
			this.setDobYear(values[5]);
		} catch (Exception e) {
			this.setTitle("");
			this.setFirstName("");
			this.setLastName("");
			this.setDobDay("");
			this.setDobMonth("");
			this.setDobYear("");
		}
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
	public String getDobDay() {
		return dobDay;
	}
	public void setDobDay(String dobDay) {
		this.dobDay = dobDay;
	}
	public String getDobMonth() {
		return dobMonth;
	}
	public void setDobMonth(String dobMonth) {
		this.dobMonth = dobMonth;
	}
	public String getDobYear() {
		return dobYear;
	}
	public void setDobYear(String dobYear) {
		this.dobYear = dobYear;
	}
}
