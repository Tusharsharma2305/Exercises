// QUESTION 1

//Class Accounts: 
//BalanceCheck() -> prints the balance
//Withdrawal(int amt) -> balance – amt
//Deposit(int amt) -> balance + amt
//Accounts(int amt) -> balance=amt;
//
//Three threads for BalanceCheck, Withdrawal, Deposit:
//Threads1 :
//Threads1(Accounts a)
//Run() -> BalanceCheck
//Threads2 :
//Threads2(Accounts a)
//Run() -> Withdrawal
//Threads3 :
//Threads3(Accounts a)
//Run() -> Deposit
//
//Main:
//3 accounts:
//They randomly perform BalanceCheck, Withdrawal, Deposit in multithreaded environment.


package Exercise;
//class Accounts{
//	int balance;
//	String name;
//	public Accounts(int balance, String n) {
//		System.out.println("Accounts opened for : "+ n + " with balance : "+ balance);
//		this.balance = balance;
//		name=n;
//	}
//
//	public void balanceCheck() {
//		System.out.println("The balance in "+ name + " account is:"+balance);
//	}
//	public void withDrawal(int amt) {
//		 if (amt > balance) 
//			 System.out.println("current balance is less than requested amount");
//		 else {
//			 balance = balance - amt;
//			 System.out.print("The balance in "+ name);
//			 for(int i=0;i<100000000;i++);
//			 System.out.println(name + " account after withdrawal of "+amt + " is: "+balance);
//		 }
//	}
//	public void deposit(int amt) {
//		balance = balance + amt;
//		System.out.println("The balance in "+ name);
//		for(int i=0;i<100000000;i++);
//		 System.out.println(name + " account after deposit of "+amt + "  is: "+balance);
//	}
//}
//class BalanceCheck implements Runnable{
//	Accounts a;
//	public BalanceCheck(Accounts a) {
//		this.a = a;
//	}
//	public BalanceCheck() {	}
//	public void run() {
//		a.balanceCheck();
//	}
//	
//}
//class Withdraw implements Runnable{
//	Accounts a;
//	int amt;
//	public Withdraw(Accounts a, int at) {
//		this.a = a;
//		amt=at;
//	}
//	public Withdraw() {	}
//	public void run() {
//		a.withDrawal(amt);
//	}
//}
//class Deposit implements Runnable{
//	Accounts a;
//	int amt;
//	public Deposit(Accounts a, int at) {
//		this.a = a;
//		amt=at;
//	}
//	public Deposit() {	}
//	public void run() {
//		a.deposit(amt);
//	}
//}
//
//
//public class SynEg_Exercise1 {
//
//	public static void main(String[] args) {
//		Accounts a1=new Accounts(10000,"N1");
//		Accounts a2=new Accounts(15000,"N2");
//		Accounts a3=new Accounts(21000,"N3");
//		
//		Thread b1=new Thread(new BalanceCheck(a1));
//		Thread b2=new Thread(new BalanceCheck(a2));
//		Thread b3=new Thread(new BalanceCheck(a3));
//		
//		Thread w1=new Thread(new Withdraw(a1, 5000));
//		Thread w2=new Thread(new Withdraw(a2, 10000));
//		Thread w3=new Thread(new Withdraw(a3, 2000));
//		
//		Thread d1=new Thread(new Deposit(a1, 25000));
//		Thread d2=new Thread(new Deposit(a2, 20000));
//		Thread d3=new Thread(new Deposit(a3, 15000));
//		
//		b1.start();
////		b2.start();
////		b3.start();
//		w1.start();
////		w2.start();
////		w3.start();
//		d1.start();
////		d2.start();
////		d3.start();
//
//	}
//
//}

// ------------------with sync---------------------

