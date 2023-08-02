package tops.accounts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Collectionpractise {
 public static void main(String[] args) {
	 
	ArrayList list=new ArrayList();
	list.add(10);
	list.add(10.10);
	list.add("tops");
	list.add('t');
	list.add(null);
	list.add(true);
	list.add(10);
	
	System.out.println(list);
	
	System.out.println(list.get(4));
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array list element:");
	
	int a=sc.nextInt();
	list.add(a); 
	System.out.println(list);
	System.out.println("Enter index to remove element");
	
	int index =sc.nextInt();
	list.remove("t");
	System.out.println(list);
	System.out.println("size of list:"+list.size());
	

}
	
	
	
}
