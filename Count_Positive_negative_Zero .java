//Write a program to enter the numbers till the user wants and
// at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;
class Count_Positive_negative_Zero 
{
    public static void main(String args[])
	{
	   int i,n,pcount=0,ncount=0,zcount=0;
	   int a[] = new int[10];
	   Scanner sc = new Scanner(System.in);
	   System.out.println("How Many Numbers Do You Want To Enter :");
	   n=sc.nextInt();
	   System.out.println("Enter "+n+" Numbers :");
	   for(i=1;i<=n;i++)
	   {
	       a[i]=sc.nextInt();
	   }
	   System.out.println("You Have Enterd "+n+"Numbers ");
	    for(i=1;i<=n;i++)
	   {
	       System.out.println("\t"+a[i]);
	   }
	   System.out.println("Negative Numbers :");
	   for(i=1;i<=n;i++)
	   {
	       if(i<0)
		   {
		       ncount++;
			   System.out.println("\t "+i);
		   }
	   }
	   System.out.println("Total Negative Numbers :"+ncount);
	   System.out.println("Positive Numbers :");
	   for(i=1;i<=n;i++)
	   {
	       if(i>0)
		   {
		       pcount++;
			   System.out.println("\t "+i);
		   }
	   }
	   System.out.println("Total Positive Numbers :"+pcount);
	   System.out.println("Zero :");
	   for(i=1;i<=n;i++)
	   {
	       if(i==0)
		   {
		       zcount++;
			   System.out.println("\t "+i);
		   }
	   }
	   System.out.println("Total Zeros  :"+zcount);
	   
	}
}
