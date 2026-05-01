// 6)Invalid Marks  (marks < 0 || marks > 100 )

import java.util.Scanner;
class InvalidMarks {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        System.out.println("Enter a num: ");

        int marks = obj.nextInt();
        String res = marks>0|| marks<=100 ? "Valid Marks":"Invalid marks";
        System.out.println(marks +" is "+res);
        obj.close();
    }

    
}
    
