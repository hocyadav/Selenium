package CodingQuestion;

import java.util.Scanner;

public class PrimeNumFrom1Ton {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum number");
		
		String num=sc.nextLine();
		int max=Integer.parseInt(num);
		
		 for(int i =2;i<=max;i++)
		 {
			 boolean isPrime=true;
			 
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
