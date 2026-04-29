// 10)WAP to print product of last 3 digit in a given number 
class ProductOfLast3Di{
	public static void main ( String [] args){
	int a = 1234;
	int b = a%10;           //4
	
	int c = a/10;            //123
	int d = c%10;           //3

	int e = c/10;
	int f = e%10  ;          //2
	System.out.println("Last 3 digit is: " +b+" "+d+" "+f);
	System.out.println("Product is: "+ b*d*f);

}
}