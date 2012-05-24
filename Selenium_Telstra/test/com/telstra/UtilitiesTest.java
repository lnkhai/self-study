package com.telstra;

import junit.framework.Assert;

import org.junit.Test;

public class UtilitiesTest {
	@Test
	public void getRandomRecordTest() {
		Assert.assertEquals(true, Utilities.getRandomRecord("Telstra_TestData.xls", "Name_DOB").startsWith("M"));
	}
}
