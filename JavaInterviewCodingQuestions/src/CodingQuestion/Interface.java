package CodingQuestion;

interface Shape11
{
	abstract void draw();//unimplemented
}

class Circle11 implements Shape11
{
	@Override
	public void draw() {
		System.out.println("circle");
	}
}
public class Interface {

	public static void main(String[] args) {
		//Shape11 c = new Circle11();
		Circle11 c = new Circle11();
		
		c.draw();
		

	}

}
