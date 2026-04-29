// 13)WAP to find Remainder without using quotient
// Remainder = a - (b * quotient)

class FindRemainder {
	public static void main (String [] args){
	int a = 17;
 	int b = 5;
	int quotient = a/b;    //3
	int rem = a -(b * quotient);
	System.out.println("Remainder is: "+ rem);
	}
}