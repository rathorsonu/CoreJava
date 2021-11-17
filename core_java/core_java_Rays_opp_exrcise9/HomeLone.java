package core_java_Rays_opp_exrcise9;



public class HomeLone extends Bank {
public static void main(String[] args) {
	Bank[] banks=new Bank[3];
	banks[0]= new AxisBank();
	banks[1]=new HDFCBank();
	banks[2]=new ICICIBank();
	lonEnquiry(banks);
}
	public static void lonEnquiry(Bank[]banks) {
		 for (Bank b : banks) {
		String name=b.getName();
		double Rate=b.interestRate();
			 System.out.println(name+"="+Rate);
		}
	 }
}

