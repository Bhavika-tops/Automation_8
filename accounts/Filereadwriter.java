package tops.accounts;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereadwriter {
	
public static void main(String[] args) throws IOException {
	FileWriter fw =new FileWriter("tops11.text");
	fw.write("This is file writer/reader demo using java");
	fw.flush();
	fw.close();
	System.out.println("File written successfully");
	
	FileReader fr =new FileReader("tops11.text");
	int i;
	while((i=fr.read())!=-1) {
		System.out.print((char)i);
	}
	fr.close();
}
}
