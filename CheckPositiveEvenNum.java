//Check Positive Even Number  (num > 0 && num % 2 == 0 )
import java.util.Scanner;
class CheckPositiveEvenNum {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        String res = num>0 && num%2==0? "Positive Even":"NotPositiveEven";
        System.out.println(num+" "+res);
        obj.close();
    }   
}
