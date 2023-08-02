package tops.accounts;

import java.util.Scanner;

public class Ladderif3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rno,s1,s2,s3,total;
		float per;
		String sname;
		System.out.print("Enter sname:");
		sname=sc.next();
		System.out.print("Enter rno:");
		rno=sc.nextInt();
		System.out.print("Enter s1:");
		s1=sc.nextInt();
		System.out.print("Enter s2:");
		s2=sc.nextInt();
		System.out.print("Enter s3:");
		s3=sc.nextInt();
	
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Student name:"+sname);
		System.out.println("Roll no:"+rno);
		System.out.println("Total:"+total);
		System.out.println("Percentage:"+per);
		
		if(per>=75)
		{
			System.out.println("Distinction");
	}
		if(per>=60)
		{
			System.out.println("First Class");
	}
		else if(per>50)
		{
			System.out.println("Second Class");
	}
		else if(per>=30)
		{
			System.out.println("Pass");
	}
		else
		{
			System.out.println("Fail");
		}
	}
	

}
