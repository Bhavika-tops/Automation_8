package junitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
	
	
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bakht\\Desktop\\Automation Tool\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");  //get Url
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}
	@Before
	public void before() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		System.out.println("Login Successfully");
	}
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);	
	}
	@Test
	public void test2() throws InterruptedException
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
	}
	@After
	public void after() throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		System.out.println("logout successfully");
	}
     @AfterClass
	public static void afterclass() throws InterruptedException
	{
		driver.close();
		Thread.sleep(2000);
		System.out.println("website closed successfully");
	}
	
	
	
	
	
	
	

}
