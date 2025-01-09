package legendryjavaprograms.strings;

public class RemovespecialcharactersfromString {

	public static void main(String[] args) {
		String str = "#@$%j#^&ava*";
		String plain = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plain);
		

	}

}
