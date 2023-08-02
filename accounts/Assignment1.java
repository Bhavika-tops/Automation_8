package tops.accounts;

import java.util.Scanner;

//W.A.J.P to Take three numbers from the user and print the greatest
//number.
public class Assignment1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a: ");
		a=sc.nextInt();
		System.out.print("Enter b: ");
		b=sc.nextInt();
		System.out.print("Enter c: ");
		c=sc.nextInt();
		 if(a>b)
		 {
			 if(a>c)
			 {
				 System.out.println("A is greatest");
			 }
			 else {
				 System.out.println("C is greatest");
			 }
		 }else
		{
			 if(b>c)
			 {System.out.println("B is greatest");
			 }
		
			 else
				 
			 {
				 System.out.println("C is greatest");
			 }
		}

}
}