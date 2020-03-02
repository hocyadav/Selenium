package CodingQuestion;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num,temp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
		    if(temp==0)
		    {
		    	isPrime=false;
		    	
		    }
		 }
		
		 if(isPrime)
		 {
			 System.out.println("Number is prime");
		 }
		 else 
		 {
			 System.out.println("Number is not prime");
		 }
	}

}
