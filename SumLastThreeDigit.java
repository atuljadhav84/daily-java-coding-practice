// 8)WAP to print sum of last 3 digit in a given number 
class SumLastThreeDigit{
	public static void main ( String [] A){
	int num = 1234;
	int sum  =0;

	int first = num%10; //4

	int second = num/10; //123
	second = second%10;//3
	
	int third = num/10;  //12
	third = third%10; //2
	
	System.out.println(third);

	}
}