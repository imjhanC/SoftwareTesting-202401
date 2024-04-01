package Practical9;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class DemoDecisionTableTest {
	Customer cus = new Customer(0, 0, 10);

	@Test
	@Parameters({ "false,true,0,0,0", 
		"false,false,100,0,0", 
		"false,true,101,10,0", 
		"false,false,200,10,0",
			"true,true,100,10,0", 
			"true,true,101,10,0", 
			"true,false,100,0,100", 
			"true,false,101,0,101" })
	public void testProcessPurchaseValidValues(boolean haveCard, boolean chooseDiscount, int amountSpent,
			int expectedDiscount, int expectedLoyaltyPoints) {
		cus.processPurchase(haveCard, chooseDiscount, amountSpent);
		assertEquals(expectedDiscount, cus.getExtraDiscount());
		assertEquals(expectedLoyaltyPoints, cus.getLoyaltyPoints());
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters({ "false,true,-1", 
		"false,false,-2", 
			"true,false,-4", 
			"true,true,-3" })
	public void testProcessPurchaseInvalidValues(boolean haveCard, boolean chooseDiscount, int amountSpent) {
		cus.processPurchase(haveCard, chooseDiscount, amountSpent);
	}
}