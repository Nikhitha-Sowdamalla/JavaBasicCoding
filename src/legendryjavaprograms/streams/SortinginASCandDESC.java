package legendryjavaprograms.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortinginASCandDESC {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 22, 34, 52, 62, 2222,2222, 742, 999);

		List<Integer> sortedNumbersinDESC = numbers.stream()
		                                     .sorted((a, b) -> b - a)  // Custom comparator to sort in descending order
		                                     .collect(Collectors.toList());  // Collect the result into a list

		System.out.println("Sorted numbers in descending order: " + sortedNumbersinDESC);
		
		List<Integer> sortedNumbersinASC = numbers.stream()
                .sorted()  // default is ascending order
                .collect(Collectors.toList());  // Collect the result into a list

System.out.println("Sorted numbers in ascending order: " + sortedNumbersinASC);

//way2 to get desc order

List<Integer> sortedNumbersinDESCway2 = numbers.stream()
.sorted(Comparator.reverseOrder())  // Custom comparator to sort in descending order
.collect(Collectors.toList());

System.out.println("Sorted numbers in descending order: " + sortedNumbersinDESCway2);
	}
}
