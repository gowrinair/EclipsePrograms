package OOPS;

public class TestStaticMethod {
	 public static void main(String args[]){  
		    Student22.change();//calling change method  
		    //creating objects  
		    Student22 s1 = new Student22(111,"Karan");  
		    Student22 s2 = new Student22(222,"Aryan");  
		    Student22 s3 = new Student22(333,"Sonoo");  
		    //calling display method  
		    s1.display();  
		    s2.display();  
		    s3.display();  
		    }
}
	 class Student22{  
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	     //static method to change the value of static variable  
	     static void change(){  
	     college = "BBDIT";  
	     }  
	     //constructor to initialize the variable  
	     Student22(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	     //method to display values  
	     void display(){System.out.println(rollno+" "+name+" "+college);}  
	}  



