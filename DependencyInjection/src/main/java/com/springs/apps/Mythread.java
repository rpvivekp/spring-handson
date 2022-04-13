package com.springs.apps;

public class Mythread extends Thread {

	public void run() {
		for (int x = 0; x <= 3; x++) {
			try {
				Thread.sleep(1 * 60 * 100);
				System.out.println("run by" + Thread.currentThread().getName() + x);
			} catch (InterruptedException e) {

			}

		}
	}

	public static void main(String[] args) {

		Mythread m1 = new Mythread();
		Mythread m2 = new Mythread();
		m1.setName("A");
		m1.setPriority(Thread.MAX_PRIORITY);
		m2.setName("B");
		m1.start();
		m2.start();

	}

}
