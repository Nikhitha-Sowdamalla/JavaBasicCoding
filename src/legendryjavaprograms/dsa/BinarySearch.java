package legendryjavaprograms.dsa;

import java.util.Arrays;
//binary search = Search algorithm that finds the position
//of a target value within a sorted array.
//Half of the array is eliminated during each "step"
//find the index of the search element. This logic must be applied only on sorted data.
//Way 1
//public class BinarySearch {
//
//	public static void main(String[] args) {
//		
//		int array[] = new int[1000000];
//		int target = 26;
//		
//		for(int i=0;i<array.length;i++)
//		{
//			array[i] = i*2;
//		}
//		
//		int index = Arrays.binarySearch(array, target);
//		
//		if(index<0)
//			{
//			System.out.println(target+" not found");
//			}
//		
//		else 
//			{
//			System.out.println("Element found at:"+index);	 
//			}
//
//	}
//
//}

//---------------------------------------------------------------------------------------------------------------------------------------
//Way2


//public class BinarySearch {
//
//    public static void main(String[] args) {
//        // Initialize the array
//        int[] array = {1, 300, 500, 4000, 10000, 500000};
//
//        // Define the target element to search for
//        int target = 500000;
//
//        // Perform binary search
//        int index = Arrays.binarySearch(array, target);
//
//        // Check the result of the binary search
//        if (index >= 0) {
//            System.out.println("Element " + target + " found at index: " + index);
//        } else {
//            System.out.println("Element " + target + " not found.");
//        }
//    }
//}
//---------------------------------------------------------------------------------------------------------------------------------------------
//way3 - Without using Arrays.binarySearch from java.util package and also understanding the number of iterations
public class BinarySearch {

    public static void main(String[] args) {
        // Initialize the array
        int[] array = {1, 300, 500, 4000, 10000, 500000};//0+5=5/2=floor(2.5)=2 so 1st middle number will be 500 is target>500 or <500 as 500000 >500 go to right and check

        // Define the target element to search for
        int target = 500000;

        // Perform binary search
        int index = binarySearch(array, target);
        
        if (index >= 0) {
         System.out.println("Element " + target + " found at index: " + index);
    } else {
        System.out.println("Element " + target + " not found.");     
        }
    }
        
        

private static int binarySearch(int[] array, int target) {
	
	int low = 0;
	int high = array.length - 1;
	
	while(low <= high) {
		
		int middle = low + (high - low) / 2;
		int value = array[middle];
		
		System.out.println("middle: " + value);
		
		if(value < target) low = middle + 1;
		else if(value > target) high = middle - 1;
		else return middle; //target found
	}
	
	return -1;
}
}



















