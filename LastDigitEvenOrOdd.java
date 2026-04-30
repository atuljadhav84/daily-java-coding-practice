// 19)Last Digit Even or Odd  

class LastDigitEvenOrOdd{
	public static void main ( String [] args){
	short num1 = 123;
	short num2 = 156;
	int a = num1%10; //3
	int b = num2%10; //6

	String res1 = a/2==0? "Even":"Odd";
	String res2 = b/2==0? "Even":"Odd";
	System.out.println("Num 1 is: "+ res1);
	System.out.println("Num 2 is: "+ res2);
	
	}
}