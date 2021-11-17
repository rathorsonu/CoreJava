package core_java_Io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LinebyLine {
public static void main(String[] args) throws Exception {
	FileReader reader= new FileReader("D:/Hello.txt");
	BufferedReader br =new  BufferedReader(reader);
	 String line  =br.readLine();
	 while (line!=null) {
		 System.out.println(line);
		 line  =br.readLine();
		
	}
}
}
