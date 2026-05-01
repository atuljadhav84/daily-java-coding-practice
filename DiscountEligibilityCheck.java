// 12)Discount Eligibility  (amount >= 3000 && amount <= 10000 ) 
// Input: amount = 4000 output: ELIGIBLE FOR DISCOUNT 
// Input: amount=2500 output: NOT ELIGIBLE FOR DISCOUNT
class DiscountEligibilityCheck {
    public static void main(String[] args) {
        int amount = 4000;
        int amount2 = 2500;

        String a = amount>=3000 && amount <= 10000? "ELIGIBLE FOR DISCOUNT":"NOT ELIGIBLE FOR DISCOUNT";
        String b = amount2>=3000 && amount2 <= 10000? "ELIGIBLE FOR DISCOUNT":"NOT ELIGIBLE FOR DISCOUNT";

        System.out.println(amount+ " is "+ a);
        System.out.println(amount2+" is "+b);
    }
}
