//25)sum of all subject marks
//26)Total Percentage
class TotalPercentage {
	public static void main( String [] args ){
	short m1 = 70 ;
	short m2 = 80 ;
	short m3 = 65 ;
	short m4 = 90 ;
	short m5 = 75;
	
	int max = 500;
	int total = m1+m2+m3+m4+m5;

	double per = (total/max)*100;      //   Percentage = (Total Marks / Maximum Marks) * 100
	System.out.println("Total mark is: "+total);
	System.out.println("Percentage is: "+per);
}	
}