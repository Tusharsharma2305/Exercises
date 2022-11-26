package Exercise;

class ChatReal {
	boolean flag = false;
	java.util.Scanner sc = new java.util.Scanner(System.in);
	String s;

	public synchronized void Question(String msg) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(msg);
		s = sc.nextLine();

		// System.out.println(s);
		if (s.equals("bye") || s.equals("Bye")) {

			System.out.println("Bye Bye!!");
			System.exit(0);
		}
		flag = true;
		notify();
	}

	public synchronized void Answer(String msg) {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(msg);
		s = sc.nextLine();

		// System.out.println(s);
		if (s.equals("bye") || s.equals("Bye")) {

			System.out.println("Bye Bye!!");
			System.exit(0);
		}
		flag = false;
		notify();
	}
}

class T3 implements Runnable {
	ChatReal m;

	public T3(ChatReal m1) {
		this.m = m1;
		new Thread(this).start();
	}

	public void run() {

		while (true)
			m.Question("Person 1: ");
	}
}

class T4 implements Runnable {
	ChatReal m;

	public T4(ChatReal m2) {
		this.m = m2;
		new Thread(this).start();
	}

	public void run() {

		while (true)

			m.Answer("Person 2: ");
	}
}

public class TestThread_Exercise2 {
	public static void main(String[] args) {
		ChatReal m = new ChatReal();
		new T3(m);
		new T4(m);
	}
}
