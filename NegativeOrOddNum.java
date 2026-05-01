// 3)Check Negative OR Odd  (num < 0 || num % 2 != 0 ) 

import java.util.Scanner;
class NegativeOrOddNum {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();

        String a = num<0 || num%2 != 0? "Negative ":"Not NEgative";
        System.out.println(num+ " is "+ a);
        obj.close();
    }
    
}
