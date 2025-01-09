package legendryjavaprograms;

public class DuplicateElementsinanArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,5,6,2};
		boolean status = false;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					status = true;
					System.out.println("Duplicate/Duplicates are present at index "+ i +" is "+a[i]);
					
				}
			}
		}
		if(status==false)
		{
			System.out.println("Duplicate/Duplicates are not present");
		}

	}

}
