package task;

import java.util.ArrayList;

public class ArrayCubeTask {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(8);
		System.out.println(al);
		for (int i : al) {
			int q = i<<4;
			System.out.println();
			{
				if (q>50) {
					System.out.println(q + "" + "is > 50");
				} else {
					 System.out.println(q + "is < 50");
				}
			}
		}

	}
}
