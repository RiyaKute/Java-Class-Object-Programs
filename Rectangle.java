/*
Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively 
by creating a class named 'Rectangle' with a method named 'Area' 
which returns the area and length and breadth passed as parameters to its constructor.
*/

class Rectangle
{
    int length;
	int breadth;
    Rectangle(int l, int b)
	{
	   length=l;
	  breadth=b; 
	   
	}
	int area()
	{
		 return length*breadth;
	}
	public static void main(String args[])
	{
	     Rectangle R1 = new Rectangle(4,5);
		 int a1=R1.area();
		  System.out.println("Arae Of The Rectangle :"+a1);
	     Rectangle R2 = new Rectangle(5,8);
		 int a2=R2.area();
		 System.out.println("Area Of Rectangle :"+a2);
	}
}