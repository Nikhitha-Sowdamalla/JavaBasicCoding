package legendryjavaprograms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Printsumofallnumbers {

	public static void main(String[] args) {
		//method 1 using streamApi
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		int sum = list.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		// METHOD2 
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		Function<List<Integer>, Integer> sumFunction = list1 -> {
            int sum1 = 0;
            for (Integer number : list1) {
                sum1 += number;
            }
            return sum1;
        };

        // Apply the function to the list
        
        int sum1 = sumFunction.apply(numbers);

        System.out.println("Sum of elements: " + sum1);
		
	}
}
