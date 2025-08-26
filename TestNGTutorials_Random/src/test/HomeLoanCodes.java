package test;

import org.testng.annotations.Test;

public class HomeLoanCodes {
	@Test
	public void apiHomeLoan() {
		System.out.println("It is API test on home loan");
		System.out.println("It is revised API test on home loan done by X");
	}
	
	@Test
	public void webHomeLoan() {
		System.out.println("It is web test of home loan");
	}
	
	@Test
	public void webHomeLoan2() {
		System.out.println("It is second web test of home loan");
	}
	
	@Test
	public void dbHomeLoan() {
		System.out.println("It is Data base testing of home loan");
	}
}
