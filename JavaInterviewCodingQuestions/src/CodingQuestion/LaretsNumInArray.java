package CodingQuestion;

public class LaretsNumInArray {

	public static void main(String[] args) {
		int[] a = new int[] {12,54,87,56,94,32};
		int max = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Given array element is : ");
		
		for(int i=0;i<a.length;i++)
		 {
			System.out.println(a[i]);
		 }
		System.out.println("Largest no. is :" + max);
	}

}
