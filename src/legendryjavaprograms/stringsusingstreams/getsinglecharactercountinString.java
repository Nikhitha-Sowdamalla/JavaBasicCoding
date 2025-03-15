package legendryjavaprograms.stringsusingstreams;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class getsinglecharactercountinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "hello"; // Single word input

        // Extract unique characters
        Set<Character> uniqueChars = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        // Count occurrences of each character
        Map<Character, Long> charCount = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Print unique characters
        System.out.println("Unique Characters: " + uniqueChars);

        // Print character frequency count
        System.out.println("Character Count: " + charCount);

	}

}
