package core_java_Rays_opp;

public class TestAccount {
public static void main(String[] args) {
	Account1 sd=new Account1();
	sd.setNumber("9174586524");
	sd.setAccountType("saving");
	sd.setBalance(5000);
	System.out.println("Account number = "+sd.getNumber());
	System.out.println("AccountType = "+sd.getAccountType());
	System.out.println("Balance = "+sd.getBalance());
System.out.println();
	sd.deposit(500);
	sd.withdrawal(1000);
	sd.fundtransfer(50);
	sd.paybill(100);
	System.out.println("remaning balance="+sd.getBalance());
}
}
