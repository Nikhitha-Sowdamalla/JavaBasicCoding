package legendryjavaprograms;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = {1,2,3,40,50,60};
		int search_element = 60;
		boolean flag = false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("search element found at index "+ i +" is "+a[i]);
				flag = true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("search element is not found at any index");
		}
		

	}

}
