package task;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWord {

	public static void main(String[] args) {
		String input = "This is a test string with some duplicate words like test and string";

		Map<String, Long> Dup = Arrays.stream(input.split("\\s+"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Dup.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println("Duplicate Word is :" + entry.getKey()));

	}

}
