//  16)WAP to perform sum of 3 digit 
class SumOf3Digit{
	public static void main ( String [] args){

	int num = 123;
	int last = num%10;   //3
	int middle = (num/10)%10;      //2
	int first = num/100;
	int sum = last + middle + first;
	System.out.println("Sum of 3 digit: "+sum);
	}
}