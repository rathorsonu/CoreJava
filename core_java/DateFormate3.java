package core_java;

import java.time.LocalDate;
import java.time.Period;

public class DateFormate3 {
public static void main(String[] args) {
	
	LocalDate a  =LocalDate.of(1997, 12,8);
	LocalDate now=	LocalDate.now();
	Period sk=Period.between(a, now);
	System.out.println(sk.getYears()+"-year"+sk.getMonths()+"-month"+sk.getDays()+"-days");
	System.out.println("Age"+sk.getYears()+"year");
	//System.out.println(sk.getDays());
}
}
