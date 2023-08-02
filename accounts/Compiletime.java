package tops.accounts;

public class Compiletime {
	//3 method in same class with diff parameter//
	
	void test()             // default
	{
		System.out.println("test with no argument");
	}
	void test(int a)        // 1 variables
	{
		System.out.println("test with 1 argument");
	}
	void test(int a ,double b)   // 2 variables
	{
		System.out.println("test with 2 argument");
	}
	public static void main(String[] args) {
		Compiletime c= new Compiletime();
		c.test();
		c.test(10,10);
		c.test(10);
	}
	
	
	
	

}
