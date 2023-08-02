package com.p1;
abstract class Abs1  //
{
void meth1()   //method1
{
	System.out.println("Meth1 in Abs1");
}
abstract void meth2();   //abstract method cannot
}
class Abs2 extends Abs1
{
	void meth2() {
		System.out.println("meth2 in Abs2");
	}
}

public class Abstractclass {
	public static void main(String[] args) {
		Abs2 a=new Abs2();
		a.meth2();
		a.meth1();
	}
}
