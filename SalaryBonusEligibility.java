 // 5) Salary Bonus Eligibility  (condition salary >= 25000 && exp >= 2 ) 
 import java.util.Scanner;
 class SalaryBonusEligibility {
    public static void main(String[] args) {
        System.out.println("Entee a Salary: ");
        Scanner obj = new Scanner(System.in);
        int sal = obj.nextInt();
        System.out.println("Enter Exp: ");
        int exp = obj.nextInt();
        String res = sal>25 && exp>2? "Eligible" : "Not eligible";
        System.out.println("res is: "+res);
        obj.close();
    }
}
