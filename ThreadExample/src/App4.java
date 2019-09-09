class Account {
	private static double balance;

	public static synchronized void deposit() {
		balance = balance + 5;
	}

	public static synchronized void withdraw() {
		balance = balance - 1;
	}

	public static double getBalance() {
		return balance;
	}
}

public class App4 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					Account.deposit();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					Account.withdraw();
				}
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Account.getBalance());
	}
}