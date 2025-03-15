package legendryjavaprograms.stringsusingstreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class countandprintindividualwordsinsentence  {
    public static void main(String[] args) {
    	
    	
        String sentence = "hello world hello java world java";

        // Split the sentence into words and convert it into a stream
        Map<String, Long> wordCount = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        
        System.out.println(wordCount);

        // Print each word and its count
        wordCount.forEach((word, count) -> System.out.println(word + " -> " + count));
    	

    	
 
   
    }
}
