package tops.accounts;

 //class Flipkart{
//	  void electronics()
//	  {
//		  System.out.println("Show Electronics");

//	  }
 
 // void Clothing()
//	  {
//		  System.out.println("Show Clothes");
//	  }
 //}
//public class ConstructorTest {
//public static void main(String[] args) {
//	Flipkart f1=new Flipkart();
	
//	f1.electronics();
//	f1.Clothing();
//}
//}
class Rectangle{
	  double length,breadth;
	  Rectangle()
	  {
		  System.out.println("Show Default constructor");
		  length=4;
		  breadth=5;
	
	  }

       Rectangle(double l,double b)
	  {
		  System.out.println("parameterized constructor");
		  length=l;
		  breadth=b;
		  
	  }

       Rectangle(Rectangle r)
    		   {
    	   System.out.println("copy constructor");
    	   length=r.length;
    	   breadth=r.breadth;
	}

void area()
{
	System.out.println("Area:"+(2*length*breadth));
}
}
public class ConstructorTest {
	

public static void main(String[] args) {
  Rectangle b1=new Rectangle();
  b1.area();
  Rectangle b2=new Rectangle(3,4);
  b2.area();
  Rectangle b3=new Rectangle(b1);
  b3.area();
}
}
  
	
