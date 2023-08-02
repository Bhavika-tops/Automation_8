package tops.accounts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

   class Student1 implements Serializable
{
    int rno;
    String sname;
    double per;
//constructor call
	public Student1(int rno,String sname,double per)
	{
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}      //to print in console
		public String toString() {
		return"Roll No :"+rno+"\nStudent Name : "+sname+"\npercentage :"+per;
		}

	}
    public class Serialization{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
	Student1 s1=new Student1(101, "jigar" ,70);
	
	//to write the object
	FileOutputStream fos=new FileOutputStream("ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(s1);
	oos.flush();
	oos.close();
	System.out.println("object written successfully");
	
	//to read the object
	FileInputStream fis=new FileInputStream("ser");
	ObjectInputStream ois =new ObjectInputStream(fis);
	Student1 s2 =(Student1)ois.readObject();
	ois.close();
	System.out.println(s2);
						
}
	

	
}


	