package legendryjavaprograms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class squarefilterandavgofnumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,11);
		
		OptionalDouble desired = list.stream().map(e -> e*e).filter(e -> e>100).mapToInt(e -> e).average();
		
		if(desired.isPresent())
		{
		System.out.println(desired.getAsDouble());
	    }
		else
		{
			System.out.println("no such element");
		}
}
}
