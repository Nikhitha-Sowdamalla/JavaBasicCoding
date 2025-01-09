package legendryjavaprograms;

public class ReverseOfaNumber {

	public static void main(String[] args) {
		int num = 12345678;
		int rem;
		int rev = 0;
		
		while(num!=0)
		{
			rem = num%10;//8
			rev = rev*10+rem; // 0*10+8= 8
			num = num/10;//12345678/10= 1234567
	    }
		System.out.println("Reverse of the number is: "+rev);

	}

}
