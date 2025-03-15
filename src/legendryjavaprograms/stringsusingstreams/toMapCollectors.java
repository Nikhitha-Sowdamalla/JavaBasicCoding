package legendryjavaprograms.stringsusingstreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class toMapCollectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = List.of("one", "two", "three", "four", "five", "six", "seven");
		
		Map<Integer, String> collect13 = stringList.stream()
                .collect(Collectors.toMap(String::length, e -> e, (oldValue, newValue) -> newValue + ":" + oldValue));
        System.out.println("collect13 = " + collect13);

	}

}
