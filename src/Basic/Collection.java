package Basic;

import java.util.ArrayList;
import java.util.Collections;

/*
 * collection is framework is used to provide set of interface and classes 
 * 
 *  list,queue,set,hash
 *  list -- arraylist,linkedlist
 *  
 */
public class Collection {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(23);
		a1.add(34);
	
//		a1.add(1, 56);
//		System.out.println(a1);
//		ArrayList<Integer> a2=new ArrayList<Integer>();
//		a2.addAll(a1);
//		a2.addAll(2,a1);
//		System.out.println(a2);
//		a1.remove(0);
//		System.out.println(a1);
////		a1.clear();
////		System.out.println(a1);
//		System.out.println(a1.get(0));
//		System.out.println(a1.set(0, 23));
		System.out.println(a1);
		a1.add(1,37);
		a1.set(1,78);
		System.out.println(a1);
		//System.out.println(a1[1]);
		
		System.out.println(a1.get(0));
		
//		for(int i=0;i<a1.size();i++)
//		{
//			System.out.println(a1.get(i));
//		}
		
		for(int i:a1)
		{
			System.out.println(i);
		}
		System.out.println(a1.contains(12));
		Collections.sort(a1);
		System.out.println(a1);
	}
	
	
}
