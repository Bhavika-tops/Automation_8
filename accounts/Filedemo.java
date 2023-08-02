package tops.accounts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filedemo {
	public static void main(String[] args) throws IOException {
		//to write
    FileOutputStream fos= new FileOutputStream("tops1.txt");
		String s="This is file output stream demo using java1";
		byte b[]=s.getBytes();  //int b to
		fos.write(b);  //to convert
		fos.flush();
		fos.close();
		System.out.println("file written succesfully");//in console
		//to read
		FileInputStream fis=new FileInputStream("tops1.txt");
		int i;                 //convert in int
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);//then char
		}
		fis.close();
		
	}

}
