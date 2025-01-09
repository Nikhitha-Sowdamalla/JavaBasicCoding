package legendryjavaprograms.dsa;

import java.util.Scanner;

public class BubblesortandBinarysearch {

    public static void main(String[] args) {
        int array[] = {9, 3, 4, 1, 2, 6, 7, 5, 8};
        bubbleSort(array);
        System.out.print("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Perform binary search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();
        int result = binarySearch(array, key);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        scanner.close();
    }

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { // For ascending order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int array[], int key) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if key is present at mid
            if (array[mid] == key) {
                return mid;
            }
            
            // If key is greater, ignore the left half
            if (array[mid] < key) {
                left = mid + 1;
            } 
            // If key is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        
        // Key not present in the array
        return -1;
    }
}
