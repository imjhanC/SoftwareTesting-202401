package my.edu.utar;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import my.edu.utar.RandomFindLargest;

public class RandomFindLargestTest {
	
	@Test
	public void testFindLargestNumberInRandomArray() {
		
		RandomFindLargest rfl = new RandomFindLargest();
		
		//create an array of length 5, and fill it with random
		// integers between 0 and 8
		int result = rfl.findLargestNumberInRandomArray(5, 8);
		assertEquals(7, result);
	}	
}
