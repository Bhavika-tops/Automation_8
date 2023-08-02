package tops.accounts;

import java.util.Scanner;

public class Forloopsimple3 {
public static void main(String[] args) {
//	int i,n,sum=0;
//	Scanner sc=new Scanner(System.in);
//	System.out.print("Enter N: ");
//	n=sc.nextInt();
//	for(i=0;i<=n;i++)
//	{
//		sum=sum+i;
//	}
//	System.out.println("sum :"+sum);
	
	
	int i,j,sum=0;   //variables
	Scanner sc=new Scanner(System.in);  //user input
	System.out.println("Enter j: ");  //to print
	j=sc.nextInt();    //
	for(i=0;i<=j;i++)     //for loop
	{
		sum=sum+i;      
	}
	System.out.println("sum: "+sum);
}
}
