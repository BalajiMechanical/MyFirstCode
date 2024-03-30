package task1;

public class Sample extends Thread {

	public void run() {
		try {
			Thread.sleep(5000);
			for (int i = 1; i <= 5; i++) {

				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Sample sam = new Sample();
		Sample sam1 = new Sample();
		Sample sam2 = new Sample();
		Sample sam3 = new Sample();

//		sam.start();
//		sam1.start();
//		sam2.start();
//		sam3.start();

		sam.run();
		sam1.run();
		sam2.run();
		sam3.run();
	}

}
