package core_java;

import java.util.Scanner;

public class Stringreverse  {
	private static String name;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String str=sc.next();
		
		String[]s1= name.split(" ");
		for (int i = 0; i<s1.length; i++) {
			String s2=s1[i];
	for (int j=s2.length()-1; j>=0; j--) {
	System.out.print(s2.charAt(j));
	System.out.print(" ");
	
		}
	
		}
		sc.close();
	}
}