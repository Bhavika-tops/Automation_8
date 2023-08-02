package com.p1;

import java.util.Scanner;
public class Assignment1 {
		    		
public static void demo()
{
	int x;
	Scanner sc=new Scanner(System.in);
	try {
		System.out.print("Enter X: ");
		x=sc.nextInt();
		if(x>0)
		{
			System.out.print("square of "+(x*x));
		}else
		{
		  throw new ArithmeticException("please Enter positive value only.");
		}
	}catch(ArithmeticException e) {
		System.out.println(e);
		demo();
		}
	}
	public static void main(String[] args){
		demo();
		}
	}
               

