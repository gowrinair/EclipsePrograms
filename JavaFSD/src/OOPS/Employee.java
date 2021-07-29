package OOPS;

public class Employee {
	String empName="Anna";
	int empNo=123;
	double salary=50000;
	
	
	public void display() {
		System.out.println("Name: "+empName);
		System.out.println("Employee Id: "+empNo);
		System.out.println("Salary is: "+salary);
		
	}
	public void display(String empName,double salary) {
		System.out.println("Salary of "+empName +" is "+salary);
	}
	
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.display();
		obj.display("Gowri", 75000);
		
			
	}
	

}
