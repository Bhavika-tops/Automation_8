package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTestDemo {
   
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() throws InterruptedException
	
	{
		System.setProperty("webdrivr.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");     //get url
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	}
	@Before
		public void before() throws InterruptedException
		{                            //logged in successfully
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		}
	
	@Test
	public void test1() throws InterruptedException
	{                                        //test passed
		String success_url="https://www.saucedemo.com/inventory.html";
		
		String current_url=driver.getCurrentUrl();
		if(success_url.equals(current_url)) {
			System.out.println("Test Passed");
			}
		else {
			System.out.println("Test failed");
		}
		Thread.sleep(2000);   
	}  
	        
		@After
		public void after() throws InterruptedException
		{                         //logged out successfully
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(2000);	
		}
		@AfterClass
		public static void afterclass() throws InterruptedException
		{
			Thread.sleep(2000);
		    driver.close();          //Test completed
		}
				
}
