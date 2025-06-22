package Basic;

//final variable ,method,class 
final class D
{
	final void print()
	{
		System.out.println("final");
	}
}
public class FinalD extends D{

	final int count=3;
	public static void main(String[] args) {
		
		FinalD f=new FinalD();
		//f.count=4;
		f.print();
	}
	
	
}
