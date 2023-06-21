package com.automationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Books")).click();
	}

}
