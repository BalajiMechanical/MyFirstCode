package task;

import java.util.Arrays;

public class FindSecondLargestArray {

	public static void main(String[] args) {
		int a[] = { 23, 45, 76, 98, 56 };
		int b = a.length;
		Arrays.sort(a);
		int c = a[b - 2];
		System.out.println("Second Largest Array is :" + c);

	}
}
