package Basic;

//constructor is called when object is created.
//constructer name will be same of class name
//types of constructor 
//default constructer 
//copy constructer
//pamertized constructer
public class Constructor {

	private int id;
	private String email;
	private String name;
	Constructor()
	{
		System.out.println("default constructor");
	}
	Constructor(int id,String email)
	{
		this.id=id;
		this.email=email;
		System.out.println("pameterized constructor called............");
	}
	
	Constructor(int id,String email,String name)
	{
		this.id=id;
		this.email=email;
		System.out.println("pameterized constructor2 called............");
	}
	public static void main(String[] args) {
		
		Constructor c=new Constructor();
		Constructor c1=new Constructor(1,"riya");
		Constructor c2=new Constructor(2,"smit","ab");
		
	}
	
}
