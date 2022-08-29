//Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). 
//The marks are entered by the user and the roll numbers are automatically assigned.

import java.util.*;
public class StudentData
{
     int s1,s2,s3,total,avg,i;
	 Scanner sc = new Scanner(System.in);
	 int r[] = new int[9];
	  void assign_rollno()
	  {
	       
		   for(i=1;i<=8;i++)
		   {
		       System.out.println("STUDENT ROLL NO "+i);
			   System.out.println("Enter Marks Of Suject 1:");
			   s1=sc.nextInt();
			   System.out.println("Enter Marks Of Suject 2:");
			   s2=sc.nextInt();
			   System.out.println("Enter Marks Of Suject 3:");
			   s3=sc.nextInt();
			   total=s1+s2+s3;
			   System.out.println("Total Marks :"+total);
			   avg=total/300*100;
			   System.out.println("Percentage :"+avg);
			   
		   }
	  }
	 
	  public static void main(String args[])
	  {
	    StudentData s = new StudentData();
		s.assign_rollno();
	  }
}
