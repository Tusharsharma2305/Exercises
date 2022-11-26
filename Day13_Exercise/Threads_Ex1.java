//WA quiz program with only one question. Give 10 sec to answer the question. (T/F Question)
//Result should be displayed only after 10 secs.


package Exercise;

public class Threads_Ex1 implements Runnable {
	static int marks=0;
	
	public void run() {
			try {
				Thread.sleep(10000); 
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("\n\nThe marks is: "+ marks);
			System.exit(0);
		
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Crow is Black [True or Flase] \nAnswer:");

		Thread t1 = new Thread(new Threads_Ex1()); 
		t1.start();
		String ans=new java.util.Scanner(System.in).nextLine();
		if (ans.equalsIgnoreCase("true") || ans.equalsIgnoreCase("t") )
			marks = 10;

	}
}
