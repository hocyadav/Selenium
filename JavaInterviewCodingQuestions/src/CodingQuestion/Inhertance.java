package CodingQuestion;

class Animal
{
  void eat()
	{
	System.out.println("eating");
	}
}
class Deer extends Animal
{
	 void chew()
	{
		System.out.println("chewing grass");
	}
}	
	

public class Inhertance {

	public static void main(String[] args) {
	 Deer d = new Deer();
	 d.chew();
     d.eat();
	}

}

