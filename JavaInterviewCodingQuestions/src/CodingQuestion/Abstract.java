package CodingQuestion;
//rule 1: abstract method min 1 (at least 1)
//rule 2: method with body min 0 or more
abstract class Shape
{
	
	abstract void draw();//unimplemented
	
	void fun2() {//Implemented
		System.out.println("...");
	}
}

class Circle extends Shape
{
	@Override
	public void draw()//implement
	{
		System.out.println("draw circle");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Shape c = new Circle();
		//Circle c = new Circle();
		
		
		c.draw();
		

	}

}
