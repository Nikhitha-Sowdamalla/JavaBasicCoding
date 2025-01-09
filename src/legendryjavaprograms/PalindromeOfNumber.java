package legendryjavaprograms;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		//IF THE GIVEN NUMBER IS PALINDROME OR NOT
		
		int num = 1412;
		int rev = 0;
		int rem;
		int originalnum = num;
		
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		if(originalnum == rev)
		{
			System.out.println("The Number is a palindrome " + originalnum + " " +rev);
		}
		else {
			System.out.println("The Number is not a palindrome " + originalnum + " " +rev);
		}

	}

}
