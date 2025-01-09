package legendryjavaprograms.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberStartingwithPrefix2 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(2,22,34,52,62,2222,742,999,-222);
		
		List<Integer> numstartwithprefix2=numbers.stream()
		                .map(e -> String.valueOf(e)) //to convert numbers to String
		                .filter(e -> e.startsWith("2")||e.startsWith("-2"))//only on strings we can use startsWith so we ae converting the numbers to string and filtering
		                .map(Integer::valueOf) //to convert string numbers to Integers
		                .collect(Collectors.toList());
		
		double avg=numstartwithprefix2.stream().mapToInt(e -> e).average().getAsDouble();
		
		System.out.println(numstartwithprefix2);
		System.out.println(avg);
	}

}

//Notes

//String.valueOf(e) is a way to make sure that whatever e is, you get a string version of it that you can work with in your code.
//If e is a number: It turns the number into a string (e.g., 123 becomes "123").
//If e is a boolean: It converts true or false into "true" or "false".
//If e is an object: It calls the object's toString() method to get its string representation. If the object is null, it returns "null".



//mapToInt(e -> e):
//This step takes each number from the stream and confirms it as an int. It's like saying, "Take each number as it is, and treat it as a basic number (an integer)."

//average():
//This method calculates the average (mean) of all the numbers in the stream. If you had numbers like 2, 22, 2222, this step would calculate their average.

//getAsDouble():
//The average() method returns an OptionalDouble because the stream might be empty (which would cause the average to be undefined). getAsDouble() is used to actually retrieve the average as a double (a number with decimal places).