package tops.accounts;

import java.util.Scanner;

public class Forloopsimple {
	public static void main(String[] args) {
	//	int i;
	//	for(i=0;i<=10;i++)
	//	{
//			System.out.println(i);
//		}
		
//		int n,sum=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter n: ");
//		n=sc.nextInt();
//		while(n>0) {
//			sum=sum+n;
//					n--;
//		}
//	     System.out.println("sum :"+sum);
		
         int i;
		for(i=0;i<10;i++)
		{
	if(i==5 || i==8)
		{
			continue;
		}
		else
		{
			System.out.println("I :"+i);
		}
		}
	}
}