package tops.accounts;

import java.util.Scanner;

public class Arraysum2 {
	public static void main(String[] args) {
		int a[]=new int[5];                               //declaration 
		int i,sum=0,j,temp;                                 //variable
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element:");             //to print
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter"+i+" element:");     // to get input from user at runtime
			a[i]=sc.nextInt();           
			sum=sum+a[i];                                 //sum=0+a[i]
			
		}
		System.out.println("Array elements are ");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);           //to print
		}
		//to get sum of array elements
		
		System.out.println("sum of array elements :"+sum);
		
		//to arrange asc n desc order loop starts here
		
		for(i=0;i<a.length;i++)                             //for ascending order
		{
			for(j=i+1;j<a.length;j++)                    //j=array element variable for comparision
			{
				if(a[i]>a[j])
				{		
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}    //for ascending order
		
		System.out.println("Array element are in ascending order");
		for(i=0;i<a.length;i++)
		{
		System.out.println("a["+i+"]="+a[i]);          //to print in ascending order	
		}
		
		for(i=0;i<a.length;i++)                       //element no 1=i
		{
			for(j=i+1;j<a.length;j++)                 //element no 2=j
			{
				if(a[i]<a[j])                        //comparision of i and j
				{		
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				
			}
		}      
		                 //for descending order
		
		System.out.println("Array elements in descending order");
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
			
		}
	
	}

	

}
