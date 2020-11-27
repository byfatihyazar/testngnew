package com.test;

import org.testng.annotations.Test;

public class exceptionTimeOutTest {
	
	@Test(timeOut=2000)
	public void loopTest() {
		
	
		}
		
		@Test(expectedExceptions=ArithmeticException.class)
		public void expectedException() {
			
			int i=1/0;
			
				
				System.out.println(i);
			}
	}


