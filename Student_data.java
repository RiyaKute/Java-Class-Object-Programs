/*Assign and print the roll number, phone number and address of two students 
  having names "Sam" and "John" respectively by creating two objects of class 'Student'.
*/

 class Student_Data
{
     int rollno,phoneno;
	 String name,address;
	 void getdata(int r,int p,String n,String a)
	 {
	      rollno=r;
		  phoneno=p;
		  name=n;
		  address=a;
     }
	 void putdata()
	 {  
	   System.out.println("Name Of The Student :"+name);
	   System.out.println("Roll No Of The Student :"+rollno);
	   System.out.println("Phone No Of The Student :"+phoneno);
	   System.out.println("Address Of The Student :"+address+"\n");
	 }
	 public static void main(String args[])
	 {
	      Student_Data s1 = new Student_Data();
		  Student_Data s2 = new Student_Data();
		  s1.getdata(1001,1234560,"Sam","Pune");
		  s2.getdata(1002,1234569,"John","Mumbai");
		  System.out.println("************Student Info************");
		  System.out.println("Student 1 \n " );
		  s1.putdata();
		  System.out.println("Student 2 \n " );
		  s2.putdata();
	 }
}