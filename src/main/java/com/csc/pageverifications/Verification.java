package com.csc.pageverifications;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.csc.action.PageAction;
import com.csc.driverpool.DriverPool;

public class Verification {
	//TODO: Be careful. Driver may not be update
	static WebDriver driver = DriverPool.getCurrentDriver();

	public static String verifyElementText(String locator) {
		List<String> loca = PageAction.readLocator(locator);
		String type = loca.get(0);
		String elementText = "";
		try{
			if (type.equals("xpath")) {
				elementText = driver.findElement(By.xpath(loca.get(1))).getText();
			} else if (type.equals("id")) {
				elementText = driver.findElement(By.id(loca.get(1))).getText();
			} else if (type.equals("name")) {
				elementText = driver.findElement(By.name(loca.get(1))).getText();
			}			
		}catch(Exception e){
			e.printStackTrace();
			elementText = "Not found";
		}

		return elementText;

	}
}
