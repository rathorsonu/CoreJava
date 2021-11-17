package core_java_Io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PrimitiveDataWrite {
public static void main(String[] args) throws Exception {
	FileOutputStream file =new FileOutputStream("D:/primitivedata.dat");
	DataOutputStream out = new DataOutputStream(file);
	out.writeInt(5);
	out .writeBoolean(true);
	out.writeDouble(5.5);
	out.writeChar('g');
	out.close();
	file.close();
	System.out.println("primitive data is successfully Store");
}
}
