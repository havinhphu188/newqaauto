package com.csc.storage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.csc.fixture.SetUpConfiguration;


public class Screenshot {

	public static void screenshot(WebDriver driver){
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("FitNesseRoot/files/screenshot/" + Screenshot.date() + ".jpg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String date(){
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyyMMddhhmmss");
		String now = ft.format(date);
		return now;
	}
}
