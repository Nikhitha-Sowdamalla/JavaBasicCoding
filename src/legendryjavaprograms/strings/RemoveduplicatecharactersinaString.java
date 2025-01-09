package legendryjavaprograms.strings;

public class RemoveduplicatecharactersinaString {

	public static void main(String[] args) {
		String s="programming";
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);//it will seperate the word in to individual letters
			//System.out.println(ch);
			int index = s.indexOf(ch, i+1);//
			if(index==-1)
			{
				sb.append(ch);//only unique characters will be appended
				
			}
		}
		System.out.println(sb);

	}

}
