package com.automationScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.genericLibrary.UtilityMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentReports report=new ExtentReports("./Reports/reportName.html");
		ExtentTest test=report.startTest("Login");

		//Launches Browser
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();

		test.log(LogStatus.INFO, "Browser is open");
		//navigate to URL
		driver.get("https://demowebshop.tricentis.com/");

		//click on login link
		driver.findElement(By.linkText("Log in")).click();

		test.log(LogStatus.INFO, "Login page is displayed");
		//enter valid credentials into username and password
		driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");

		test.log(LogStatus.PASS, "User is logged in");
		//click on login button

		test.log(LogStatus.INFO, test.addScreenCapture(takingScreenshotMethod()));
		report.endTest(test);
		report.flush();
	}
	
public static String takingScreenshotMethod() {
		
	String path="./ScreenShots/name.png";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "."+path;
		
	}

}
