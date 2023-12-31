package com.suite1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceDemo {
     
	WebDriver driver;
	@BeforeClass
	public void getUrl() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void logout() throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
	}
	@AfterClass
	public void destroy() throws InterruptedException
	{
	    Thread.sleep(2000);
		driver.close();
	}
	
	
	}

