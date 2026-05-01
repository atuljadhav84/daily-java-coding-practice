// 1)Check Number Between 10 and 50 
// Input num=25  output:- IN RANGE 
// Input num=60 output: OUT OF RANGE
class CheckNumLessOrGreater{
    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 25;

        String res1 = num1<10 || num1>50? "WithinRange":"Not in Range";
        String res2 = num2<10 || num2>50? "WithinRange":"Not in Range";

        System.out.println(num1 +" is "+res1);
        System.out.println(num2 +" is "+res2);
    }
}