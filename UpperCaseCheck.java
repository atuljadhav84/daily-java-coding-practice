// Character Uppercase Check 
// Input: ch=’B’  output: UPPERCASE 
// Input: ch=’i’   output: NOT UPPERCASE 
class UpperCaseCheck {
    public static void main(String[] args) {
    char a = 'B';
    char b = 'i';

    String res1 = a>=65 && a<90? "Uppercase" : "Not Uppercase";
    String res2 = b>97 && b<122? "Not Uppercase" : "Uppercase";

    System.out.println(a+ " is "+ res1);
    System.out.println(b+" is "+ res2);

    //9) Character is Lowercase or not 
    // Input: ch=’a’ output: Lowercase 
    // Input: ch=’P’ output: Not Lowercase 
    char c = 'f';
    String res3 = c>=97 && c<122? "LowerCase" : "Not LowerCase";
    System.out.println(c +" is "+ res3);
    }

}


