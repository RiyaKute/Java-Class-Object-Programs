//Write a program to print the name, salary and date of joining of 10 employees in a company. 
//Use array of objects.

import java.util.*;
public class Employee_Data
{
    String name,date;
	int salary;
	Scanner sc = new Scanner(System.in);
	void getdata()
	{
	    System.out.println("Enter The Employee Name :");
		name=sc.next();
		System.out.println("Enter The Employee Salary :");
		salary=sc.nextInt();
		System.out.println("Enter The Employee Date Of Joining  :");
	    date =sc.nextInt();
	}
	void putdata()
	{
	   System.out.println("Employee Name             :"+name);
	   System.out.println("Employee Salary           :"+salary);
	   System.out.println("Employee Date Of Joinning :"+date);
	}
	public static void main(String args[])
	{
	   Employee_Data E[] = new Employee_Data[20];
	   int i;
	   for(i=1;i<=10;i++)
	   {
	        E[i]=new Employee_Data();
	   }
	   for(i=1;i<=10;i++)
	   {
	       E[i].getdata();
	   }
	   System.out.println("******************** Employee Information ******************");
	   for(i=1;i<=10;i++)
	   {
	      System.out.println("Employee "+i);
		  System.out.println(" ");
	      E[i].putdata();
		  System.out.println("___________________________________________________________________________");
	   }
	}
}