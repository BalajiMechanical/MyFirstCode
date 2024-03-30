package task;

public class StringProgram {

	public static void main(String[] args) {
		String s = "program";
		String alternateCaseString = alternateCase(s);
		System.out.println(alternateCaseString);
	}

	public static String alternateCase(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i % 2 == 0) {
				chars[i] = Character.toUpperCase(chars[i]);
			} else {
				chars[i] = Character.toLowerCase(chars[i]);
			}
		}
		return new String(chars);
	}

}
