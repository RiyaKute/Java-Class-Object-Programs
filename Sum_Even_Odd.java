//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.


import java.util.*;
class Sum_Even_Odd
{
    int i,esum=0,osum=0,n;
	
	void data()
	{
		  System.out.println("upto which number do you want a sum of even and odd numbers :");
		  Scanner sc = new Scanner(System.in);
	      n=sc.nextInt();
	}	
     void even()
	 {
	    System.out.println("Even Numbers Between 1 to "+n+" :");
	    for(i=1;i<=n;i++)
		{
		   if(i%2==0)
		   {
		       esum=esum+i;
			   System.out.print("\t"+i);
		   }
		  
		}
		 System.out.println(" ");
		System.out.println("Addition Of Even Numbers Between 1 to "+n+" :"+esum);
		System.out.println(" ");
	 }
	 void odd()
	 {
	     System.out.println("Odd Numbers Between 1 to "+n+" :");
	    for(i=1;i<=n;i++)
		{
		   if(i%2!=0)
		   {
		       osum=osum+i;
			   System.out.print("\t"+i);
		   }
		}
		 System.out.println(" ");
		System.out.println("Addition Of Even Numbers Between 1 to "+n+" :"+osum);
		System.out.println(" ");
	 }
	 public static void main(String args[])
	 {
	      
	      Sum_Even_Odd S = new Sum_Even_Odd();
		  S.data();
		  S.even();
		  S.odd();
		  
	 
	 }
}