package com.p1;

interface ifs1
{
	void meth1();  // static void meth1() {syso}
		
	
	void meth2();
}

interface ifs2 extends ifs1
{
	void meth3();
	void meth4();
}
class ImpInterface implements ifs1
{
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
	public void meth3() {
		System.out.println("meth3");
	}
	public void meth4() {
		System.out.println("meth4");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		
	
       ImpInterface i=new ImpInterface();
       i.meth1();  //ifs1.meth1();
       i.meth2();
       i.meth3();
       i.meth4();
}
}



