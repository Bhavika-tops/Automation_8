package tops.accounts;


public class Staticmethod {
	static int a=10;                 //value
	static int b;                      //variable
	static void method(int x)               //method
	{
		System.out.println("X :" +x);
		System.out.println("A :" +a);
		System.out.println("B :" +b);
	}
	static                         //static block
	{
		System.out.println("static block initialization");
		b=a*4;
		
	}
	public static void main(String[] args) {
		method(12);
	}


}
