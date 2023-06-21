package com.automationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launches Browser
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//navigate to URL
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on login link
		driver.findElement(By.linkText("Log in")).click();
		
		//enter valid credentials into username and password
		driver.findElement(By.id("Email")).sendKeys("yogbelavanaki@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		
		//click on login button
		
		
		

	}

}
