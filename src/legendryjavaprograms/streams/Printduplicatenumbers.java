package legendryjavaprograms.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Printduplicatenumbers {

	public static void main(String[] args) {
		//for duplicates we use freqency in Collections 
		
		List<Integer> numbers = Arrays.asList(1,2,3,1,2,5,6,8,7,6,5,10,9);
		Set<Integer> duplicateset =numbers.stream()
		.filter(e -> Collections.frequency(numbers, e)>1)//numbers whose frequency is greater than 1 in the list numbers are passed one by one 
		.collect(Collectors.toSet());
		
		System.out.println(duplicateset);//will print only duplicate numbers
		

	}

}
