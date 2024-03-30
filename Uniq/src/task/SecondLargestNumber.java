package task;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] numbers = { 10, 5, 20, 8, 15 }; // Example array of numbers
		int secondLargest = findSecondLargest(numbers);
		System.out.println("Second largest number: " + secondLargest);
	}

	static int findSecondLargest(int[] numbers) {
		if (numbers.length < 2) {
			System.out.println("Array must have at least two elements");
			return -1;
		}

		// Convert array to stream, sort it in descending order, and skip the first
		// element
		int secondLargest = Arrays.stream(numbers).boxed() // Convert int to Integer to use Comparator.reverseOrder()
				.sorted(java.util.Collections.reverseOrder()).skip(1).findFirst().orElse(-1);

		return secondLargest;
	}
}
