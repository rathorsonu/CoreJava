package core_java;

import java.time.LocalDate;
import java.time.Period;

public class DateFormate3 {
public static void main(String[] args) {
	LocalDate i  = LocalDate.of(1997, 12, 8);
	LocalDate now=	LocalDate.now();
	Period diff=Period.between(i, now);
	System.out.println(diff.getYears()+"-year"+diff.getMonths()+"-month"+diff.getDays()+"-days");
	System.out.println("Age"+diff.getYears()+"year");
}
}
