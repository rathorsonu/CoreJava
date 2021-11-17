package core_java_Io;

import java.io.File;
import java.util.Date;

public class Atrribute {
public static void main(String[] args) {
	File file =new File("D:/Hello.txt");
	if(file.exists()) {
		
		System.out.println("Name-->"+file.getName());
		System.out.println("Absolute path-->"+file.getAbsolutePath());
		System.out.println("Is writable-->"+file.canWrite());
		System.out.println("Is file"+file.isFile());
		System.out.println("Is readable-->"+file.canRead());
		System.out.println("Is directory-->"+file.isDirectory());
        System.out.println("Last modified at"+new Date(file.lastModified()));
        System.out.println("length "+file.length());
	}
}
}
