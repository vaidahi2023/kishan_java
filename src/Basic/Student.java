package Basic;

//A static nested class is declared with the static keyword. 
//It behaves like a regular top-level class but is nested for packaging convenience. 
//Static nested classes cannot directly access non-static members of the enclosing class.
public class Student {

	int id;
	String name;
	static String college_name;

	static class A
	{
		void print()
		{
			System.out.println("static class");
		}
	}
	public static void main(String[] args) {
		
		college_name="ABC";
		Student s=new Student();
		s.id=1;
		s.name="riya";
		Student s1=new Student();
		s1.id=1;
		s1.name="siya";
		s1.college_name="BCD";
		System.out.println("name="+s.name+"id="+s.id+"\ncollage name="+s.college_name);
		System.out.println("name="+s1.name+"id="+s1.id+"\ncollage name="+s1.college_name);
		A a=new A();
		a.print();
	}
	
	
}
