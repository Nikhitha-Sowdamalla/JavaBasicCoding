package legendryjavaprograms.stringsusingstreams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorspartioningBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> words = List.of("cat", "dog", "apple", "hi", "banana", "bat", "car","racecar","Madam");

		 
		//1.Print the strings whose length is grater than or equal to 3 in one list and less than in other stream
	        Map<Boolean, Set<String>> partitionedWords = words.stream()
	                .collect(Collectors.partitioningBy(word -> word.length() > 3, Collectors.toSet()));

	        System.out.println("Words with length > 3: " + partitionedWords.get(true));
	        System.out.println("Words with length ≤ 3: " + partitionedWords.get(false));
	        
	        
	   //2.Give the words which start with vowels and other list should have strings starting with consonents
	        Map<Boolean, List<String>> partitionedByVowel = words.stream()
	                .collect(Collectors.partitioningBy(word -> word.matches("^[AEIOUaeiou].*")));

	        System.out.println("Starts with a vowel: " + partitionedByVowel.get(true));
	        System.out.println("Starts with a consonant: " + partitionedByVowel.get(false));
	        
	        
	   //3.Separate palindromes from non-palindromes
	        Map<Boolean, List<String>> partitionedByPalindrome = words.stream()
	                .collect(Collectors.partitioningBy(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())));

	        System.out.println("Palindromes: " + partitionedByPalindrome.get(true));
	        System.out.println("Non-Palindromes: " + partitionedByPalindrome.get(false));
	        
	        
	   //4.Partition Words Containing a Specific Letter (e.g., ‘e’)
	        
	        Map<Boolean, List<String>> partitionedByLetterE = words.stream()
	                .collect(Collectors.partitioningBy(word -> word.contains("e")));

	        System.out.println("Words containing 'e': " + partitionedByLetterE.get(true));
	        System.out.println("Words without 'e': " + partitionedByLetterE.get(false));
	        
	        
	    
	        
	        
	        
	        

	}

}
