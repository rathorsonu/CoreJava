package core_java_Io;


import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteFile {
public static void main(String[] args) throws Exception {
	FileWriter w= new FileWriter("D:");
	PrintWriter sd= new PrintWriter(w);
	for (int i = 0; i < 5; i++) {
		sd.println(i+"line");
		
	}
	sd.close();
	w.close();
	System.out.println("File is succesfully written,pl check D:/Hello,txt");
}
}
