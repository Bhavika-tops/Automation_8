package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktest {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
	 
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(2000);
   
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	 
	driver.findElement(By.id("email")).sendKeys("pooja");
	Thread.sleep(2000);
	
	driver.findElement(By.id("pass")).sendKeys("pooja");
	Thread.sleep(2000);
	
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(2000);
	driver.close();
	
	
	
	
}
}
