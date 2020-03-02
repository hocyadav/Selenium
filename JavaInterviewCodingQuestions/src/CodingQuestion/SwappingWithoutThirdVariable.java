package CodingQuestion;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		
		System.out.println("Before Swapping :");
		int x=43;
		int y=32;
		System.out.println("Value of x :" + x);
		System.out.println("Value of y :" + y);
		
		System.out.println("After swapping :");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of x :" + x);
		System.out.println("Value of y :" + y);
		
	}

}
