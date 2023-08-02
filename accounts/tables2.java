package tops.accounts;

import java.util.Scanner;

public class tables2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number:");
		int n=sc.nextInt();
		for(int i=1;i<=10 ;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
		
	}

}
