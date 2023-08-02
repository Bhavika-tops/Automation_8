package tops.accounts;

import java.util.Scanner;

public class Variable3 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.print("Enter A:");
	a=sc.nextInt();
	System.out.print("Enter B:");
	b=sc.nextInt();
	c=a+b;
	System.out.println("Addition:"+c);
	c=a-b;
	System.out.println("Subtraction:"+c);
	c=a*b;
	System.out.println("Multiplication:"+c);
	c=a/b;
	System.out.println("Division:"+c);
	
}
}
