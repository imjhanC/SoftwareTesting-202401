package my.edu.utar;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class DemoSetupTest {

	static int x = 0;
	int y = 0;

	@BeforeClass //1
	public static void setupClass() {
		x = 5;
		System.out.println("setup class");
	}

	@AfterClass //11
	public static void endClass() {
		System.out.println("end class");
	}

	@Before //2  //5 //8
	public void setupMethod() {
		y += 10;
		System.out.println("setup method. x = " + x + " y = " + y);
	}

	@After //4  //7 //10
	public void endMethod() {
		y += 20;
		System.out.println("end method. x = " + x + " y = " + y);
	}

	@Test //3
	public void thirdTest() {
		System.out.println("third Test. x = " + x + " y = " + y);
		x += 1;

	}

	@Test //6
	public void secondTest() {
		System.out.println("second Test. x = " + x + " y = " + y);
		x += 1;
	}

	@Test //9
	public void firstTest() {
		System.out.println("first Test. x = " + x + " y = " + y);
		x += 1;
	}
}
