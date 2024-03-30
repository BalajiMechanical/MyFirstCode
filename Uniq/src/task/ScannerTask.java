package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTask extends Exception {

	static void getinf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		System.out.println("Enter Your Email");
		String email = sc.nextLine();
		System.out.println("Enter Your Mobile Number");
		long mob = sc.nextLong();

	}

	public static void main(String[] args) {
		try {
			getinf();
		} catch (InputMismatchException e) {
			System.out.println("Incorrect Input");
			getinf();
		} catch (Exception e) {
			System.out.println("Incorrect Input");
			getinf();
		}
	}

}
