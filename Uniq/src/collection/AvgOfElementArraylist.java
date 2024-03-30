package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AvgOfElementArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList();
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			Integer input = in.nextInt();
			numbers.add(input);
		}
		in.close();

		Integer sum = 0;
		for (Integer element : numbers) {
			sum += element;
		}
		System.out.println(sum / numbers.size());
	}

}
