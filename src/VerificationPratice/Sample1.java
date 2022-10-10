package VerificationPratice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample1 {
	 
	// Soft Asserts :- non static methods
	@Test
	public void Test1() {
		SoftAssert soft = new SoftAssert();
		String str1="Hello";
		soft.assertEquals(str1, "Hi");
		System.out.println(str1);
		
		String str2="Hi";
		soft.assertEquals(str2, "Hi");
		System.out.println(str2);
		
		soft.assertAll();
	}
}
