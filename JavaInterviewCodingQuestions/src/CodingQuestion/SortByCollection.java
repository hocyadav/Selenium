package CodingQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByCollection {

	public static void main(String[] args) {
		
	List<String> names= Arrays.asList("Isha","neha","Umang","Tarang","Aditya","Anmol");
		Collections.sort(names);
		System.out.println(names);

//Reverse
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
		
//Integer
	List<Integer> num=Arrays.asList(32,33,45,1,2,38,90,55,6666,777);
	Collections.sort(num);
	System.out.println(num);
	
//Reverse
	Collections.sort(num, Collections.reverseOrder());
	System.out.println(num);
	}

}
