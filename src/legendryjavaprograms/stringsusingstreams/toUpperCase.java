package legendryjavaprograms.stringsusingstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class toUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> stringList = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");
		List<String> uppercase = stringList.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercase);
		
		
		

	}

}
