/*
Write a program that would print the information 
(name, year of joining, salary, address) of three employees by creating a class named 'Employee'.
 The output should be as follows:
   Name        Year of joining        Address
   Robert           1994          64C- WallsStreat
   Sam              2000          68D- WallsStreat
   John             1999          26B- WallsStreat

*/

import java.util.*;
class Employee
{
     int year,salary;
	 String name,address;
	 Scanner sc = new Scanner(System.in);
	 void getdata()
	 {
	    System.out.println("Enter Employee Name :");
		name = sc.next();
		System.out.println("Enter Employee Address :");
		address = sc.next();
		System.out.println("Enter Employee Salary:");
		salary = sc.nextInt();
		System.out.println("Enter Employee Year Of Joining  :");
		year= sc.nextInt();
	 }
	 void putdata()
	 {
	    System.out.println(name+"\t\t"+address+"\t\t"+salary+"\t\t"+year);
	 }
	 public static void main(String args[])
	 {
	    Employee e[] = new Employee[5];
		int i,n;
		System.out.println("Data For How Many Employees Do You Want To Enter :");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(i=1;i<=n;i++)
		{
		   e[i]=new Employee();
		}
		for(i=1;i<=n;i++)
		{
		    e[i].getdata();
		}
		System.out.println("*************** Employee Data **************");
		System.out.println("Employee Name \t Employee Address \t Employee Salary \t Employee Year Of Joining ");
		for(i=1;i<=n;i++)
		{
		    e[i].putdata();
		}	
	 }
}