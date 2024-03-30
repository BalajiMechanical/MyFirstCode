package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestArraylist {

	public static void main(String[] args) {
		int temp = 0;
		// create object of ArrayList
		ArrayList<Integer> a = new ArrayList<Integer>();
		// add numbers in an ArrayList
		
		a.add(3);
		a.add(1);
		a.add(6);
		a.add(4);
		a.add(9);
		a.add(8);
		// sort numbers in an ArrayList
		Collections.sort(a);

		// return second highest number from sorted ArrayList
		temp = a.get(a.size() - 2);
		System.out.println("Second highest number");
		System.out.println(temp);
	}

}
