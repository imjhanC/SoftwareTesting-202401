package my.edu.utar;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class NewRandomAddNumbersTest {
	
	@Test
	public void testAddTwoNumbersDummy() {
		// Setting up the test 
		RandomNumberFunctionality dummy = new DummyRandomNumber(5);
		NewRandomAddNumbers nr1 = new NewRandomAddNumbers(dummy);
		
		// Executing the test
		int result = nr1.addTwoNumbers(3); //num1 = 3 and num2 =; er = 8
		assertEquals(8, result);
	}	

	@Test
	public void testAddTwoNumbersMockito() {
		//create the test double object based on interface
		RandomNumberFunctionality rnMock = mock(RandomNumberFunctionality.class);
		
		//test double object will behave as stub
		when(rnMock.getRandomInteger(anyInt())).thenReturn(10);	//stub
		
		NewRandomAddNumbers nr1 = new NewRandomAddNumbers(rnMock);
		
		// Executing the test
		int result = nr1.addTwoNumbers(5);//num1=5; num2=10; er=15
		assertEquals(15, result);
	}
	
	@Test
	public void testAddTwoNumbersWithoutInterface() {
		//create test double object based on the concrete class
		RandomGeneratorClass rnMock = mock(RandomGeneratorClass.class);//original DOC
		
		//test double object will behave as STUB
		when(rnMock.getRandomInteger(anyInt())).thenReturn(15);	
		
		
		RandomAddNumbers nr1 = new RandomAddNumbers(rnMock);
		
		// Executing the test
		int result = nr1.addTwoNumbers(5);//num1=5, num2=15, er=20
		assertEquals(20, result);
	}
}
