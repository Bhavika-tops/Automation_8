package tops.accounts;

import java.util.Scanner;

public class Ladderif1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int rno,s1,s2,s3,total;
	String sname;
	float per;
	System.out.println("Enter Rno:");
	rno=sc.nextInt();
	System.out.println("Enter s1:");
	s1=sc.nextInt();

	System.out.print("Enter s2:");
	s2=sc.nextInt();
	System.out.print("Enter s3:");
	s3=sc.nextInt();
	System.out.print("Enter sname");
	sname=sc.next();
	
	total=s1+s2+s3;
	per=total/3;
	System.out.print("Roll no :"+rno);	
	System.out.println("Student name:"+sname);
	System.out.println("Total:"+total);
	System.out.println("Percentage:"+per);
	
	if(per>=70)
	{
		System.out.print("Distiction");
	}
	else if(per>=60)
	{System.out.println("First class");
	}
	else if(per>=50)
	{
		System.out.println("second class");
	}
	else if(per>=40)
	{
	System.out.println("Pass");
	
	}else {
		System.out.println("Fail");
		
	}
}
}
