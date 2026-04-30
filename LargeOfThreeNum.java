// 11)Largest of Three Numbers 
class LargeOfThreeNum{
	public static void main (String [] args){
	byte a = 10;
	byte b = 20;
	byte c = 30;
	int res = (a > b) 
                        ? (a > c ? a : c) 
                        : (b > c ? b : c);
	System.out.println("Big Num is: "+ res);
	}
}
