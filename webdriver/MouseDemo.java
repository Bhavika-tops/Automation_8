package com.webdriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Actions builder=new Actions(driver);
	WebElement home=driver.findElement(By.linkText("Home"));
	
	Action movetohome=builder.moveToElement(home).build();
	
	movetohome.perform();
	
	Thread.sleep(2000);
	
	
	WebElement flights=driver.findElement(By.linkText("Flights"));
	Action movetoflights=builder.moveToElement(flights).build();
	movetoflights.perform();
    Thread.sleep(2000);
    
    WebElement hotels=driver.findElement(By.linkText("Hotels"));
    Action movetohotels=builder.moveToElement(hotels).build();
    movetohotels.perform();
    Thread.sleep(2000);
    
    WebElement cars=driver.findElement(By.linkText("Car Rentals"));
    Action movetocars=builder.moveToElement(cars).build();
    movetocars.perform();
    Thread.sleep(2000);
    
    WebElement cruises=driver.findElement(By.linkText("Cruises"));
    Action movetocruises=builder.moveToElement(cruises).build();
    movetocruises.perform();
    Thread.sleep(2000);
    
    WebElement destination=driver.findElement(By.linkText("Destinations"));
    Action movetodestination=builder.moveToElement(destination).build();
    movetodestination.perform();
    Thread.sleep(2000);
    
    WebElement vacation=driver.findElement(By.linkText("Vacations"));
    Action movetovacation=builder.moveToElement(vacation).build();
    movetovacation.perform();
    Thread.sleep(2000);
	driver.close();
	
	
	
	
	
	
	
	

}
}







