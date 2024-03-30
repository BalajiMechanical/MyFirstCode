package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SufflingArrayList1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add("Ba");
		a.add("Bal");
		a.add("Balaji");
		a.add("Bharath");
		a.add("Muthu");
		a.add("Ram");

		System.out.println("Before Suffiling ArrayList : ");
		Iterator itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();

		Collections.shuffle(a);
		System.out.println("After Suffiling ArrayList : ");
		itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
