package legendryjavaprograms.stringsusingstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindtheLongestWordinaListofStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Nikki","Nik","Nikhitha");
		
		Optional<String> longestWord = names.stream()
                .max(Comparator.comparingInt(String::length));

        // Print the result
        longestWord.ifPresent(word -> System.out.println("Longest word: " + word));
		

	}

}
