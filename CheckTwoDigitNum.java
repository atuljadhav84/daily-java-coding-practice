
// 7)Two Digit Number  (num >= 10 && num <= 99) 
// Input: num=45 output: TWO DIGIT 
// Input: num=999 output: IT IS NOT TWO DIGIT
class CheckTwoDigitNum {
    public static void main(String[] args) {
        int num = 45;
        int num2 = 999;
    
        String res1 = num>10 && num<99? "Two Digit":"Not Two Digit";
        String res2 = num2>10 && num2<99? "Two Digit":"Not Two Digit";

        System.out.println(num + " is "+ res1);
        System.out.println(num2+ " is "+ res2);

        // 8)Three Digit Number  (num >= 100 && num <= 999 ) 
        int num3 = 555;
        String res3 = num3>100 && num3<999? "Three Digit":"Not Three Digit";
        System.out.println(num3 +" is "+ res3);
    }
    
}
