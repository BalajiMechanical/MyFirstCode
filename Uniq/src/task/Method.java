package task;

public class Method {

	int meth(int a, int b) {
		if (a < b)
			return meth(b, a);
		else if (b != 0)
			return (a * meth(a, b - 1));
		else
			return 0;
	}

	int method(int d) {
		d *= d;
		return methodOne(d);
	}

	int methodOne(int a) {
		a /= 11;
		return methodTwo(a);
	}

	int methodTwo(int c) {
		c += c;
		return methodThree(c);
	}

	int methodThree(int d) {
		d -= d;
		return methodFour(d);
	}

	int methodFour(int e) {
		e += 11;
		return e;
	}

	public static void main(String[] args) {
		Method obj = new Method();
		System.out.println(obj.meth(3, 3));
		System.out.println(obj.method(11));
	}
}