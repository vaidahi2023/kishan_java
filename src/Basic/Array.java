package Basic;

import java.util.Scanner;

/*
 * array is the collection element having same datatype 
 * int a[];
 * 
 * 12 3 4 52 10 
 * 3 12 4 52 10
 * 3 4 12 52 10
 * 3 4 12 10 52
 * 3 4 10 12 52
 * 
 * a=b
 * b=c
 * c=a
 * 
 * 1 2 3 4 5
 * odd--1,3,5
 * even--2,4
 */

public class Array {

	public static void main(String[] args) {
		
//		int a[]= {1,2,3,4,5};
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		int size,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter te size of array:");
		size=s.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
//		for(int i=0;i<size;i++)
//		{
//			for(int j=i+1;j<size;j++)
//			{
//				if(a[i]>a[j])
//				{
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		
		for(int i=0;i<size;i++)
		{
			b[i]=a[i];
		}
		
		for(int k:a)
		{
			System.out.println(k);
		}
		System.out.println("copy array");
		for(int k:b)
		{
			System.out.println(k);
		}
		
	}
}
