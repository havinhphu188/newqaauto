package com.csc.action;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.csc.actionapi.ActionAPI;
import com.csc.driverpool.DriverPool;
import com.csc.fixture.InteractWebApplication;
import com.csc.fixture.SetUpConfiguration;

public class PageAction {
	private static org.apache.log4j.Logger log = Logger.getLogger(InteractWebApplication.class);

	public static void openNewBrowser(String browserType){
		switch(browserType){
		case "Chrome": 
		 	DriverPool.createDriver("chrome1", "Chrome");
	        ActionAPI.setDriverForAction("chrome1");
			break;
		case "Firefox":
			DriverPool.createDriver("firefox1", "Firefox");
	        ActionAPI.setDriverForAction("firefox1");
			break;
		}
	}
	
	public static void switchToBrowser(String key){
		ActionAPI.setDriverForAction(key);
	}
	
	public static ArrayList<String> readLocator(String locator)  {
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
	

	

	public static void iNavigateToPage(String url) {
		ActionAPI.toNavigate(url);;
	}

	public static void iClickTheElement(String locator) throws InterruptedException {
		ArrayList<String> list = readLocator(locator);		
		ActionAPI.toClick(list.get(0), list.get(1));
	}

	
	public static void iCloseTheBrowser(){
		ActionAPI.toCloseBrowser();
	}



	
	public static void iPause(String waitTime){
		ActionAPI.toPause(waitTime);
	}
	


	public static void iSetTheInputWithValue(String locator, String value){
		ArrayList<String> list = readLocator(locator);		
		ActionAPI.toSetInput(list.get(0), list.get(1), value);
	}

	public static void switchToWindow(String title) {
		// TODO Auto-generated method stub
		ActionAPI.toSwitchWindow(title);
		
	}
	
}
