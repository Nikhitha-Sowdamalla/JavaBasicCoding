package legendryjavaprograms;

public class PrimeorNot {

	public static void main(String[] args) {
		int n = 1234;
		
		for(int i=2;i<n/2;i++)
		{
			if(n%i == 0)
			{
				System.out.println("Number is not a prime "+ n);
			}
			else
			{
				System.out.println("Number is a prime "+ n);
			}
			break;
		}
		
	}
}
