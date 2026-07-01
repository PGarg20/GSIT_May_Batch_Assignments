package day4;

public class Assignment_29_June {
	
	public static void main(String[] args) {
		
		int num=59371;
		int largestDigit=0;
		
		
		for(;num>0;)
		{
			
			int lastDigit=num%10;
			
			if(lastDigit>largestDigit) 
			{
			
				largestDigit=lastDigit;
				
			
			}
				
				num=num/10;
			
		}
		
		System.out.println("Largest Digit: " +largestDigit);
		

}
}
