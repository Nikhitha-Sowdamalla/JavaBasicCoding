package legendryjavaprograms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SKIPandLIMIT {

	public static void main(String[] args) {
		    List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);

		    // get first 5 numbers ---> sum of 5 numbers
		    List<Integer> l = list.stream().limit(5).collect(Collectors.toList());
		    System.out.println(l);

		    int sum = list.stream().limit(5).reduce((p,q) -> p+q).get();
		    System.out.println(sum);

		    // skip:
		    List<Integer> sk = list.stream().skip(5).collect(Collectors.toList());
		    System.out.println(sk);

		    int sumsk = list.stream().skip(5).reduce((p,q) -> p+q).get();
		    System.out.println(sumsk);
		}
	}


