/*Write a do-while loop that asks the user to enter two numbers.
 The numbers should be added and the sum displayed. 
 The loop should ask the user whether he or she wishes to perform the operation again. 
 If so, the loop should repeat; otherwise it should terminate. 
 */
 
 import java.util.*;
 class Loop
 {
	  Scanner sc = new Scanner(System.in);
		 int n1,n2,sum,i;
		 
	   void Add()
		 {
		     do
			 {
			    System.out.println("Enter Number :");
				n1=sc.nextInt();
				System.out.println("Enter Number :");
				n2=sc.nextInt();
				i++;
			 }while(i==0);
			 sum=n1+n2;
			 System.out.println("Addition Of Two Numbers  :"+sum);
			
		 }
	  	  
     public static void main(String args[])
	 {
		 boolean a;
		 int i;
		 Scanner s = new Scanner(System.in);
	     Loop l = new Loop();
		 l.Add();
		 for(i=1; ;i++)
		 {	 
		  System.out.println("Do You Want To Perform The Same Operation again (true / False ) :");
			 a=s.nextBoolean();
			 if(a==true)
			 {
                  l.Add();
			 }
			 else
			 {  
			     System.out.println("Program Exited !!");
			 }
		 }	 
	    
		
		 
	 }
 }