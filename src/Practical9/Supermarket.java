package Practical9;

class Market {
    private int hasLoyaltyCard;
    private int hasLoyaltyAccount;
    private int hasCoupon;
    private int discountApplied;
    
    public Market(int hasLoyaltyCard, int hasLoyaltyAccount, int hasCoupon) {
        this.hasLoyaltyCard = hasLoyaltyCard;
        this.hasLoyaltyAccount = hasLoyaltyAccount;
        this.hasCoupon = hasCoupon;
        this.discountApplied = 0;
    }
    
    public int getHasLoyaltyCard() {
        return hasLoyaltyCard;
    }
    
    public int getLoyaltyAccount() {
        return hasLoyaltyAccount;
    }
    
    public int getHasCoupon() {
        return hasCoupon;
    }
    
    public int getDiscountApplied() {
        return discountApplied;
    }
    
    public void processAccount(int hasLoyaltyCard, int hasLoyaltyAccount, int hasCoupon) {
        if (hasCoupon == 1 && hasLoyaltyAccount == 1) {
        	throw new IllegalArgumentException();
        }
        
        // Calculate maximum discount
        if (hasCoupon == 1) {
            discountApplied = 20; // Coupon discount
        } else if (hasLoyaltyAccount == 1) {
            discountApplied = 15; // Loyalty account discount
        } else {
            discountApplied = 10; // Loyalty card discount
        }
    }
}

public class Supermarket {

      
}