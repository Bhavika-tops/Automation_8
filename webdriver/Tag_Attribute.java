package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tag_Attribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/newtours/register.php");
     Thread.sleep(2000);
     driver.manage().window().maximize();
     
     Thread.sleep(2000);
     
   //css=tag[attribute=value]
       driver.findElement(By.cssSelector("input[name=firstName]")).sendKeys("pooja"); 
     Thread.sleep(2000);
     
      driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("patel");
       Thread.sleep(2000);
     
        driver.findElement(By.cssSelector("input[name=phone]")).sendKeys("8954535908");
        Thread.sleep(2000); 
     driver.findElement(By.id("userName")).sendKeys("poojapatel.gmail.com");
        Thread.sleep(2000);
        
     driver.findElement(By.name("address1")).sendKeys("Orchid Whitefield");   
        Thread.sleep(2000);
        
        driver.findElement(By.name("city")).sendKeys("Ahmedabad");
        Thread.sleep(2000);
        
        driver.findElement(By.name("state")).sendKeys("Gujarat");
        Thread.sleep(2000);
        
        driver.findElement(By.name("postalCode")).sendKeys("380051");
        Thread.sleep(2000);
        
        Select country=new Select(driver.findElement(By.name("country")));
        
        Thread.sleep(2000);
        country.selectByVisibleText("INDIA");
        Thread.sleep(2000);
        
        driver.findElement(By.id("email")).sendKeys("poojapatel");
        Thread.sleep(2000);
        
        driver.findElement(By.name("password")).sendKeys("pooja");
        Thread.sleep(2000);
        
        driver.findElement(By.name("confirmPassword")).sendKeys("pooja");
        Thread.sleep(2000);
        
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);
     driver.close();

     
     
     
}
}
