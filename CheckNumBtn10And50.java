// 1)Check Number Between 10 and 50 
import java.util.Scanner;
class CheckNumBtn10And50 {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        String res = a>10 && a<50? "InRange" : "OutOfRange";
        System.out.println(a+" "+res);
        scn.close();
    }
}
