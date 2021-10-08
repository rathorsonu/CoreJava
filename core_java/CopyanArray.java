package core_java;

public class CopyanArray {
public static void main(String[] args) {
	char[]copyFrom= {'a','b','c','f','h','t','g','f','k','l','m','n','o',};
	char[]copyto=new char[8];
	System.arraycopy(copyFrom,4 , copyto,0,8);
	System.out.println(copyto);
	//for(int d1:copyto) {
		//System.out.println((char)d1);
		for (int i = 0; i < copyto.length; i++) {
			char c = copyto[i];
			System.out.println(c);
			
		}
	}
		
}

