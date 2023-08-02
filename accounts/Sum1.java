package tops.accounts;

import java.util.Scanner;

public class Sum1 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1,num2;
	System.out.print("Enter num1:");
	num1=sc.nextInt();
	System.out.print("Enter num2:");
	num2=sc.nextInt();
	int sum=num1+num2;
	System.out.println("Addition:"+sum);
}
}
