package CodingQuestion;

class Bike
{
	public void run()
	{
	System.out.println("running");
	}
}
class Splendor extends Bike
{
	  public void run()
	  {
		  System.out.println("running safely");
	  }
}
public class Polymorphism {

	public static void main(String[] args) {
		
	Bike b = new Bike();	
    Bike s = new Splendor();
    b.run();
    s.run();
	}

}
