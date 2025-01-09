package legendryjavaprograms.strings;

//way1
//public class ReverseaString {
//
//	public static void main(String[] args) {
//		String s ="Nikhitha";
//		String rev =" ";
//		
//		for(int i=0;i<s.length();i++)
//		{
//			rev = s.charAt(i)+rev;
//		}
//		
//		System.out.println(rev);
//
//	}
//
//}

//----------------------------------------------------------------------------------------------------------------------------------------
//way2

public class ReverseaString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Nikhitha");
		sb.reverse();
		System.out.println(sb);

	}

}