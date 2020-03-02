package CodingQuestion;

import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String inputstr=sc.next();
		String outputstr="";
        
		for(int i=0;i<inputstr.length()-1;i++)
		{
			for(int j = 0;j<outputstr.length();j++)
				{
				if(inputstr.charAt(i) != outputstr.charAt(j))
				{
					outputstr=outputstr+inputstr.charAt(i);
					
				}
				
				}
			
			}
		System.out.println("Duplicate characters are :" + outputstr);

	}

}
