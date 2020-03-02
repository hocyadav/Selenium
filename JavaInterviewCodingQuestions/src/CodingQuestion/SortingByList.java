package CodingQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class SortingByList {

	public static void main(String[] args) {
		
	List<String> names= Arrays.asList("Swarn","Hariom","Isha","Sonali");
		
	names.sort(Comparator.comparing(String::toString));
      System.out.println(names);
      
//Reverse
     names.sort(Comparator.comparing(String::toString).reversed());
      System.out.println(names);
      
//Integer
      List<Integer> num= Arrays.asList(1,34,54,55,34,54,32,11,234);
      num.sort(Comparator.comparing(Integer::valueOf));
      System.out.println(num);
      
//Reverse
      
      
      System.out.println(num);
      
	}
	  

}
