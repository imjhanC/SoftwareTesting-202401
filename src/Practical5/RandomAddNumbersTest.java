package my.edu.utar;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomAddNumbersTest {

	@Test
	public void testAddTwoNumbers() {
		
		RandomAddNumbers ran = new RandomAddNumbers();
		int result = ran.addTwoNumbers(3);
		assertEquals("fail",5,result);
	}

}
