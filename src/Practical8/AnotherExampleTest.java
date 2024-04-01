package my.edu.utar;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static junitparams.JUnitParamsRunner.$;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class AnotherExampleTest {
	
	AnotherExample ae = new AnotherExample();

	@Test
	@Parameters(method = "CombineStringParam")
	public void testCombineStringValid(String words, int x, String expResult) {
		String actResult = ae.combineStrings(words, x);
		assertEquals(expResult, actResult);
		
	}
	
	private Object[] CombineStringParam() {
		return new Object[] {
				new Object[] {"i am a cat", 4, ""},
				new Object[] {"", 4, ""},
				new Object[] {"i am a cat", 2, "cat"},
				new Object[] {"i am a cat", 0, "i am a cat"},
				new Object[] {"i am a cat", -3, "i am a cat"}
				
		};
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testCombineStringInValid() {
		ae.combineStrings(null, 5);
	}

}
