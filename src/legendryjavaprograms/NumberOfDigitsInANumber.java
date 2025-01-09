package legendryjavaprograms;

public class NumberOfDigitsInANumber {

	public static void main(String[] args) {
		int num = 12345678;
		int count = 0;
		int rem;
		
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		System.out.println("Count of number of digits in a number is "+ count);

	}

}
