package CodingQuestion;

import java.util.Scanner;

public class PrimeNumFrom1to100 {

	public static void main(String[] args) {
		
		System.out.println("Enter number from 1 to 100 ");
		
		for(int i=1;i<=100;i++)
		{
			boolean isPrime = true;
			
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					isPrime=false;
			}
			if(isPrime)
				System.out.print(i + " ");
		}
			
		
		
		
	     
	    	 
		
		

	}

}
