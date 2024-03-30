package collection;

import java.util.ArrayList;

public class FindMaxMinArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(34);
		a.add(45);
		a.add(67);
		a.add(89);
		a.add(65);
		
		int min = a.get(0);
		int max = a.get(0);

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) < min) {
				min = a.get(i);
			}
		}
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > max) {
				max = a.get(i);
			}
		}
		System.out.println("Maximum number is : " + max);
		System.out.println("Minimum number is : " + min);

	}
}
