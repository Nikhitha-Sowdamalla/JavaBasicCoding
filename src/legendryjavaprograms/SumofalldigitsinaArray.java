package legendryjavaprograms;

public class SumofalldigitsinaArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		int sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);

	}

}
