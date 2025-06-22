package Basic;

import java.util.Scanner;

/*
 * coniditional statemnet
 * 
 * if 
 * if else 
 * if else ladder
 * nested if else
 * switch
 * 
 *  if(condition)
 *  {
 *  	//
 *  }
 */

public class ifelse {

	
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is maximum number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is maximumn number");
		}
		else 
		{
			System.out.println(c+" is maximum number");
		}
	}
}

// positive,negative 
//number is odd or even
