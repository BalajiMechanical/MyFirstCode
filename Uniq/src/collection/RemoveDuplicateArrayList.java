package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(23);
		a.add(23);
		a.add("Balaji");
		a.add("Bharath");
		a.add("Balaji");
		a.add(45);
		a.add('e');
		System.out.println(a);

		Set b = new LinkedHashSet<>(a);
		System.out.println("After Removing Duplicate : " + b);

	}

}
