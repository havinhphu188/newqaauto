package com.csc.fixture;

import java.util.List;

import com.csc.PageVerifications.Verification;
import com.csc.api.ActionAPI;

import static java.util.Arrays.asList;

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
