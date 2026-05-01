// Divisible by 5 and 10 
// Input: num=50  output: DIVISIBLE 
// Input: num=60  output:NOT DIVISIBLE
import java.util.Scanner;
class DivisibleBy5{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = obj.nextInt();

        String res = a%5==0 && a%10==0? "Divisible":"Not Divisible";
        System.out.println(a+" is "+res);
        obj.close();
    }
}
