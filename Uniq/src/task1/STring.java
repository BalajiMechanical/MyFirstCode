package task1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class STring {

	public static void main(String[] args) {
		String value = "/Name=\"Balaji\"/Company=\"Hikma Infotech\"/Experience=\"2 Years\"";

		Scanner sc = new Scanner(System.in);
//
//		StringTokenizer st = new StringTokenizer(value, "\"");
//		String one = st.nextToken();
//		String two = st.nextToken();
//		String three = st.nextToken();
//		String four = st.nextToken();
//		String five = st.nextToken();
//		String six = st.nextToken();
//		
//		while (true) {
//			System.out.println("Enter The Details");
//			String n = sc.next();
//			if (n.equals("Name")) {
//				System.out.println(two);
//			} else if (n.equals("Company")) {
//				System.out.println(four);
//			} else if (n.equals("Experience")) {
//				System.out.println(six);
//			}
//		}

		String[] res = value.split("\"");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter Details...");
			String n = sc.next();

			for (int j = 1; j < res.length; j++) {

				if (n.equals("Name")) {
					System.out.println(res[1]);
					break;
				} else if (n.equals("Company")) {
					System.out.println(res[3]);
					break;
				} else if (n.equals("Experience")) {
					System.out.println(res[5]);
					break;
				}

			}
		}
	}

}
