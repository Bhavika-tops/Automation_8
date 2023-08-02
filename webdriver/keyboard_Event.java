package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.interactions.SendKeysAction;

public class keyboard_Event {
	public class DropdownList {
		public void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    Thread.sleep(2000);
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    WebElement email=driver.findElement(By.id("email"));//fetch
		    Actions builder=new Actions(driver);// make obj
		    Action action=(Action) builder.moveToElement(email)//email par move karna hai
		     .click()
		     .keyDown(email,Keys.SHIFT)
		      .sendKeys("pooja")
		      .keyUp(email,Keys.SHIFT)
		      .doubleClick()
		      .contextClick()
		      .build();
		      action.perform();
		    
		    Thread.sleep(2000);

		driver.close();
	
			
		}
	}
}
	
	
	
	