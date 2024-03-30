package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(20);
		ll.add(40);
		ll.add(60);
		ll.addFirst(10);
		ll.addLast(70);

		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
//		for(int i=0;i<ll.size();i++)
//		{
//			System.out.println(ll.get(i));
//		}
//		for(int a:ll)
//		{
//			System.out.println(a);
//		}

//		Iterator i=ll.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		ListIterator i2 = ll.listIterator();
		while (i2.hasNext()) {
			i2.next();
		}
		while (i2.hasPrevious()) {
			System.out.println(i2.previous());
		}

	}

}
