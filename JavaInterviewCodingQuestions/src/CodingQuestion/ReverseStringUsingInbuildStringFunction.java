package CodingQuestion;

public class ReverseStringUsingInbuildStringFunction {

	public static void main(String[] args) {
		String act="Bangalore";
		String rev= new StringBuffer(act).reverse().toString();
		
		System.out.println("Actual String :" + act);
		System.out.println("Reversed String :" +  rev);
		
	

	}

}
