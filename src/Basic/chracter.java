package Basic;

import java.util.Scanner;

// alphabet ,number,special chracter 
class chracter {

	public static void main(String[] args) {
		
		//String ch;
		char ch='a';
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character:");
	//ch=s.next();
//		ch=s.nextLine();
	//	System.out.println("string ="+ch);
		if((ch>='A' && ch<='Z') ||  (ch>='a' && ch<='z'))
		{
			System.out.println("it is alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("it is digit");
		}
		else 
		{
			System.out.println("it is special chracter");
		}
	
	
	}
	
}
