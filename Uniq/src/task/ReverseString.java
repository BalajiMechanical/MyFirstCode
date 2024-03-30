package task;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Balaji Mech";
		String Reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			Reverse = Reverse + str.charAt(i);
		}
		System.out.println("Original String : " + "" + str);
		System.out.println("Reverse String : " + "" + Reverse);
	}

}
