package CodingQuestion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int t1=0,t2=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the terms :");
		String max=sc.nextLine();
        int num =Integer.parseInt(max);
        
        for(int i=0;i<=num;i++)
        {
        	System.out.print(t1 + " ");
        	int sum = t1 + t2;
        	t1=t2;
        	t2=sum;
        	
         
         
        }
        	
	}

}
