package core_java_Io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DisplayFileReader {
public static void main(String[] args) throws Exception {
	FileReader reader=new FileReader("D:/Hello.txt"); 
	 int ch =reader.read();
	 char chr;
	 while (ch!=-1) {
		 chr=(char) ch;
		 System.out.println(chr);
		 ch =reader.read();
	}
}
}
