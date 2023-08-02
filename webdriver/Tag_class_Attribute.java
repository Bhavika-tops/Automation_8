package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_class_Attribute {
	//css=tag.class[attribute=value]//
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	 driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[name=email]")).sendKeys("pooja");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi[placeholder=Password")).sendKeys("pooja");
	 Thread.sleep(2000);
	 
	 driver.close();
		
	}
}
