package Basic;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListE {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(20);
		l1.addFirst(10);
		l1.addLast(30);
		System.out.println(l1);
		LinkedList<Integer> l2=new LinkedList<Integer>();
//		l2.addAll(l1);
//		System.out.println(l2);
//		l1.removeFirst();
//		l1.removeLast();
//		System.out.println(l1);
//		System.out.println(l1.contains(12));
//		l1.clear();
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.set(0, 23));
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		Collections.sort(l1);
		System.out.println(l1);
	}
	
	

}