package core_java_Rays_opp;

public class Account1 {
private String number;
private String accountType;
private double balance;

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void deposit(double d) {
	balance=balance+d;
	System.out.println("deposit Ammount is: +"+d);
}
public void withdrawal(double w) {
	balance=balance-w;
	System.out.println("withdrawal:--"+(-w));
}
public void fundtransfer(double f) {
	balance=balance-f;
	System.out.println("Fundtransfer:--"+(-f));
}
public void paybill(double p) {
	balance=balance-p;
	System.out.println("paybill:--"+(-p));
}
}
