package test;

import org.testng.annotations.Test;

public class PersonalLoanCodes {

	@Test
	public void apiPersonalLoan() {
		System.out.println("It is API test on personal loan");
	}
	
	@Test
	public void webPersonalLoan() {
		System.out.println("It is web test of personal loan");
	}
	
	@Test
	public void dbPersonalLoan() {
		System.out.println("It is Data base testing of personal loan");
	}
}
