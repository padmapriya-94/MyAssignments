package home.firstweek;

public class IsPrimeNumber {

	
	public static void main(String[] args) {
		int num=17;
		if (num<=1)
		{
		System.out.println(num+ "Is a PrimeNumber");
			
		} 
		else 
		{
			int i;
			for (i = 2; i<num; i++) 
			{
		if(num%i==0)
		{
			System.out.println(num+ "Is Not a PrimeNumber");

		}
		}
			if(i==num)
			{
				System.out.println(num+ "Is a PrimeNumber");
			}
			}
	}

}
