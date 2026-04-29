// 6)WAP to print last 2 digit in a given number 
class PrintLastTwoDi{
	public static void main ( String [] args){
	int a = 1234;
	int b = a%10;

	int c = a/10;
	int d = c%10;
	System.out.println("last Two Digit: "+ d +""+ b);
}	
}