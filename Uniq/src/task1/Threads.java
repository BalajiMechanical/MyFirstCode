package task1;

class Sharedclass {
	
	// Synchronized - Thread Safe , Slow Process,
	

	public static synchronized void sharedMethod() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class ThreadClass1 extends Thread {

//	Sharedclass inst;
//
//	public ThreadClass1(Sharedclass inst) {
//		this.inst = inst;
//	}

	
	@Override
	public void run() {
		Sharedclass.sharedMethod();

	}
}

class ThreadClass2 extends Thread {

//	Sharedclass inst;
//
//	public ThreadClass2(Sharedclass inst) {
//		this.inst = inst;
//	}

	@Override
	public void run() {
		Sharedclass.sharedMethod();
	}
}

public class Threads {

	public static void main(String[] args) {

		// Sharedclass s1 = new Sharedclass();

		ThreadClass1 t1 = new ThreadClass1();
		ThreadClass1 t2 = new ThreadClass1();

		ThreadClass2 t3 = new ThreadClass2();
		ThreadClass2 t4 = new ThreadClass2();

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
