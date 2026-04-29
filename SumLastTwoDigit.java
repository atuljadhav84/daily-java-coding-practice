// 7)WAP to print sum of last 2 digit in a given number 
class SumLastTwoDigit{
	public static void main ( String [] A){
	int num = 123; 
	int sum = 0;
	
 	int first = num%10; // 3
	int second = num/10;
	second = second%10; //2 
	sum = first + second;

	System.out.println("First: "+first+"\nSecond: "+second+"\nSum of two: " +sum);
	}
}