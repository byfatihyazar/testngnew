package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest() {
		
		System.out.println("Login Test");
		
		int x=1/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePage() {
		
		System.out.println("Homepage Test");
	}
	
	

}
