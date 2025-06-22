package Basic;

class Parent1 
{
	void print()
	{
		System.out.println("parent class");
	}
}
class Child1 extends Parent1 
{
	void print()
	{
		System.out.println("child class");
	}
}
public class Runpolymorphism {

	public static void main(String[] args) {
		
		Child1 c=new Child1();
		c.print();
		
	}
}
