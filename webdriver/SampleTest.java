package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty( "webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe" );
     WebDriver driver=new ChromeDriver();        
     driver.get("https://careercenter.tops-int.com/");
     Thread.sleep(4000);
     System.out.println(driver.getCurrentUrl());
     System.out.println(driver.getTitle());
     Thread.sleep(4000);
     driver.close();
     
     
}
}
