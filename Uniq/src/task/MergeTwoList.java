package task;

import java.util.ArrayList;

public class MergeTwoList {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(23);
		a.add(45);
		a.add(56);
		a.add(78);
		a.add(67);

		ArrayList b = new ArrayList<>();
		b.add(12);
		b.add(79);
		b.add(24);
		b.addAll(a);
		System.out.println(b);
	}
}
