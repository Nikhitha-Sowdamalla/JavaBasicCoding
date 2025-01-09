package legendryjavaprograms;


public class NumberOfEvenandOdddigitsinnumber {

	public static void main(String[] args) {
		long num = 12345678;
		int evencount = 0;
		int oddcount = 0;
		
		while(num!=0)
		{
			long rem = num%10;//8
			if(rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("The count of evendigits in the number is:"+evencount);
		System.out.println("The count of odddigits in the number is:"+oddcount);
		
	}

}
