package junitTesting;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit {
	
	@Test
	public void test()
	{
		String str1="This is my junit Testing";
		Assert.assertEquals("This is my junit Testing", str1);
	}	
} 





