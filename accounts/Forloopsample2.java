package tops.accounts;

import java.util.Scanner;

public class Forloopsample2 {
	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N: ");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum :"+sum);
	}

}
