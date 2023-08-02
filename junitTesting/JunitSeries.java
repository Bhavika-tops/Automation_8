package junitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitSeries {
	
	
     @BeforeClass
	public static void beforeclass()
	{
		System.out.println("Before class");
	}
     @Before
	public void before()
	{
		System.out.println("Before Test");
	}
     @Test
	public void test1()
	{
		System.out.println("First Test Annotation");
	}
  //   @Ignore
     @Test
     public void test2()
     {
    	 System.out.println("Second Test Annotation");
     }
	@After
     public void after()
 	{
 		System.out.println("After Test");
 	}
	@AfterClass
	 public static void afterclass()
	 	{
	 		System.out.println("After Class");
	 	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
