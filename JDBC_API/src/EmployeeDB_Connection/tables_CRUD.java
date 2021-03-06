package EmployeeDB_Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class tables_CRUD {
	void crud(Connection con,Statement stmnt) throws SQLException {
	Scanner sc=new Scanner(System.in);
	int ch;
	do {
		System.out.println("\n---------Employee Database------------\n");
		System.out.println("Choose your options: ");
		System.out.println("1.Show All tables\n2.Select \n3.Insert \n4.Delete\n5.Exit");
		ch=sc.nextInt();
	
		ResultSet rs;
	switch(ch) {
	
	case 1:  rs = stmnt.executeQuery("show tables");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"  ");
			}
			break;
	case 2: System.out.println("Choose the table to select: \n1.employee\n2.departments\n");
			int c=sc.nextInt();
			if(c==1) {
				 rs = stmnt.executeQuery("select * from employees");
					while (rs.next()) {
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  ");
					}	
			}
			else {
				rs = stmnt.executeQuery("select * from departments");
				while (rs.next()) {
					System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  ");
				}	
				
			}
			break;
	case 3: System.out.println("Choose the table to insert: \n1.departments\n\n2.employees\n");
			int c1=sc.nextInt();
			if(c1==1) {
			
				System.out.println("Enter dep_no: ");
				String dept_no=sc.next();
				System.out.println("Enter dep_name: ");
				String dept_name=sc.next();
				String sql="insert into departments values ('"+dept_no+"','"+dept_name+"')";
				int r=stmnt.executeUpdate(sql);
				if(r==1)
					System.out.println("Insertion succesfully: "+sql);
				else
					System.out.println("insertion failed!");
			}
			else {
				System.out.println("Enter emp_no:");
				int emp_no=sc.nextInt();
				System.out.println("Enter first name: ");
				String first_name=sc.next();
				System.out.println("Enter last name: ");
				String last_name=sc.next();
				System.out.println("Enter gender: ");
				String gender=sc.next();
				String sql= "insert into employees values('"+emp_no+"','"+first_name+"','"+last_name+"','"+gender+"')";
				
				int r=stmnt.executeUpdate(sql);
				if(r==1)
					System.out.println("Insertion succesfully: "+sql);
				else
					System.out.println("insertion failed!");
			}
				
			break;
	case 4: System.out.println("Choose the table to delete:\n1.employees\n2.departments\n");
			int c2=sc.nextInt();
			if(c2==1)
			{
				System.out.println("Enter an emp_no to delete: ");
				int emp_no=sc.nextInt();
				String sql= "Delete from employees where emp_no="+emp_no+"";
				int r=stmnt.executeUpdate(sql);
				if(r==1)
					System.out.println("Deleted succesfully: "+sql);
				else
					System.out.println("Deletion failed!");
			}
			else {
				System.out.println("Enter a dept_no to delete: ");
				String dept_no=sc.next();
				String sql= "Delete from departments where dept_no='"+dept_no+"'";
				int r=stmnt.executeUpdate(sql);
				if(r==1)
					System.out.println("Deleted succesfully: "+sql);
				else
					System.out.println("Deletion failed!");
				
			}
			break;
	case 5: System.out.println("Exiting");		
			break;
	
	default:System.out.println("Invalid choice");
			break;
	
	}
	}while(ch!=5);
	
	con.close();
	}
}





