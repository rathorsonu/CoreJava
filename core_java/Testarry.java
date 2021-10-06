package core_java;

public class Testarry {
public static void main(String[] args) {
	int[] table=new int[10];
	int tablelength=table.length;
	table[0]=2;
	table[1]=4;
	table[2]=6;
	table[3]=8;
	table[4]=10;
	table[5]=12;
	table[6]=14;
	for(int a:table)
	System.out.println(a);
	System.out.println("table length is :" +tablelength);
}
}
