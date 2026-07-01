package day3;

public class Assignment5_27_June_FibonacciSeries {
	
	public static void main(String[] args) {
	
	int num1=0;
	
	int num2=1;
	
	int count=10;
	
	System.out.print(num1+ " " +num2);
	//System.out.println(+num2);

	
	for(int i=3;i<=count;i++)
	{
		
		int num3=num1+num2;  //0+1 =1
		
		num1=num2;
		num2=num3;
		System.out.print(" " +num3);
		
		
	}
}
}
