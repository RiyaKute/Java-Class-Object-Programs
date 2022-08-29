/*1.Create a class named 'Student' 
with String variable 'name' and integer variable 'roll_no'.
 Assign the value of roll_no as '2' and that of name as "John" 
 by creating an object of the class Student.*/
 
 class Student
 {
      String name;
	  int rollno;
	  Student(String n,int r)
	  {
	      name=n;
		  rollno=r;
		  System.out.println("Name Of The Student :"+name);
		  System.out.println("Roll NO  Of The Student :"+rollno);
		  
	  }
	  public static void main(String args[])
	  {
	      Student s = new Student("John",2);
	  }
 }