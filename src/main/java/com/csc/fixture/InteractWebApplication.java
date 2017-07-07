package com.csc.fixture;

import org.apache.log4j.Logger;
import com.csc.action.PageAction;



public class InteractWebApplication {
	
	private static org.apache.log4j.Logger log = Logger.getLogger(InteractWebApplication.class);
	PageAction action = new PageAction();
	public InteractWebApplication() {			
		log.info("InteractWebApplication()");
	}

	public void iNavigateToPage(String url) {
		action.iNavigateToPage(url);
		log.info("iNavigateToPage: ");
	}
	
	public void iOpenChrome(){
		action.iOpenChrome();
	}
	
	public void iOpenFirefox(){
		action.iOpenFirefox();
	}

	public void iClickTheElement(String locator) throws InterruptedException {
		action.iClickTheElement(locator);
		log.info("iClickTheElement: ");
	}

	public void iShouldSeeThePopupAppears(String windowId) {
		action.iShouldSeeThePopupAppears(windowId);
		log.info("iShouldSeeThePopupAppears: ");
	}
	
	public void iOpenThePopupWindowWith(String url, String windowId) {
		action.iOpenThePopupWindowWith(url, windowId);
		log.info("iOpenThePopupWindowWith: ");
	}
	
	public void iCloseTheBrowser(){
		action.iCloseTheBrowser();
		log.info("iCloseTheBrowser: ");
	}
	
	public void iDoubleClickTheElement(String locator){
		action.iDoubleClickTheElement(locator);
		log.info("iDoubleClickTheElement: ");
	}
	
	public void iDragTheElementAndDropToTheElement(String locator1, String locator2){
		action.iDragTheElementAndDropToTheElement(locator1, locator2);
		log.info("iDragTheElementAndDropToTheElement: ");
	}
	
	public void iMoveTheFocusToTheElement(String locator){
		action.iMoveTheFocusToTheElement(locator);
		log.info("iMoveTheFocusToTheElement: ");
	}
	
	public void iPressTheLeftMouseButtonOnTheElement(String locator){
		action.iPressTheLeftMouseButtonOnTheElement(locator);
		log.info("iPressTheLeftMouseButtonOnTheElement: ");
	}

	public void iReleaseTheLeftMouseButtonOnTheElement(String locator){
		action.iReleaseTheLeftMouseButtonOnTheElement(locator);
		log.info("iReleaseTheLeftMouseButtonOnTheElement: ");
	}
	
	public void iPause(String waitTime){
		action.iPause(waitTime);
		log.info("iPause: ");
	}
	
	public void iRefresh(){
		action.iRefresh();
		log.info("iRefresh: ");
	}
	
	public void iSelectTheOptionFromADropDown(String optionLocator, String selectLocator){
		action.iSelectTheOptionFromADropDown(optionLocator, selectLocator);
		log.info("iSelectTheOptionFromADropDown: ");
	}
	
	public void iSelectTheWindow(){
		action.iOpenFirefox();
		log.info("iSelectTheWindow: ");
	}
	
	public void iSetTheInputWithValue(String locator, String value){
		action.iSetTheInputWithValue(locator, value);
		log.info("iSetTheInputWithValue: ");
	}

	public void iWaitForANewPageToLoad(String type, String value,String timeOut){
		action.iWaitForANewPageToLoad(type, value, timeOut);
		
		log.info("iWaitForANewPageToLoad: ");
	}
	
	public void iGiveFocusToTheCurrentlySelectedWindow(){
		action.iGiveFocusToTheCurrentlySelectedWindow();
		log.info("iGiveFocusToTheCurrentlySelectedWindow: ");
	}
	
	public void iExecuteJavascriptOnElement(String script, String locator){
		action.iExecuteJavascriptOnElement(script, locator);
		log.info("iExecuteJavaScriptOnElement: ");
	}
	
	public void iResizeCurrentlySelectedWindowToTakeUpTheEntireScreen(){
		action.iResizeCurrentlySelectedWindowToTakeUpTheEntireScreen();
		log.info("iResizeCurrentlySelectedWindowToTakeUpTheEntireScreen: ");
	}
	
	public void iWaitForMs(String time){
		action.iWaitForMs(time);
		
	}
	
	
}
