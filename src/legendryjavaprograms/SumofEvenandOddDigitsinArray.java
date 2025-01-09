package legendryjavaprograms;

public class SumofEvenandOddDigitsinArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int evencount = 0;
        int oddcount = 0;
        
        // Counting the number of even and odd numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
        
        // Create arrays based on counts
        int[] evensum = new int[evencount];
        int[] oddsum = new int[oddcount];
        
        // Resetting counters to use as array indices
        evencount = 0;
        oddcount = 0;
        
        // Populating the arrays with even and odd numbers
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evensum[evencount] = a[i];
                evencount++;
            } else {
                oddsum[oddcount] = a[i];
                oddcount++;
            }
        }
        
        // Printing the even numbers
        System.out.println("Even Numbers are:");
        for (int i = 0; i < evensum.length; i++) {
            System.out.print(evensum[i] + " ");
        }
        
        // Printing the odd numbers
        System.out.println("\nOdd Numbers are:");
        for (int i = 0; i < oddsum.length; i++) {
            System.out.print(oddsum[i] + " ");
        }
    }
}
