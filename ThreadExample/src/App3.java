public class App3 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getId() + " Value " + i);
					try {
						Thread.sleep(1000);
					} catch (Exception E) {
					}
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getId() + " Value " + i);
					try {
						Thread.sleep(1000);
					} catch (Exception E) {
					}
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}
}