package core_java_Io;

import java.io.File;

public class Subdirectories {
public static void main(String[] args) {
	File di =new File("D:");
	String [] list =di.list();
	for (int i = 0; i < list.length; i++) {
		System.out.println(list[i]);
	}
}
}
