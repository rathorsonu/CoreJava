package core_java_Io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {
	public static void main(String[] args) throws Exception {
		FileOutputStream file=new FileOutputStream("D:/object.ser");
		ObjectOutputStream out =new ObjectOutputStream(file);
		
		Employee emp=new Employee("sonu", 2, "rathor", "12");
		out.writeObject(emp);
		out.close();
		System.out.println("Object succesfully creat ");
	}
}