package legendryjavaprograms.streams;


	//anyMatch() -> will always takes predicate inside it
	
	import java.util.HashSet;
	import java.util.Set;

	public class anymatchallmatchnonematch {
	    public static void main(String[] args) {
	        Set<String> fruites = new HashSet<String>();

	        fruites.add("One apple");
	        fruites.add("One mango");
	        fruites.add("Two apples");
	        fruites.add("More grapes");
	        fruites.add("Two guavas");

	        // anyMatch()
	        boolean result = fruites.stream().anyMatch(value -> {
	            return value.startsWith("One");
	        });
	        
	        System.out.println(result);
	        
	        // allMatch
	        boolean result1 = fruites.stream().allMatch(value -> {
	            return value.startsWith("One");
	        });
	   
	        System.out.println(result1);
	        
	        // noneMatch
	        boolean result2 = fruites.stream().noneMatch(value -> {
	            return value.startsWith("One");
	        });
	   
	        System.out.println(result2);
	    }
	}