package tops.accounts;

import java.util.Scanner;


	class A1
	{
		A1()
		{
			System.out.println("A1'constructor");
		}
	}
	class B1 extends A1
	{
		B1()
		{
			System.out.println("B1'constructor");
		}
	}
	class C1 extends B1
	{
		C1()
		{
			System.out.println("C1'constructor");
		}
	}			
			public class Inheritance1 {
            public static void main(String[] args) {
				C1 c=new C1();
				
            }
			
			}
			
			