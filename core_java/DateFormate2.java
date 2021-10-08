package core_java;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormate2 {
public static void main(String[] args) throws ParseException {
	Date d=new Date();
	SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy"+"hh:mm:ss");
	String A=format.format(d);
	System.out.println(A);
	Date d1=format.parse(A);
	System.out.println(d1);
}
}
