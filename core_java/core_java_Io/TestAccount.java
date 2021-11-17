package core_java_Io;



public class TestAccount extends Thread {
public  static ACCOUNT data=new ACCOUNT();
 String name;
public TestAccount(String name) {
	this.name=name;
}
public void run () {
	for (int i = 0; i <5; i++) {
		data.deposit(name, 1000);
		
	}
	
}

}
