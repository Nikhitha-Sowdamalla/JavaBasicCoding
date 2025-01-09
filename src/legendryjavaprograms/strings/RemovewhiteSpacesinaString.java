package legendryjavaprograms.strings;

public class RemovewhiteSpacesinaString {

	public static void main(String[] args) {
		String s = "ja w a a a  n";
		String plain = s.replaceAll("\\s", "");
		System.out.println(plain);

	}

}
