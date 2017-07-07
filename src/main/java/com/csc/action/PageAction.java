package com.csc.action;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.csc.driverpool.DriverPool;
import com.csc.fixture.InteractWebApplication;
import com.csc.fixture.SetUpConfiguration;

public class PageAction {
	private static org.apache.log4j.Logger log = Logger.getLogger(InteractWebApplication.class);

	public void iWaitForMs(String time){
		api.toPause(time);
		
	}
	
	public static void openBrowser(){
		DriverPool.createDriver("chrome1","Chrome");
	}
	
	public ArrayList<String> readLocator(String locator)  {
		ArrayList<String> list = null;
		Properties prop = new Properties();
		try {
		    //load a properties file from class path, inside static method
		//	String file = "C:/Users/training//Desktop/FitNesse/FitNesseRoot/bin/locator.properties";
			String filename = SetUpConfiguration.configuration.getUrl() + "/" + SetUpConfiguration.configuration.getFileConfig();
 		    prop.load(new FileInputStream(filename));
 		   
		    String str = prop.getProperty(locator);
		    String[] words =  str.split("=>");
		    String type = words[0];
		    String val = words[1];

		    list = new ArrayList<String>();
		    list.add(type);
		    list.add(val);
		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}
		return list;
	  }
	
	public ArrayList<String> readLocator2(String locator1,String locator2)  {
		ArrayList<String> list = null;
		Properties prop = new Properties();
		try {
		    //load a properties file from class path, inside static method
			String filename = SetUpConfiguration.configuration.getFileConfig(); 
			prop.load(new FileInputStream(filename));
		    String str = prop.getProperty(locator1);
		    String[] words =  str.split("=>");
		    String type = words[0];
		    String val = words[1];
		    String str2 = prop.getProperty(locator2);
		    String[] words2 =  str2.split("=>");
		    String type2 = words2[2];
		    String val2 = words2[3];
		    list = new ArrayList<String>();
		    list.add(type);
		    list.add(val);
		    list.add(type2);
		    list.add(val2);
		} 
		
		catch (IOException ex) {
		    ex.printStackTrace();
		}
		return list;
	  }
	
	

	public void iNavigateToPage(String url) {
		System.out.println("Page Navigate");
		api.toNavigate(url);
	}

	public void iClickTheElement(String locator) throws InterruptedException {
		ArrayList<String> list = readLocator(locator);		
		api.toClick(list.get(0), list.get(1));
	}

	public void iShouldSeeThePopupAppears(String windowId) {
		api.toShowPopUp(windowId);
	}
	
	public void iOpenThePopupWindowWith(String url, String windowId) {
		api.toOpenPopUpWithUrl(url, windowId);
	}
	
	public void iCloseTheBrowser(){
		api.toCloseBrowser();
	}
	
	public void iDoubleClickTheElement(String locator){
		ArrayList<String> list = readLocator(locator);		
		api.toDoubleClick(list.get(0), list.get(1));
	}
	
	public void iDragTheElementAndDropToTheElement(String locator1, String locator2){
		ArrayList<String> list = readLocator(locator1);
		ArrayList<String> list2 = readLocator(locator2);
		api.toDragAndDrop(list.get(0),list.get(1),list2.get(0),list2.get(2));
	}
	
	public void iMoveTheFocusToTheElement(String locator){
		ArrayList<String> list = readLocator(locator);		
		api.toMoveTheFocusToElement(list.get(0), list.get(1));
	}
	
	public void iPressTheLeftMouseButtonOnTheElement(String locator){
		ArrayList<String> list = readLocator(locator);		
		api.toPressLeftMouse(list.get(0), list.get(1));
	}

	public void iReleaseTheLeftMouseButtonOnTheElement(String locator){
		ArrayList<String> list = readLocator(locator);		
		api.toReleaseMouse(list.get(0), list.get(1));
	}
	
	public void iPause(String waitTime){
		api.toPause(waitTime);
	}
	
	public void iRefresh(){
		api.toRefresh();
	}
	
	public void iSelectTheOptionFromADropDown(String optionLocator, String input){
		ArrayList<String> list = readLocator(optionLocator);
		api.toSelectDropdownList(list.get(0),list.get(1),input);
	}
	
	public void iOpenFirefox(){
		api.openFirefox();
	}
	
	public void iOpenChrome(){
		api.openChrome();
		log.info("iSelectTheWindow: ");
	}
	
	public void iSetTheInputWithValue(String locator, String value){
		ArrayList<String> list = readLocator(locator);		
		api.toSetInput(list.get(0), list.get(1), value);
		log.info("iSetTheInputWithValue: ");
	}

	public void iWaitForANewPageToLoad(String type, String value, String timeOut){
		api.toWaitforProperty(type, value, timeOut);
		log.info("iWaitForANewPageToLoad: ");
	}
	
	public void iGiveFocusToTheCurrentlySelectedWindow(){
		api.toGiveFocusToCurrentWindow();
		log.info("iGiveFocusToTheCurrentlySelectedWindow: ");
	}
	
	public void iExecuteJavascriptOnElement(String script, String locator){
		ArrayList<String> list = readLocator(locator);		
		api.toExcuteJavascript(script,list.get(0), list.get(1));
		log.info("iExecuteJavaScriptOnElement: ");
	}
	
	public void iResizeCurrentlySelectedWindowToTakeUpTheEntireScreen(){
		api.toResizeWindown();
		log.info("iResizeCurrentlySelectedWindowToTakeUpTheEntireScreen: ");
	}
	
}
