package day3;

public class Assignment3_27_June_SumOfDigits {
	
	public static void main(String[] args) {
		
		int num=1234;
		int sum=0;
		for(;num>0;)
		{
			int lastDigit=num%10;
			sum=sum+lastDigit;
			num=num/10;
		}
		
			System.out.println("Sum:"+sum);

}
}
