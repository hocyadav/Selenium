package CodingQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Integer> obj = new LinkedList<Integer>();
		
		obj.add(10); 
		obj.add(20); 
		obj.add(30); 

		
		System.out.println("Queue : "+obj);
//		try {
//			
//			System.out.println(obj.remove());q : not null
//			System.out.println(obj.remove());q : not null
//			System.out.println(obj.remove());q : not null
//			System.out.println(obj.remove()); // q : null -> empty
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
		
		while(!obj.isEmpty()) {
			System.out.println("remove "+obj.remove());
		}
		
		//System.out.println("Queue : "+obj);
		
		
	}
}
