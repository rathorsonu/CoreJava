package core_java_Io;

import java.io.BufferedReader;
import java.io.FileWriter;

import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyconCommand {
public static void main(String[] args) throws Exception {
	String target="D:/Hello.txt";
	FileWriter writer=new FileWriter(target);
	PrintWriter pw=new PrintWriter(writer);
	
	System.out.println("Enter a name");
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader in =new BufferedReader(reader);
             String line =in.readLine();
             while (!line.equals("bye")) {
            	 pw.println(line);
            	 line =in.readLine(); 
		
			}
             reader.close();
             pw.close();
             System.out.println("done");
}
}
