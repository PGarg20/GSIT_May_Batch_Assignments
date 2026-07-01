package day3;

public class Assignment4_27_June_FactorsOfNumber {
	
public static void main(String[] args) {
		
		int num=24;
		
		System.out.println("Factors of " +num+ " are:");
		
		for(int i=1;i<=24;i++)
		{
			if(num%i==0)
			{
				System.out.println(+i);
			}
			
		}
			

}
}
