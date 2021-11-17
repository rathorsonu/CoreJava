package core_java_Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;


public class TestEmployee1 {


public static void main(String[] args) throws Exception  {
	FileInputStream file1=new FileInputStream("D:/object.ser");
	ObjectInputStream in = new ObjectInputStream(file1);

	Employee sd=(Employee)in.readObject();
	System.out.println("ID-->"+sd.getId());
	System.out.println("FName-->"+sd.getFname());
	System.out.println("LName-->"+sd.getLname());
	System.out.println("Pass-->"+sd.getPwd());

}
}
