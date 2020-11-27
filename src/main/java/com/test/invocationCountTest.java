package com.test;

import org.testng.annotations.Test;

public class invocationCountTest {
	
	@Test(invocationCount=5)
	public void sum() {
		
		int a=2, b=5, c;
		c=a+b;
		
		System.out.println(c);
	}

}
