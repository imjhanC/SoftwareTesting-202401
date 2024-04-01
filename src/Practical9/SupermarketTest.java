package Practical9;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class SupermarketTest {
	 Market market = new Market(1,1,0);
    
	@Test
    @Parameters({
    	"1, 0, 0, 10", // Case: Loyalty card only
        "0, 1, 0, 15", // Case: Loyalty account only
        "0, 0, 1, 20", // Case: Coupon only
        "1, 0, 1, 20", // Case: Loyalty card and coupon
        "0, 1, 1, 20"  // Case: Loyalty account and coupon
    })
    public void testDiscountApplied(int hasLoyaltyCard,int hasLoyaltyAccount,int hasCoupon,int expectedDiscount) {
        market.processAccount(hasLoyaltyCard,hasLoyaltyAccount,hasCoupon);
        assertEquals(expectedDiscount, market.getDiscountApplied());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExceptionThrownWhenUsingCouponAndLoyaltyAccountTogether() {
        Market market = new Market(1, 1, 0);
    }
}
