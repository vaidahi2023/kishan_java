package Basic;

/*
 * poly -- many 
 * moriphm -- form 
 * complie time ---method overloading 
 * same name different argument
 * run time --method overridding
 * parent class method inherirt child class
 */
class A1
{
	public void sum(int a,int b)
	{
		int sum=0;
		sum=a+b;
		System.out.println("sum="+sum);
	}
	public void sum(int a,int b,int d)
	{
		int sum=0;
		sum=a+b+d;
		System.out.println("sum="+sum);
	}
	public void sum(int a,int b,float c)
	{
		int sum=0;
		sum=(int) (a+b+c);
		System.out.println("sum="+sum);
	}
	
}

public class Polymoriphm {

	public static void main(String[] args) {
		
		A1 a=new A1();
		a.sum(12, 10);
		a.sum(13, 30, 10);
		a.sum(13,23,13.40f);
		
	}
}
