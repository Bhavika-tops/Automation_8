package com.com.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GuruTestDemo {
    
	WebDriver driver;
	@Test(groups ={"bonding","Strong_ties"})
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	  @Test(groups= {"bonding"})
	   public void test1() throws InterruptedException
	{
		  driver.findElement(By.xpath("/html/body/div[2]/h2")).getText();
		  Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/h2")).isDisplayed(),"Heading not shown");
         System.out.println("Heading displayed");
	}
         
         @Test(groups= {"bonding","strong_ties"})
         public void test2() throws InterruptedException {
		  driver.findElement(By.name("uid")).sendKeys("mngr516830");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("nAvAhAd");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);

	}

	
	@Test(groups= {"strong_ties"})
	public void test3() throws InterruptedException
	{
     Assert.assertTrue(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).isDisplayed(),"Manager not shown");	
	 
	 System.out.println("Manager id Displayed");
		Thread.sleep(2000);
	}

	@Test(groups = {"bonding"})
	public void test4() throws InterruptedException
	{
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).isEnabled(),"New Customer link not Displayed");	
		 
	    System.out.println("New Customer link Displayed");
			Thread.sleep(2000);
			
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).isEnabled(),"Fund Transfer link not Displayed");	
			 
		 System.out.println("Fund Transferlink Displayed");
				Thread.sleep(2000);	
	}
		
	
	@AfterClass(groups= {"strong_ties"})
	public void after() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	}

	
	
	
	
	
	













