package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	//	String innerText=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]")).getText();
	//	System.out.println(innerText);
		
		String innerText=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[1]")).getText();
	    System.out.println(innerText);
	    Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
}
}