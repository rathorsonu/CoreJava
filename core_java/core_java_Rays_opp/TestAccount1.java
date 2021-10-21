package core_java_Rays_opp;

public class TestAccount1 {
public static void main(String[] args) {
	AccountEncapuslation sd=new AccountEncapuslation ();
	sd.setAccout_no(31254685462l);
	sd.setAmmount(500000f);
	sd.setEmail("sunnysonurathor2016@gmail.com");
	sd.setname("sunny rathor");
	System.out.println("accountno "+sd.getAccount_no()+" Ammount "+sd.getAmmount()+" Email "+sd.getEmail()+"Name "+sd.getName());
	
}
}
