package com.suite2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demoblaze {
	
	WebDriver driver;
	@BeforeClass
	public void getUrl() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginusername")).sendKeys("pooja123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys("pooja");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void logout() throws InterruptedException
	{
		driver.findElement(By.className("nav-link")).click();

		Thread.sleep(2000);
	}
	
	@AfterClass
	public void destroy() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	}

	
