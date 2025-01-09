package legendryjavaprograms.streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findAnyfinFirstconcatof2streams {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "one");

        Optional<String> ele = stringList.stream().findAny();

        System.out.println(ele.get());    
 //-----------------------------------------------------------------------------------------------       
        //findFirst()
        Optional<String> ele1 = stringList.stream().findFirst();

        System.out.println(ele1.get());
  //----------------------------------------------------------------------------------------------
        System.out.println(" ");
        
        //Concat of 2 streams
        
        List<String> animalsList = Arrays.asList("Dog", "Cat", "Elephant");
        List<String> birdsList = Arrays.asList("peacock", "parrot", "Crow");

        Stream<String> stream1 = animalsList.stream();
        Stream<String> stream2 = birdsList.stream();

        List<String> finalList = Stream.concat(stream1, stream2)
                                       .collect(Collectors.toList());
        
        System.out.println("1st way of represensing o/p: "+finalList);

        for (String item : finalList) {
            System.out.println(item);
        }
    }
}
