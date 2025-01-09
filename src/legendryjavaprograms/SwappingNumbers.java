package legendryjavaprograms;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		//Way1 - with temp
		int a = 5;
		int b = 10;
		int temp;
		System.out.println("numbers before swap are:" + a +" "+b); // a=5,b=10
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("numbers after swap are:" + a +" "+b); //a=10,b=5
		
		//Way2 - without temp
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("numbers after swap are:" + a +" "+b); //a=5,b=10

		

	}

}
