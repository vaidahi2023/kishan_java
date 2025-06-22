package Basic;
//multiple and multilevel
interface A
{
	void methodA();
}
interface B
{
	void methodB();
}
class C implements A,B
{

	@Override
	public void methodB() {
		
		System.out.println("Method B");
	}

	@Override
	public void methodA() {
		System.out.println("Method A");
	}
	public void methodC() {
		System.out.println("Method C");
	}
}
class D extends C
{
	void methodD()
	{
		System.out.println("Method D");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		
		D d=new D();
		d.methodA();
		d.methodB();
		d.methodC();
		d.methodD();
		
	}
	
	
}
