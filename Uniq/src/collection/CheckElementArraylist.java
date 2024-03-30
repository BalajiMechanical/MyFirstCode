package collection;

import java.util.ArrayList;
import java.util.List;

public class CheckElementArraylist {

	public static void main(String[] args) {
		  List a = new ArrayList();
	      a.add("Balaji");
	      a.add("Bharath");
	      a.add(23);
	      a.add(34);
	      a.add(56);
	      System.out.println("The element C is available in ArrayList " + a.contains("Balaji"));
	      System.out.println("The element Z is available in ArrayList " + a.contains(87));
	}

}
