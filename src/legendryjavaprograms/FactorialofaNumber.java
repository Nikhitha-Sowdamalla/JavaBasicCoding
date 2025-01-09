package legendryjavaprograms;

public class FactorialofaNumber {

	public static void main(String[] args) {
		int num = 6;
		int fact = 1;
		
		while(num!=0)
		{
			fact= fact*num;
			num--;
		}
		System.out.println("The factorial of number is :" + fact);

	}

}
