package test;

import java.nio.charset.Charset;
import java.util.Random;

import org.testng.annotations.Test;

public class testRandom {
	
	@Test
	public void randomAnyString() {
	    byte[] array = new byte[7]; // length is bounded by 7
	    new Random().nextBytes(array);
	    String generatedString = new String(array, Charset.forName("UTF-8"));

	    System.out.println("Any Random String is: " +generatedString);
	}
	
	@Test
	public void randomStringWithAlphabets() {
		int stringLength = 9;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i<stringLength; i++) {
			
			int index = random.nextInt(alphabet.length());
			char random_char = alphabet.charAt(index);
			sb.append(random_char);
		}
		System.out.println("Random String with Alphabets only" +sb.toString());
	}
	
	@Test
	public void randomAlphaNumericString() {
		int stringLength = 9;
		String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i<stringLength; i++) {
			
			int index = random.nextInt(alphanumeric.length());
			char random_char = alphanumeric.charAt(index);
			sb.append(random_char);
		}
		System.out.println("Random Alphanumeric string is: "+sb.toString());
	}
	
	@Test
	public void randomNumericString() {
		Random random = new Random();
        int randomNumber = random.nextInt(1000);
        String numericString = Integer.toString(randomNumber);
        System.out.println("Numeric String: " + numericString);
	}
	
	@Test
	public void randomIntegerNumber() {
		Random random = new Random();
        int randomNumber = random.nextInt(1000);
        System.out.println("Random Integer Number: " + randomNumber);
    	}
	
	@Test
	public void randomDoubleNumber() {
		double max = 20.0;
		double min = 5.0;
		double randomDoubleValue = min + (max-min)*Math.random();
		System.out.println("A Random Double Value between 5.0 and 20.0 is: " + randomDoubleValue);		
	}
	
	@Test
	public void randomEmailGenerator() {
		Random random = new Random();
        int randomNumber = random.nextInt(1000);
        String name="John";
        String digitString = Integer.toString(randomNumber);
        String email = name+digitString+"@example.abc";
        System.out.println("Random Email generated as: "+email);
	}
}
