package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest1 {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(4000);
	
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(4000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(4000);
	driver.findElement(By.id("login-button")).click();
	
	Thread.sleep(2000);
	
	String success_url="https://www.saucedemo.com/inventory.html";
	String current_url=driver.getCurrentUrl();
	
	if(success_url.equals(current_url)) {
		System.out.println("Test Passed");
	}
	else {
		System.out.println("Test Failed");
	}
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"item_4_img_link\"]/img")).click();
	Thread.sleep(2000);
   // driver.findElement(By.id("logout_sidebar_link")).click();
	
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
  Thread.sleep(2000);
	driver.findElement(By.className("shopping_cart_link")).click();
	Thread.sleep(2000);
    driver.close();
	
}
}
