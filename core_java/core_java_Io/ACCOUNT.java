package core_java_Io;

public class ACCOUNT {
private int balance =0;
public synchronized void deposit(String message,int ammount) {
	int bal=getBalance();
	setBalance(bal+ammount);
	System.out.println(message +""+" now balance is-->"+getBalance());
}
public int getBalance() {
	try {
		Thread.sleep(500);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return balance;
}
public void setBalance(int balance) {
this.balance = balance;
}
}
