package CodingQuestion;

public class SecondHighestInArray {

	public static void main(String[] args) {
		int[] arr= {12,76,54,98,100,3};
		int firstlargest=arr[0];
		int secondlargest= arr[0];
		
		System.out.println("Given array:");
		for(int i=0;i<arr.length;i++)
		 {  
			System.out.println(arr[i]);
		 }
		for(int i=0;i<arr.length;i++)
		 {
			if(arr[i]>firstlargest)
			 { 
				secondlargest=firstlargest;
				firstlargest=arr[i];
			 }
			else if(arr[i]>secondlargest)
			 {
				secondlargest=arr[i];
			 }
		 }
		System.out.println("Second largest num is:" + secondlargest);
	}

}
