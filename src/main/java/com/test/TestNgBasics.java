package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	// Pre Conditions
	@BeforeSuite
	public void setUP() {
		System.out.println("Setup");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@BeforeMethod
	public void enterURL(){
		System.out.println("Enter URL");
	}
	
	@BeforeTest
	public void login() {	
		System.out.println("Login Method");
	}
	// Test Condition
	@Test
	public void googleTitle() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test
	public void googleLogotest() {
		System.out.println("Google Logo Test");
	}
	
	
	
	// Post condition
	@AfterMethod
	public void logOut() {
		System.out.println("Logout");
	}
	
	@AfterTest
	public void deleteAllCoookies() {
		System.out.println("Delete All cookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browseer");
	}
	
	
	
	
	
	
	
}
