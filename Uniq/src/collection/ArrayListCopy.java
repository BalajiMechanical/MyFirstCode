package collection;

import java.util.ArrayList;

public class ArrayListCopy {

	public static void main(String[] args) {

		ArrayList a = new ArrayList<>();
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(8);
		a.add(9);
		System.out.println(a);

//		ArrayList b = new ArrayList<>(a);
//		System.out.println(b);

		ArrayList b = new ArrayList<>();
		b = (ArrayList) a.clone();
		System.out.println(b);
	}

}
