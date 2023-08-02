package tops.accounts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee
 {
	 int rno;
	 String sname;
	 double per;
	 //constructor
	public Employee(int rno, String sname, double per) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
         
	public String toString() {
	
		return "Roll No : "+rno+"\nstudent Name : "+sname+"\npercentage :"+per;
	}
	 
	 
	 
 }


public class Serialization1 {
	
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Employee em=new Employee(1,"pooja", 89);
	FileOutputStream fos=new FileOutputStream("ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(em);
	oos.flush();
	oos.close();
	System.out.println("Object written successfully");
	
	
	FileInputStream fis= new FileInputStream("ser");
	ObjectInputStream ois= new ObjectInputStream(fis);
	Employee em1=(Employee)ois.readObject();
	
	oos.close();
	System.out.println(em1);
			
}
}
















