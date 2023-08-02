package com.com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
	
		
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before Class");
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before Method");
		}
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Before Test");
		}
		
		@Test
		public void test1()
		{
			System.out.println("Test 1");
		}
		@Test
		public void test2()
		{
			System.out.println("Test 2");
		}
		
		@AfterClass
		public void afterClass()
		{
			System.out.println("After Class");
		}
		
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("After Method");
		}
		@AfterTest
		public void afterTest()
		{
			System.out.println("After Test");
		}
				
	}


