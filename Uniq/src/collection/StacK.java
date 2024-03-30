package collection;

import java.util.Stack;

public class StacK {

	public static void main(String[] args) {

		Stack<String> s = new Stack<>();
		s.push("hii");
		s.push("hello");
		s.push("hey");
		s.push("you");
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search("hii"));
		System.out.println(s);
		
	}

}
