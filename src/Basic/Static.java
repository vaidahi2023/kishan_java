package Basic;

public class Static {

	static int count=0;
	void addcount()
	{
		count++; //1
	}
	static void print()
	{
		System.out.println("count="+count);
	}
	static
	{
		System.out.println("static block");
	}
	public static void main(String[] args) {
		
		Static s=new Static();
		s.addcount();
		System.out.println(s.count);
		Static s1=new Static();
		s1.addcount();
		System.out.println(s.count);
		print();
	}
}