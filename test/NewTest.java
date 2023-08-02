package com.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  
	ChromeDriver driver;
  @Test(priority=0)
public void getUrl() throws InterruptedException {
	    
 System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
     
  driver=new ChromeDriver();
 driver.get("https://www.saucedemo.com");
 driver.manage().window().maximize();
 
 Thread.sleep(2000);
 
  }
  @Test(priority=1)
 public void credential() throws InterruptedException {
	 driver.findElement(By.name("user-name")).sendKeys("standard_user");
	 Thread.sleep(2000);
	 driver.findElement(By.name("password")).sendKeys("secret_sauce");
	 Thread.sleep(2000);
	 
 }
  @Test(priority=3)
  public void login() throws InterruptedException {
		 driver.findElement(By.name("login-button")).click();
		 Thread.sleep(2000);
  }
  @Test(priority=4)
  public void logout()throws InterruptedException {
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("logout_sidebar_link")).click();
		 Thread.sleep(2000);
  }
	@Test(priority=5) 
  public void close() throws InterruptedException {
	
		 driver.close();
  }
	}
		 
  
  
  

