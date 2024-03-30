package task;

import java.util.Arrays;

public class CheckTwoArrays {

	public static void main(String[] args) {
		int a[] = { 3, 5, 7, 9 };
		int b[] = { 5, 3, 7, 9 };
		Arrays.sort(a);
		
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));
	}

}
