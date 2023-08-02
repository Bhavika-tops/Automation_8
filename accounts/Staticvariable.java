package tops.accounts;

import java.util.Scanner;

public class Staticvariable {
	int a;                               //user define variable//
	void setvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
	}
	void printvalue()
	{
		System.out.println("Enter A"+a);
	}
	public static void main(String[] args) {
		Staticvariable s1= new Staticvariable();
		Staticvariable s2= new Staticvariable();
		
		
		s1.setvalue();
		s2.setvalue();
		
		
		s1.printvalue();
		s2.printvalue();
	
	}

}
