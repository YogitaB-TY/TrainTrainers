package com.genericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityMethods implements FrameworkConstants{

	public static WebDriver driver;
	public static Actions action;
	public static WebDriverWait explicitWait;
	
	public static String takingScreenshotMethod() {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(SCREENSHOT_PATH);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SCREENSHOT_PATH;
		
	}
	public void initObjects() {
		action=new Actions(driver);
		explicitWait=new WebDriverWait(driver, TIME_OUT_SECONDS);
	}
	
	public void clickAction(WebElement elementToClick) {
		elementToClick.click();
	}
	
}
