// 10)Working Day (1–5)  (condition day >= 1 && day <= 5 ) 
// Input: day= 3  output: working day 
// Input: day= 8 output: NOT WORKING DAY

public class WorkingDay {
    public static void main(String[] args) {
    int d1 = 3;
    int d2 = 8;

    String res1 = d1>=1 && d1<= 5? "Working Day" : "Not Working Day";
    String res2 = d2>=1 && d2<= 5? "Working Day" : "Not Working Day";

    System.out.println(d1+" "+res1);
    System.out.println(d2+" "+res2);

    // Teen Age (13–19) 
    // Input: age=20 output: NOT TEEN AGE 
    // Input: age=17 output: TEEN AGE
    int age1 = 20;
    int age2 = 17;
    String a1 = age1>13 && age1<19? "Teen Age":"Not Teen Age";
    String a2 = age2>13 && age2<19? "Teen Age":"Not Teen Age";

    System.out.println(age1+" is "+a1);
    System.out.println(age2+" is "+a2);

    
    }
}
