package Basic;
//interface is like the class 
//interface contains abstract method 
//we can declare the method in interface 
//interface A
//{
//	void print();	
//}
//interface B 
//{
//	void show();
//}
class C implements A,B
{	
	public void print() {
		System.out.println("this is class A method");
	}

	
	public void show() {
		System.out.println("it is class B method");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		
		C c=new C();
		c.print();
		c.show();
	}
	
}
