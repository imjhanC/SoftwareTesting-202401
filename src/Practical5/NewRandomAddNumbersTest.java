package my.edu.utar;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewRandomAddNumbersTest {

	@Test
	public void testAddTwoNumbersOriginal() {
		//Setting up the test
		RandomNumberFunctionality original = new NewRandomGeneratorClass();
		NewRandomAddNumbers nr1 = new NewRandomAddNumbers(original);
		
		// Executing the test
		int result = nr1.addTwoNumbers(3);
		assertEquals(5, result);
	}	
	
	@Test
	public void testAddTwoNumbersDummy() {
		// Setting up the test 
		RandomNumberFunctionality dummy = new DummyRandomNumber(5);
		NewRandomAddNumbers nr1 = new NewRandomAddNumbers(dummy);
		
		// Executing the test
		int result = nr1.addTwoNumbers(3);
		assertEquals(8, result);
	}	
}
