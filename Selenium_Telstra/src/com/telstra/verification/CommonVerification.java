package com.telstra.verification;

public class CommonVerification {
	//chat link (all pages)
	
	// footer link (all pages)
	
	// no input error message (purchase flow
	
	// check that the two strings are matched
	public static boolean areTwoStringMatched(String expectedTitle, String actualTitle) {
		boolean isPassed = false;
		try {
			if (expectedTitle.contentEquals(actualTitle)) { isPassed = true; }
		} catch (Exception e) { }
		
		return isPassed;
	}
}
