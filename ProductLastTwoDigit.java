// 9)WAP to print  product of last 2 digit in a given number 
class ProductLastTwoDigit{
	public static void main (String [] args){
	int a = 1234;//1234
	int b = a%10; //4

	int c = a/10; //123
	int d = c%10; //3
	System.out.println("Product of last Two Digit: " +b*d);
}
}