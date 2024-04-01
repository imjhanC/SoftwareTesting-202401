package application;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeMethodsTest {
	
	
	@Test
	public void test() {
		SomeMethodsClass smc = new SomeMethodsClass();
		String[] actualArrays = {"lol","lol2","lol1"};
		String strtoAdd = "_add";
		String[] expectedResult = {"loladd","lol2add","lol1add"};
		smc.addSomeStrings(actualArrays, strtoAdd);
		assertArrayEquals(expectedResult,actualArrays);
	} // failed
	
	@Test
	public void test1() {
		SomeMethodsClass smc = new SomeMethodsClass();
		int age = 30;
		boolean result = smc.checkHumanAge(age);
		assertTrue(result);
	} //passed
	
	@Test
	public void test2() {
		SomeMethodsClass smc = new SomeMethodsClass();
		String[] strArr = {"xyz","uvw","pqrs","abcdee"};
		int length =5;
		// For the second test case, expect null as no string has length larger than strLength2
		assertNull(smc.getAString(strArr, length));
		//abcdee is exceeding 5 so failed
		
	}
	
	@Test
	public void test3() {
		SomeMethodsClass smc = new SomeMethodsClass();
		String[] strArray = {"aaa","bbb","ccc","ddd","eee"};
		int pos = 1;
		String expectedStr ="aaa";
		assertEquals(expectedStr,smc.getStringAtPos(strArray, pos));
	} // aaa is in pos 0 but 1 is bbb
}
