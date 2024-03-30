package collection;

import java.util.ArrayList;

public class SumOfArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(34);
		a.add(45);
		a.add(57);
		a.add(98);
		System.out.println(a);
		
		int sum = 0;
		
		for (int b : a) {
			sum += b;
		}
		System.out.println(sum);
	}

}
