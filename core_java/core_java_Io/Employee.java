package core_java_Io;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String fname;
	private String lname;
	private  transient String pwd;
	//Creat default constructor
	public Employee() {
		
	}
public Employee( String fname,int id,String lname, String pwd) {
	this.fname=fname;
	this.id=id;
	this.lname=lname;
	this.pwd=pwd;
	
		
	}
public int getId() {
	return id;
}
public String getFname() {
	return fname;
}
public String getLname() {
	return lname;
}
public String getPwd() {
	return pwd;
}
	
	
}