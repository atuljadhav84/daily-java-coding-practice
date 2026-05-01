// 5)Single Digit OR Two Digit 

import java.util.Scanner;
public class SingleOrTwoDigit {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        System.out.println("Enter a num: ");

        int num = obj.nextInt();
        String res = num>= -9 || num<9? "Single Digit":"Not Singele Digit";
        System.out.println(num +" is "+res);
        obj.close();
    }

    
}
    

