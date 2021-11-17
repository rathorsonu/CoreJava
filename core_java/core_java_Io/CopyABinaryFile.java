package core_java_Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyABinaryFile {
public static void main(String[] args) throws Exception {
	String source="D:/Sk.JPEG";
	String target ="D:/sonu.jpg";
	
	FileInputStream reader=new FileInputStream(source);
	FileOutputStream writer=new FileOutputStream(target);
	
	int ch= reader.read();
	while (ch!=-1) {
		writer.write(ch);;
		ch= reader.read();
		}
	reader.close();
	writer.close();
System.out.println(source+ "is copied to"+target);
	
}
}
