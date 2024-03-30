package task;

public class SwapVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c;

		// Without Using Third Variable
		a = a * b;
		b = a / b;
		a = a / b;

		// With Using Third Variable
//		c = a;
//		a = b;
//		b = c;

		System.out.println("A Value is " + a);
		System.out.println("B Value is " + b);
	}

}
