package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe" );
	     WebDriver driver=new ChromeDriver();        
	     driver.get("http://demo.guru99.com/test/ajax.html");
	     Thread.sleep(2000);
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("yes")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("no")).click();
	     Thread.sleep(2000);
	    
	     driver.findElement(By.id("buttoncheck")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id(" ")).click();
	     Thread.sleep(2000);
	     driver.close();
}
}