//class Accounts{
//	int balance;
//	String name;
//	public Accounts(int balance, String n) {
//		System.out.println("Accounts opened for : "+ n + " with balance : "+ balance);
//		this.balance = balance;
//		name=n;
//	}
//
//	public synchronized void balanceCheck() {
//		System.out.println("The balance in "+ name + " account is:"+balance);
//	}
//	public synchronized void withDrawal(int amt) {
//		 if (amt > balance) 
//			 System.out.println("current balance is less than requested amount");
//		 else {
//			 balance = balance - amt;
//			 System.out.print("The balance in "+ name);
//			 for(int i=0;i<100000000;i++);
//			 System.out.println(name + " account after withdrawal of "+amt + " is: "+balance);
//		 }
//	}
//	public synchronized void deposit(int amt) {
//		balance = balance + amt;
//		System.out.println("The balance in "+ name);
//		for(int i=0;i<100000000;i++);
//		 System.out.println(name + " account after deposit of "+amt + "  is: "+balance);
//	}
//}
//class BalanceCheck implements Runnable{
//	Accounts a;
//	public BalanceCheck(Accounts a) {
//		this.a = a;
//	}
//	public BalanceCheck() {	}
//	public void run() {
//		a.balanceCheck();
//	}
//	
//}
//class Withdraw implements Runnable{
//	Accounts a;
//	int amt;
//	public Withdraw(Accounts a, int at) {
//		this.a = a;
//		amt=at;
//	}
//	public Withdraw() {	}
//	public void run() {
//		a.withDrawal(amt);
//	}
//}
//class Deposit implements Runnable{
//	Accounts a;
//	int amt;
//	public Deposit(Accounts a, int at) {
//		this.a = a;
//		amt=at;
//	}
//	public Deposit() {	}
//	public void run() {
//		a.deposit(amt);
//	}
//}
//
//
//public class SynEg_Exercise1 {
//
//	public static void main(String[] args) {
//		Accounts a1=new Accounts(10000,"N1");
//		Accounts a2=new Accounts(15000,"N2");
//		Accounts a3=new Accounts(21000,"N3");
//		
//		Thread b1=new Thread(new BalanceCheck(a1));
//		Thread b2=new Thread(new BalanceCheck(a2));
//		Thread b3=new Thread(new BalanceCheck(a3));
//		
//		Thread w1=new Thread(new Withdraw(a1, 5000));
//		Thread w2=new Thread(new Withdraw(a2, 10000));
//		Thread w3=new Thread(new Withdraw(a3, 2000));
//		
//		Thread d1=new Thread(new Deposit(a1, 25000));
//		Thread d2=new Thread(new Deposit(a2, 20000));
//		Thread d3=new Thread(new Deposit(a3, 15000));
//		
//		b1.start();
////		b2.start();
////		b3.start();
//		w1.start();
////		w2.start();
////		w3.start();
//		d1.start();
////		d2.start();
////		d3.start();
//
//	}
//
//}

class Accounts{
	int balance;
	String name;
	public Accounts(int balance, String n) {
		System.out.println("Accounts opened for : "+ n + " with balance : "+ balance);
		this.balance = balance;
		name=n;
	}

	public synchronized void balanceCheck() {
		System.out.println("The balance in "+ name + " account is:"+balance);
	}
	public synchronized void withDrawal(int amt) {
		 if (amt > balance) 
			 System.out.println("current balance is less than requested amount");
		 else {
			 balance = balance - amt;
			 System.out.print("The balance in "+ name);
			 for(int i=0;i<100000000;i++);
			 System.out.println(name + " account after withdrawal of "+amt + " is: "+balance);
		 }
	}
	public synchronized void deposit(int amt) {
		balance = balance + amt;
		System.out.print("The balance in "+ name);
		for(int i=0;i<100000000;i++);
		 System.out.println(name + " account after deposit of "+amt + "  is: "+balance);
	}
}
class BalanceCheck implements Runnable{
	Accounts a;
	public BalanceCheck(Accounts a) {
		this.a = a;
	}
	public BalanceCheck() {	}
	public void run() {
		a.balanceCheck();
	}
	
}
class Withdraw implements Runnable{
	Accounts a;
	int amt;
	public Withdraw(Accounts a, int at) {
		this.a = a;
		amt=at;
	}
	public Withdraw() {	}
	public void run() {
		a.withDrawal(amt);
	}
}
class Deposit implements Runnable{
	Accounts a;
	int amt;
	public Deposit(Accounts a, int at) {
		this.a = a;
		amt=at;
	}
	public Deposit() {	}
	public void run() {
		a.deposit(amt);
	}
}


public class SynEg_Exercise1 {

	public static void main(String[] args) {
		Accounts a1=new Accounts(10000,"N1");
		Accounts a2=new Accounts(15000,"N2");
		Accounts a3=new Accounts(21000,"N3");
		
		Thread b1=new Thread(new BalanceCheck(a1));
		Thread b2=new Thread(new BalanceCheck(a2));
		Thread b3=new Thread(new BalanceCheck(a3));
		
		Thread w1=new Thread(new Withdraw(a1, 5000));
		Thread w2=new Thread(new Withdraw(a2, 10000));
		Thread w3=new Thread(new Withdraw(a3, 2000));
		
		Thread d1=new Thread(new Deposit(a1, 25000));
		Thread d2=new Thread(new Deposit(a2, 20000));
		Thread d3=new Thread(new Deposit(a3, 15000));
		
		b1.start();
		b2.start();
		b3.start();
		w1.start();
		w2.start();
		w3.start();
		d1.start();
		d2.start();
		d3.start();

	}

}

