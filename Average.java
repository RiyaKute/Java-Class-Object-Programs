/*Print the average of three numbers entered by user
 by creating a class named 'Average' 
 having a method to calculate and print the average.*/
 
 import java.util.*;
 class Average
 {
       int n1,n2,n3;
	   float avg;
	   Scanner sc = new Scanner(System.in);
       void calc_avg()
	   {
	       System.out.println("Enter First Number :");
		   n1=sc.nextInt();
		    System.out.println("Enter Second Number :");
		   n2=sc.nextInt();
		    System.out.println("Enter Third Number :");
		   n3=sc.nextInt();
		   
		   avg=(float)(n1+n2+n3)/3;
	   }
	   void disp_avg()
	   {
	     System.out.println("Average Of Three Numbers : "+avg);
	   }
	   public static void main(String args[])
	   {
	    Average a = new Average();
		a.calc_avg();
		a.disp_avg();
	   }
 }