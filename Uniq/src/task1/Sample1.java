package task1;

public class Sample1 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(4000);
			for (int i = 1; i <= 5; i++) {

				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		Sample1 sam = new Sample1();
		Thread th = new Thread(sam);
		Thread th1 = new Thread(sam);
		Thread th2 = new Thread(sam);
		Thread th3 = new Thread(sam);

//		th.start();
//		th1.start();
//		th2.start();
//		th3.start();

		th.run();
		th1.run();
		th2.run();
		th3.run();

	}
}
