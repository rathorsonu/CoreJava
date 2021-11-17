package core_java_Io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Testprimitive {
public static void main(String[] args) throws Exception {
	FileInputStream file =new FileInputStream("D:/primitivedata.dat");
	DataInputStream in= new DataInputStream(file);
	
	System.out.println(in.readInt());
	System.out.println(in.readBoolean());
	System.out.println(in.readDouble());
	System.out.println(in.readChar());
}
}
