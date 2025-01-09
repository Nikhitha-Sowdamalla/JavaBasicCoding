package legendryjavaprograms.dsa;

public class Bubblesort {

	public static void main(String[] args) {
		int array[] = {9,3,4,1,2,6,7,5,8};
		bubbleSort(array);
		System.out.print("Sorted array: ");
		for(int i:array)
		{
			System.out.print(i+"  ");
		}
	}

		
		
		public static void bubbleSort(int array[]) {
			
			for(int i = 0; i < array.length - 1; i++) {
				for(int j = 0; j < array.length - i - 1; j++) {
					if(array[j]>array[j+1]) //for ascending order if descending order you want change the sign i.e., array[j]<array[j+1]
					{
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}

	          }
		   }
}



// bubble sort = pairs of adjacent elements are compared, and the elements
//                          swapped if they are not in order.

//     Quadratic time O(n^2)
//     small data set = okay-ish
//     large data set = BAD (plz don't)
