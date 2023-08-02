package com.com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	
    @BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	
	
	
	@Test
	public void test1()
	{
	  System.out.println("Main Test 1");	
	}
	
	
	
	
	@Test
	public void test2()
	{
		System.out.println("Main Test2");
	}
    
//	@AfterClass
//	public void afterClass()
//	{
//		System.out.println("Before Class");
//	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
    }





