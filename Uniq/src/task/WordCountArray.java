package task;

import java.util.HashMap;

public class WordCountArray {

	public static void main(String[] args) {
		String a[] = { "apple", "banana", "apple", "orange", "banana", "apple" };
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		for (String word : a) {
			if (wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}

		for (String words : wordCountMap.keySet()) {
			System.out.println(words + " : " + wordCountMap.get(words));
		}
	}

}
