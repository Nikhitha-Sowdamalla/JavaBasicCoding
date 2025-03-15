package legendryjavaprograms.stringsusingstreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class filteringCollectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = List.of("one", "two", "three", "four", "five", "six", "seven");
		
		List<String> collect14 = stringList.stream()
                .collect(Collectors.filtering(s -> s.length() > 3, Collectors.toList()));
        System.out.println("collect14 = " + collect14);
        
        
        Set<String> collect15 = stringList.stream()
                .collect(Collectors.filtering(
                        s -> s.length() > 3,
                        Collectors.mapping(s -> s.toUpperCase(), Collectors.toSet())
                ));
        System.out.println("collect15 = " + collect15);
    

	}

}
