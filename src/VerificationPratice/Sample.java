package VerificationPratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void Test1() {
		String str1="Hello";
		Assert.assertEquals(str1, "Hi");   // FAIL
		System.out.println(str1);
		
		String str2="Hi";
		Assert.assertEquals(str2, "Hi");  // Pass
		System.out.println(str2);
	}

}
