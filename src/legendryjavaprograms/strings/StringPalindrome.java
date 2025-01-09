package legendryjavaprograms.strings;

public class StringPalindrome {

	public static void main(String[] args) {
		String s ="MOMA";
		String rev ="";
		
		for(int i=0;i<s.length();i++)
		{
			rev = s.charAt(i)+rev;
		}
		

		if(s.equals(rev))
		{
			System.out.println("Given String is a Palindrome");
		}
		else
		{
			System.out.println("Given String is not a Palindrome");
		}

	}

}
