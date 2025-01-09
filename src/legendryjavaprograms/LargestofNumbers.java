package legendryjavaprograms;

public class LargestofNumbers {

	public static void main(String[] args) {
		int k=11;
		int l=12;
		int m=13;
		
		int largest1 = k>l?k:l;
		int largest2 = largest1>m?largest1:m;
		
		System.out.println("The largest number is "+ largest2);
		

	}

}
