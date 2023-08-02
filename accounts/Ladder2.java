package tops.accounts;

import java.util.Scanner;

public class Ladder2 {
	public static void main(String[] args) {
		int rno,s1,s2,s3,total;
		double per;
		String sname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sname");
		sname=sc.next();
		System.out.print("Enter rno:");
		rno=sc.nextInt();
		System.out.print("Enter s1:");
		s1=sc.nextInt();
		System.out.print("Enters2");
		s2=sc.nextInt();
		System.out.print("Enter s3");
		s3=sc.nextInt();
		 
		total=s1+s2+s3;
		per=total/3;
		System.out.println("Roll no:"+rno);
		System.out.println("Students name:"+sname);
		System.out.println("Total:"+total);
		System.out.println("per:"+per);
	
		if(per>=70)
		{
			System.out.println("Distinction");
		}
		else if(per>=50)
		{
			
			System.out.println("First class");
			
		}
		else if(per>=40)
		{
			System.out.println("Second class");
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
