package core_java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate2 {


public static void main(String[] args) {
	Date Today=new Date();
	SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
	String StrDate =format1.format(Today);
	System.out.println("Format#:"+StrDate);
	
}
}
