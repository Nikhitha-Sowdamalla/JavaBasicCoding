package legendryjavaprograms;

public class SumofDigitsinaNumber {

	public static void main(String[] args) {
		int num = 12345678;
		int sum = 0;
		
		while(num!=0)
		{
			int rem = num%10;//8//7
			sum=sum+rem;//0+8+7
			num=num/10;
		}
		System.out.println("Sum of digits in a number is "+sum);

	}

}
