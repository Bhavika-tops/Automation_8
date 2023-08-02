package com.p1;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// practice problem 1
		/*
		 * float[]marks= {2.3f,3.4f,4.5f,5.6f,6.7f}; float sum=0; for(float
		 * element:marks) { sum=sum+element; }
		 * System.out.println("The value of sum :"+sum);
		 * 
		 * //practice problem 2 int[]marks= {3,5,7,9}; int num=5; boolean
		 * isinArray=false; for(int element:marks) { if(num==element) { isinArray=true;
		 * break; } } if(isinArray) {
		 * System.out.println("The number is present in Array"); }else {
		 * System.out.println("The number is not present in Array"); } // problem 3
		 * int[]marks= {3,4,5,6}; int sum=0; for(int elements:marks) { sum=sum+elements;
		 * }
		 * 
		 * System.out.println("Average :"+sum/marks.length); } //problem5 int
		 * a[]={1,2,3,4}; int i; // In reverse order for(i=a.length-1;i>=0;i--) {
		 * System.out.println(a[i]); // } // In ascending order //
		 * for(i=0;i<a.length;i++) { // System.out.println(a[i]); } }
		 
		int[] marks = { 45, 24, 33, 15, 52 };
		int max = 0;
		for (int element : marks) {
			if (element > max) {
				max = element;
			}
		}
		System.out.println("The maximum value is:" + max);

	}*/
	      int []marks= {45,24,13,33,90};
	      int max=0;
	      for(int element:marks) {
	    	  if(element>max) {
	    		  max=element;	  
	    	  }
	      }System.out.println("The minimum value of array: "+max);
	}
}
