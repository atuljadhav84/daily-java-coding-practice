//2.  WAP to swap two value without using third variable using + and  -
class SwapTwoNumber{
	public static void main ( String[] args){
	int a = 10;
	int b = 20;
	System.out.println("Before swap: "+a);
	System.out.println("Before swap: "+b+"\n");
	a = a+b; // a = 10+20 
	b = a-b; // b = 30-20
	a = a-b; // a =  30-10

	System.out.println("Before swap: "+a);
	System.out.println("Before swap: "+b);
		}
}