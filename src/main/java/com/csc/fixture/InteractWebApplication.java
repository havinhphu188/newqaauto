package com.csc.fixture;

import org.apache.log4j.Logger;

import com.csc.action.PageAction;



public class InteractWebApplication {
	
	private static org.apache.log4j.Logger log = Logger.getLogger(InteractWebApplication.class);
	public InteractWebApplication() {			
		log.info("InteractWebApplication()");
	}

	public void iNavigateToPage(String url) {
		PageAction.iNavigateToPage(url);
	}
	
	public void iOpenBrowser(String browserType){
		PageAction.openNewBrowser(browserType);
	}
	

	public void iClickTheElement(String locator) throws InterruptedException {
		PageAction.iClickTheElement(locator);
	}

	public void iCloseTheBrowser(){
		PageAction.iCloseTheBrowser();
	}
	
	
	public void iPause(String waitTime){
		PageAction.iPause(waitTime);
	}
	
	public void iSetTheInputWithValue(String locator, String value){
		PageAction.iSetTheInputWithValue(locator, value);
	}

	public void iWaitForMs(String time){
		PageAction.iPause(time);
	}
	
	public void iSwitchToBrowser(String key){
		PageAction.switchToBrowser(key);
	}
	
	
}
