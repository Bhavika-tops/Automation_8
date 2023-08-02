package tops.accounts;

import java.util.Scanner; 

class A 

{
	int a;    
	void setA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A :");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}
class B extends A
{
	int b;
	void setB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of B :");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B :"+b);
	}
}
public class Inheritancesimple {
	public static void main(String[] args) {
		B b1=new B();
		b1.setA();
		b1.setB();
		b1.putA();
		b1.putB();
		
	}

}
