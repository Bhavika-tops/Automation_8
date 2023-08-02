package com.com.test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TopsDemo {
	ChromeDriver driver;
	@Test(priority=0)
	public void getUrl() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
     
	 driver=new ChromeDriver();
	 driver.get("https://careercenter.tops-int.com");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
     }
	
      @Test(priority=1)
     public void Credential() throws InterruptedException {
       driver.findElement(By.id("mobile")).sendKeys("8956683567");
      Thread.sleep(2000);
      driver.findElement(By.id("password")).sendKeys("8956683567");
      Thread.sleep(2000);
      
      }
      @Test(priority=2)
      public void login() throws InterruptedException {
       driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
       Thread.sleep(3000);
   	  driver.findElement(By.linkText("Bhavika Bakhtani")).click();
   	  Thread.sleep(3000);
      }
      
      @Test(priority=3)
     public void logout() throws InterruptedException {
      
	  driver.findElement(By.linkText("Logout")).click();
	  Thread.sleep(3000);
	  
      }
      @Test(priority=4)
      public void close() throws InterruptedException {
       driver.close();
      }
      }
