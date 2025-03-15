package legendryjavaprograms.stringsusingstreams;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = List.of("one", "two", "three", "four", "five", "six", "seven");

        String collect1 = stringList.stream()
                .collect(Collectors.joining());
        System.out.println("collect1 = " + collect1);

        String collect2 = stringList.stream()
                .collect(Collectors.joining("->"));
        System.out.println("collect2 = " + collect2);

        String collect3 = stringList.stream()
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println("collect3 = " + collect3);

	}

}
