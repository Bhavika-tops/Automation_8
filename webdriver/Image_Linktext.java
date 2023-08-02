package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_Linktext {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_d02c24db-70c4-44a2-a19f-9b3c7f27d23c_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otr");
	 Thread.sleep(2000);
	 
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.cssSelector("img[title=Flipkart]"));
	 Thread.sleep(2000);
	 
	 driver.close();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
}
