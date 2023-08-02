package tops.accounts;
class Box                            //
{
	double width,height,depth;
	Box()                //Default constructor//
	{
      System.out.println("Default Constructor called");
      width=3;
      height=4;
      depth=5;
	}
	//parameter costructor
 Box(double w,double h,double d)
 {
	 System.out.println("Parameterised constructor");
	 width=w;
	 height=h;
	 depth=d;
	
 }
 //user defined function//
 void Volume()
 
 {
	 System.out.println("volume of box:"+(width*height*depth));
 }
}
public class CostructorDemo {
public static void main(String[] args) {
	Box b1=new Box();    //create an object of default constructor
	b1.Volume();       //call an user defined of default constructor
	Box b2=new Box(4,5,6);  //create an object of parameter constructor
	b2.Volume();        //call an object of parameterized constructor
	
		System.out.println("End of main method");
	
	
}
}
