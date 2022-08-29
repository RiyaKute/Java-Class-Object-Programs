/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
 First method named as 'setDim' takes length and breadth of rectangle as parameters
 and the second method named as 'getArea' returns the area of the rectangle.
 Length and breadth of rectangle are entered through keyboard.
 */
 
 import java.util.*;
 public class Area
 {
     int length,breadth;
     void setDim(int l,int b)
	 {
	    length=l;
		breadth=b;
		System.out.println("Length Of Rectangle :"+length);
		System.out.println("Breadth Of Rectanle :"+breadth);
	 }
	 int getArea()
	 {
	    return length*breadth;
	 }
	 public static void main(String args[])
	 {
	      int l,b;
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter Length Of The Rectanle :");
		  l=sc.nextInt();
		  System.out.println("Enter Breadth Of The Rectanle :");
		  b=sc.nextInt();
		  
		  Area a1 = new Area();
		  a1.setDim(l,b);
		  System.out.println("Area Of Rectanle :"+a1.getArea());
		  
		  Area a2 = new Area();
		  a2.setDim(l,b);
		  System.out.println("Area Of Rectanle :"+a2.getArea());
	 }
 }