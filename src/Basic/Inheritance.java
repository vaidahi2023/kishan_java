package Basic;
//inheritance is used to inherit parent class property
/*
 * type of inheritance
 * 1.single
 * 2.multiple inheritance
 * 3.multilevel inheritance
 * 4.hirechical inheritance
 * 5.hybrid inheritance
 */

class Parent 
{
	String name;
	void display()
	{
		System.out.println("parent class");
	}
}
class Child extends Parent 
{
	void print()
	{
		System.out.println("child class");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
	
	Child c=new Child();
	c.display();
	c.print();
	c.name="child";
	System.out.println("name="+c.name);
	}
}
