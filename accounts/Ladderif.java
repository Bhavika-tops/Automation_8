package tops.accounts;

import java.util.Scanner;

public class Ladderif {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rno,s1,s2,s3,total;
	String sname;
	float per;
	System.out.println("rno:");
	rno=sc.nextInt();
	System.out.println("s1:");
	s1=sc.nextInt();
	System.out.println("s2:");
	s2=sc.nextInt();
	System.out.println("s3:");
	s3=sc.nextInt();
	System.out.println("sname:");
	sname=sc.next();
	total=s1+s2+s3;
	per=total/3;
	System.out.println("ROll no :"+rno);
	System.out.println("Student Name :"+sname);
	System.out.println("Total marks :"+total);
	System.out.println("Per :"+per);
	if(per>=70)
	{
		System.out.println("Distiction");
	}
	else if(per>=60)
	{
		System.out.println("first class");
	}
	else if(per>=50) 
	{
		System.out.println("second class");
	
	}
	else if(per>=35)
	{
		System.out.println("pass");
	}
	else
	{System.out.println("fail");
}
}
}