package Basic;

import java.util.Scanner;

/*
 *  i=1;
 *  while(condition)
 *  {
 *  		//statement
 *  		//increment/decrement
 *  }
 *  
 *  6=1,2,3,6
 *  1+2+3=6
 *  perfect
 *  8=1,2,4,8
 *  1+2+4=7
 *  not perfect 
 */

public class While {

	
	public static void main(String[] args) {
		
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		
	}
}
