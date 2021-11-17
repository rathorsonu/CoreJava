package core_java_Io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestSccaner {

public static void main(String[] args) throws Exception  {
	FileReader reader= new FileReader("D:/Hello.txt");
	System.out.println("enter the data ");
	 Scanner sc = new Scanner(reader);

	while (sc.hasNext()) {
		System.out.println(sc.nextLine());
		
	}
	reader.close();
	
}

}