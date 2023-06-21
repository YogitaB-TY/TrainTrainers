package com.automationScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShoppersStackLogin_002Test {
	
	@Test
	public void testCase() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		driver.get("https://shoppersstack.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("yogita.b@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@id='Login']//span[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Wish List']")).click();
		Actions action=new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath("//p[text()='women fancy feminine top']"))).build().perform();
	}

}
