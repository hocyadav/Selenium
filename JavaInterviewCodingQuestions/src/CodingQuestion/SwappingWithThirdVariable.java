package CodingQuestion;

public class SwappingWithThirdVariable {

	public static void main(String[] args) {
		int temp=0;
		System.out.println("Before Swapping :");
		int x=43;
		int y=32;
		System.out.println("Value of x :" + x);
		System.out.println("Value of y :" + y);
		
		System.out.println("After swapping :");
		temp=x;
		x=y;
		y=temp;
		System.out.println("Value of x :" + x);
		System.out.println("Value of y :" + y);

	}

}
