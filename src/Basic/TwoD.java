package Basic;

import java.util.Scanner;

/*
 *  
 *  
 */


public class TwoD {

	public static void main(String[] args) {
	
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum=0;	
				for(int k=0;k<3;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}
	}
}
