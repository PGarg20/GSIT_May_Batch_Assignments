package day3;

public class Assignment2_27_June_CountDigits {
	
	public static void main(String[] args) {
		
		int num=12345;
		int count=0;
		
		//num%10=5    //last digit
		//num=num/10=1234
		
		//while(num>0)
		for(;num>0;)
		{
			count++;
			num=num/10;
		}
		System.out.println("Number of Digits: " +count);
		

	}

}
