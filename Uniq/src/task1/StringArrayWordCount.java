package task1;

import java.util.HashMap;

public class StringArrayWordCount {

	public static void show() {
		int i;

		String word[] = { "Bharath", "Balaji", "uniq", "Bharath", "Balaji", "uniq", "sql", "java" };
		for (i = 0; i < word.length; i++) {
			String str = word[i];
			boolean ap = true;
			for (int j = 0; j < i; j++) {
				if (str == word[j]) {
					ap = false;
					break;
				}
			}
			if (ap) {
				int tr = 0;
				for (int j = 0; j < word.length; j++) {
					if (str.equals(word[j])) {
						tr++;

					}
				}
				System.out.println(word[i] + " : " + tr);
			}
		}
	}

	public static void main(String[] args) {
		StringArrayWordCount.show();

	}
}
