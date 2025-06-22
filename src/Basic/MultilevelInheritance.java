package Basic;
//class A
//{
//		int id;
//		String name;
//		A(int id,String name)
//		{
//			this.id=id;
//			this.name=name;
//		}
//				
//}
//class B extends A
//{
//	
//	int age;
//	
//	B(int id,String n,int age)
//	{
//		super(id,n);
//		this.age=age;
//	}
//	
//}
//class C extends B
//{
//
//	C(int id, String n, int age) {
//		super(id, n, age);
//		
//	}
//	
//}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		C c=new C(1,"riya",13);
		c.id=1;
		System.out.println("id="+c.id+"\nname="+c.name+"age="+c.age);
	}
}

//vehicle --modelno,carname,
//car -- no of wheel
//electriccar -- batterypower





