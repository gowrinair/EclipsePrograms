package OOPS;



public class TestHR {
	public static void main(String[] args) {
		
		NewEmployee e1=new NewEmployee();
		e1.insert("Anna",123,45000,12);
		e1.display();
		System.out.println("Salary due to paid leave: "+e1.SalaryCalc());
		
	}

}

class NewEmployee{
	String eName;
	int Eid;
	double Empsalary;
	int leave;
	
	
	void insert(String name,int id,double salary,int l) {
		eName=name;
		Eid=id;
		Empsalary=salary;
		leave=l;
	}
	
	
	void display() {
		System.out.println("Name: "+eName +" Id: "+ Eid+ " Salary: "+Empsalary);
	}
	
	double SalaryCalc() {
		if(leave>3) {
			Empsalary=Empsalary-(150*leave);
		}
		return Empsalary;
	}
}
