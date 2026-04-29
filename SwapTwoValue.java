//3.  WAP to swap two values without using third variable using * and / 
class SwapTwoValue{
	public static void main ( String [] args){
	int a = 10;
	int b = 20;

	System.out.println("Before swap: "+a);
	System.out.println("Before swap: "+b+"\n");
	a = a*b; // 200
	b = a/b; // 10
	a = a/b; // 20

	System.out.println("Before swap: "+a);
	System.out.println("Before swap: "+b);
	}
}