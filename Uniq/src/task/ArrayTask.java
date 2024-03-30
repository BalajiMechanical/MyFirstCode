package task;

public class ArrayTask {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 10, 0, 7, 8, 0, 3 };
		System.out.print("[");
		for (int num : arr) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
		}
		for (int num : arr) {
			if (num % 2 == 0 && num != 0) {
				System.out.print(num + " ");
			}
		}
		int count = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count = i;
			}
		}
		if (count != -1) {
			System.out.print(arr[count] + " ");
		}
		System.out.print("]");

	}

}
