package com.csc.actionapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.csc.driverpool.DriverPool;
import com.csc.driverpool.TestConstant;

public class ActionAPI {
	private static WebDriver driver;
	
	public static void setDriverForAction(String key){
		driver = DriverPool.getDriver(key);
	}

	private static By toDefineElement(String type, String value) {
		By by = null;
		if (TestConstant.xpath.equalsIgnoreCase(type)) {
			by = By.xpath(value);
		} else if (TestConstant.name.equalsIgnoreCase(type)) {
			by = By.name(value);
		} else if (TestConstant.id.equalsIgnoreCase(type)) {
			by = By.id(value);
		} else if (TestConstant.cssSelector.equalsIgnoreCase(type) || TestConstant.css.equalsIgnoreCase(type)) {
			by = By.cssSelector(value);
		} else if (TestConstant.tagName.equalsIgnoreCase(type) || TestConstant.tag.equalsIgnoreCase(type)) {
			by = By.cssSelector(value);
		}
		return by;
	}

	public static void toNavigate(String url) {
	
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}

	/*
	 * Click
	 */
	public static void toClick(String type, String value) throws InterruptedException {
		driver.findElement(toDefineElement(type, value)).click();
	}

	/*
	 * set Input for element
	 */
	public static void toSetInput(String type, String value, String input) {
		driver.findElement(toDefineElement(type, value)).sendKeys(input);
	}

	/*
	 * Close browser
	 */
	public static void toCloseBrowser() {
		driver.close();
	}

	
}
