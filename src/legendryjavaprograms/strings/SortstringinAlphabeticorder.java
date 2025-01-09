package legendryjavaprograms.strings;

import java.util.Arrays;

public class SortstringinAlphabeticorder {

	public static void main(String[] args) {
		String s = "rock";
		char a[] = s.toCharArray();
		System.out.println(a);

		char temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(new String(a));
		
		//using sort method in arrays
		
		String s1="hello";
		char a1[] = s1.toCharArray();
		Arrays.sort(a1);
		System.out.println(new String(a1));
		

	}

}
