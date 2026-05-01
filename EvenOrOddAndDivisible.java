// Check Even OR Divisible by 5  (num % 2 == 0 || num % 5 == 0 )
import java.util.Scanner;
class EvenOrOddAndDivisible {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number here: ");
        int num = obj.nextInt();
        String a = num%2 == 0|| num%5 ==0? "Even":"Even & Not Divisible";
        System.out.println(num +" is "+a);
        obj.close();
    }
    
}
