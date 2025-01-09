package legendryjavaprograms.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHIGHESTandLOWEST {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40);
		// 40, 30, ... 0
		// 0, 1, 2, ... 40

		// sec highest:
		int secHH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secHH);

		// sec lowest:
		int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secL);


	}

}
