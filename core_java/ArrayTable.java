package core_java;

public class ArrayTable {
public static void main(String[] args) {
	int a [][]=new int[10][20];
	for (int i = 0; i < a.length; i++) {
	for (int j = 2; j <= a[i].length; j++) {
		System.out.print((i+1)*j+ "\t");
	}	
	System.out.println(" ");
	}
	
}
}
