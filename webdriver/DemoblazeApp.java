package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class DemoblazeApp{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe ");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.demoblaze.com/");
 Thread.sleep(2000);
 
 driver.manage().window().maximize();
 Thread.sleep(2000);
 
 
 
 
 
 
 driver.findElement(By.id("login2")).click();
 Thread.sleep(2000);
 driver.findElement(By.id("loginusername")).sendKeys("pooja");
 
 Thread.sleep(2000);
 driver.findElement(By.id("loginpassword")).sendKeys("pooja");
 Thread.sleep(2000);
 
 //css=tag:contains("inner text")//
 driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
 Thread.sleep(2000);
 
 Alert alert=driver.switchTo().alert();
 alert.accept();
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[1]/button/span")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.linkText("Contact")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.id("recipient-email")).sendKeys("poojapatel@gmail.com");
 Thread.sleep(2000);
 
 driver.findElement(By.id("recipient-name")).sendKeys("pooja");
 Thread.sleep(2000);
 
 driver.findElement(By.id("message-text")).sendKeys("I want new mobile");
 Thread.sleep(2000);
 
 driver.findElement(By.className("btn btn-primary")).click();
 
 driver.findElement(By.linkText("About us")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.linkText("Cart")).click();
 Thread.sleep(2000);
 
 driver.findElement(By.linkText("Sign up")).clear();
 
 
// driver.findElement(By.className("??????")).click();//
 Thread.sleep(2000);
 //By.cssSelector("img[Attribute=value])"
 driver.findElement(By.cssSelector("class[class=vjs-poster")).click();
 Thread.sleep(2000);
 
 
 
 driver.close();
	
}
}





//Alert alert=driver.switchTo().alert();//pointer moves to alert window
//String msg=alert.getText();//Incase you want to print msg
 //System.out.println(msg);
//Thread.sleep(2000);
//alert.accept();


//WebElement vacation=driver.findElement(By.linkText("Vacations"));
//Action movetovacation=builder.moveToElement(vacation).build();
//movetovacation.perform();
//Thread.sleep(2000);
//driver.close();






