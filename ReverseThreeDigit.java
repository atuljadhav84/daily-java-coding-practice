// 15)WAP to Reverse a 3 digit number 
class ReverseThreeDigit{
public static void main ( String [] args){
	int num = 123;
	int last = num%10;   //3
	int middle = (num/10)%10;      //2
	int first = num/100;
	int reverse = last*100 + middle*10 + first;
	System.out.println(reverse);
	}
}


