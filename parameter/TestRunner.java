package com.parameter;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import junitTesting.PracticeDemo;

public class TestRunner {
	public static void main(String[] args) {
		   
		Result result=JUnitCore.runClasses(ArithmeticTest.class);
		
		    
		  System.out.println("Result=="+result.wasSuccessful());
		 }

	}
