package Assertions;

import org.junit.Assert;
import org.junit.Test;

public class Test2 {
	
	@Test
	void demoTest(){
		
		Assert.assertTrue(true); //passed
		Assert.assertEquals("welcome", "Welcome"); //False - failed
		Assert.assertEquals("selenium", "selenium"); //true - passed
		System.out.println("Successfully passed!");

	}
}
