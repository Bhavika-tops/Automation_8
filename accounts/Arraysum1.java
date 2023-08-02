package tops.accounts;

import java.util.Scanner;

public class Arraysum1 {
	public static void main(String[] args) {
	    int a[]=new int[5];
	    
		int i,sum=0,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(i=0;i<a.length;i++)
		{ 
			System.out.print("Enter "+i+"Elements");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Array Elements are");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		System.out.println("sum of Array elements: "+sum);
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("Ascending order of Array is");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		
		// For Descending part
		for(i=0;i<a.length;i++)
		{
		  for(j=i+1;j<a.length;j++);
		  {
			  if(a[i]<a[j])
			  {
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
			  }
		  }
		}
		System.out.println("Descending order of array");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}

}
