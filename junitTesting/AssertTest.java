package junitTesting;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
	@Test
	public void testAssert() {
	//variable declaration
	String string1="Junit";
	String string2="Junit";
	String string3="test";
	String string4="test";
	int variable1=1;
	int variable2=2;
	int[]arithmeticarray1= {1,2,3};
	int[]arithmeticarray2= {1,2,3};
	
	Assert.assertEquals(string1,string2);
	Assert.assertSame(string3,string4);
	Assert.assertNotSame(string3,string2);
//	Assert.assertNull(string5);
	Assert.assertNotNull(string1);
	Assert.assertTrue(variable1<variable2);
	Assert.assertArrayEquals(arithmeticarray1,arithmeticarray2);
	
}
}