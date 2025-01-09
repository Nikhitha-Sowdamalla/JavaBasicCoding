package legendryjavaprograms;

public class MinandMaxofanArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,100,0};
		int max = a[0];
		int min = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		
		

	}

}
