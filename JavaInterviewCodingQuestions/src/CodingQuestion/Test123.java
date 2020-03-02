package CodingQuestion;

public class Test123 {
	public static void main(String[] args) {
		try{
			System.out.println("6");
			int i = 22/0;//when try fails catch will be printed
			System.out.println("8");
			System.out.println(i);
		}catch(Exception e){
			System.out.println("11");
			System.out.println(e);
		}
		
	}
}
