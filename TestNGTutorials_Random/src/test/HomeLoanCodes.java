package test;

import org.testng.annotations.Test;

public class HomeLoanCodes {
	@Test
	public void apiHomeLoan() {
		System.out.println("It is API test on home loan");
	}
	
	@Test
	public void webHomeLoan() {
		System.out.println("It is web test of home loan");
	}
	
	@Test
	public void dbHomeLoan() {
		System.out.println("It is Data base testing of home loan");
	}
}
