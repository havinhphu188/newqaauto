package com.csc.fixture;

import static java.util.Arrays.asList;

import java.util.List;

import com.csc.pageverifications.Verification;

public class PageVerification {
	private String locator;

	public PageVerification(String locator) {
		super();
		this.locator = locator;
	}

	public List<List<List<String>>> query() {
		return asList( 
				asList( 
						asList("verify text", Verification.verifyElementText(locator))
				));
	}

}
