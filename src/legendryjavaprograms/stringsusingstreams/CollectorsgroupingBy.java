package legendryjavaprograms.stringsusingstreams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsgroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("cat", "dog", "apple", "hi", "banana", "bat", "car","racecar","Madam");
		
		//1.group words that have samelength
		Map<Integer, List<String>> collect11 = words.stream()
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println("collect11 = " + collect11);
        
                            //(or)

        Map<Integer, Set<String>> collect12 = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println("collect12 = " + collect12);
        
        
     //2.Group Words by First Letter Using startsWith()
        Map<Boolean, List<String>> groupedByA = words.stream()
                .collect(Collectors.groupingBy(word -> word.startsWith("a") || word.startsWith("A")));

        System.out.println("Words starting with 'A': " + groupedByA.get(true));
        System.out.println("Words NOT starting with 'A': " + groupedByA.get(false));
        
       //3.Group Words by Their Last Letter 
        Map<Character, List<String>> groupedByLastLetter = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(word.length() - 1)));

        System.out.println(groupedByLastLetter);
        
        
        //4.Group Words by Case (Uppercase vs Lowercase)
        Map<Boolean, List<String>> groupedByCase = words.stream()
                .collect(Collectors.groupingBy(word -> word.equals(word.toUpperCase())));

        System.out.println("Uppercase words: " + groupedByCase.get(true));
        System.out.println("Lowercase words: " + groupedByCase.get(false));
        
        

       //5.Group Words by Whether They Contain a Vowel

        Map<Boolean, List<String>> groupedByVowelPresence = words.stream()
                .collect(Collectors.groupingBy(word -> word.matches(".*[aeiouAEIOU].*")));

        System.out.println("Words with vowels: " + groupedByVowelPresence.get(true));
        System.out.println("Words without vowels: " + groupedByVowelPresence.get(false));

        
        //6.Group Words by First Letter
        Map<Character, List<String>> groupedByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println(groupedByFirstLetter);
        
        
        //7.Group Words by Length and Count Words in Each Group
        Map<Integer, Long> countByLength = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(countByLength);
        


	}

}
