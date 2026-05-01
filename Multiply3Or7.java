// 4)Multiple of 3 OR 7
import java.util.Scanner;
class Multiply3Or7 {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        System.out.println("Enter a num: ");

        int num = obj.nextInt();
        String res = num%3==0 || num%7==0? "Multiplay":"Not Mutilplay";
        System.out.println(num +" is "+res);
        obj.close();
    }

    
}
