// 1. WAP to swap using third variable

class SwapUsing3Variable{
	public static void main ( String []A ){
	int a = 50;
	int b = 100;
	System.out.println("before Swap");
	System.out.println("A:" +a);
	System.out.println("B:" + b+" \n");

	//int c = a+b;
	//b =  c-b;
	//a = c-b;
	
	int c = a;
	a= b;
	b = c;
	System.out.println("After Swap");
	System.out.println("A:" + a);
	System.out.println("B:" + b);
	}
}