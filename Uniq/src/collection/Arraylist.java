package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(5);
		a.add(null);
//a.add(0, 7);
// a.set(0, 9);

		System.out.println(a);

		System.out.println();
		// Printing Line By Line

//		Iterator<Integer> itr = a.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
		

// ArrayList al=new ArrayList<>();
// al.add("Hi");
// al.add(null);
// al.add(344);
// al.add('r');
// al.addAll(a);
// System.out.println(al.get(0));
// System.out.println(al.retainAll(a));
// 
	}

}
