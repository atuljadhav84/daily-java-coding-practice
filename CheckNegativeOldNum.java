import java.util.Scanner;

public class CheckNegativeOldNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        
        int a = obj.nextInt();
        String res  = a<0 && a%2 != 0? "Negative Odd":"Not Negative Odd";
        System.out.println(a+ "is "+ res);

        obj.close();
    }
    
}
