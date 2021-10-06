package core_java;

public class StringLength {
public static void main(String[] args) {
	String name="arti rathor";
	System.out.println("first positon in this String"+name.indexOf("r"	+ ""));
	System.out.println("last posion"+name.lastIndexOf("a"));
	System.out.println("a is replased by b"+name.replace("a", "b"));
	System.out.println("all is replaced by b"+name.replaceAll("a", "b"));
	System.out.println("lower case"+name.toLowerCase());
	System.out.println("upper case"+name.toUpperCase());
	System.out.println("start with arti"+name.startsWith("arti"));
	System.out.println("ends with"+name.endsWith("hor"));
	System.out.println("substring"+name.substring(5));
	System.out.println("trim "+name.trim());
	
}}
