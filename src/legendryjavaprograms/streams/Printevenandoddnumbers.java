package legendryjavaprograms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Printevenandoddnumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> evennumbers = numbers.stream().filter(e -> e%2==0).collect(Collectors.toList());
		List<Integer> oddnumbers = numbers.stream().filter(e -> e%2!=0).collect(Collectors.toList());
		System.out.println(evennumbers);
		System.out.println(oddnumbers);
		
		
		
		

	}

}
