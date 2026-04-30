// 16) Loan Eligibility  (condition: creditScore>=550)
class LoanEligibility{
	public static void main ( String[]args){
	int men1= 500;
	int men2= 600;
	String res1 = men1>=550? "Eligible" : "Not Eligible";
	String res2 = men2>=550? "Eligible" : "Not Eligible";
	System.out.println("Result is: "+ res1);
	System.out.println("Result is: "+ res2 );
	}
}