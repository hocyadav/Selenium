package CodingQuestion;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollectionIteration {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//creating arraylist
		list.add("Alex");
		list.add("Nexgen");
		list.add("Surebot");
		list.add("Css Corp");
		list.add("Informatica");
		
		System.out.println(list);
	
		 //Traversing list through iterator
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
  		System.out.println(itr.next());
		}

		
//Traversing through for-each loop
		for(String val : list)
		{
			System.out.print(val+" ");
		}
		
		
		
	}

}
