package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.name("cusid")).sendKeys("123");
	Thread.sleep(2000);
	
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();//pointer moves to alert window
	String msg=alert.getText();//Incase you want to print msg
     System.out.println(msg);
	Thread.sleep(2000);
	alert.accept();
	driver.close();
	
	
	
	
	
	
	
	
	
	
}
}
