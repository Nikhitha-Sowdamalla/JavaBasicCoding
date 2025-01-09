package legendryjavaprograms;

public class Sumof2numbersofanarrayis8 {

	public static void main(String[] args) {
		int a[] = {1,22,34,54,60,7,0,8,9,-1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==8)
				{
					System.out.println(a[i] + " " +a[j]);
				}
			}
		}
		

	}

}
