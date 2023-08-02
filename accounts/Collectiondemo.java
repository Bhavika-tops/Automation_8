 package tops.accounts;

import java.util.ArrayList;
import java.util.Scanner;

public class Collectiondemo {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();   //object
		list.add(10);
		list.add(10.10);
		list.add("tops");
		list.add('t');
		list.add(null);
		list.add(true);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(3));
		Scanner sc=new Scanner(System.in);    //for input from user 
		System.out.println("Enter Array list element:");//to print
		
		int a=sc.nextInt();
		list.add(a);
		System.out.println(list);
		System.out.println("Enter index number to remove Element :");
		
		
		int index=sc.nextInt();
		list.remove(index);
		System.out.println(list);
		System.out.println("size of list :"+list.size());
		
	}
}
