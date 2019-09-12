public class JoinMethod1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i + "--" + Thread.currentThread().getName());
		}
	}

	public static void main(String args[]) throws InterruptedException {
		JoinMethod1 t1 = new JoinMethod1();
		JoinMethod1 t2 = new JoinMethod1();
		JoinMethod1 t3 = new JoinMethod1();
		t1.setPriority(MIN_PRIORITY);
		t1.start();
		//t1.sleep(900);
		/*try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}*/

		t2.start();
		t3.start();
	}
}
