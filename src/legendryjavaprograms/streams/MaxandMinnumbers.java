package legendryjavaprograms.streams;

import java.util.Arrays;
import java.util.List;

public class MaxandMinnumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 22, 34, 52, 62, 2222, 742, 999);

		int max = numbers.stream().max(Integer::compareTo).orElse(0);
//		                (or) int max = numbers.stream().mapToInt(e -> e)    // Convert each element to an int
//		                 .max()               // Get the maximum value
//		                 .orElseThrow();      // Handle case where list might be empty

		System.out.println("Max value: " + max);
		
		int min = numbers.stream()
                .mapToInt(e -> e)    // Convert each element to an int
                .min()               // Get the minimum value
                .orElseThrow();      // Handle case where list might be empty

System.out.println("Min value: " + min);

	}

}


//.mapToInt(e -> e) 