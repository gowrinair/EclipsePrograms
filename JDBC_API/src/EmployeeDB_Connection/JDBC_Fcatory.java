package EmployeeDB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Fcatory {
	
	
	public static void main(String[] args) {
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			Statement stmnt=con.createStatement();
			
			tables_CRUD obj=new tables_CRUD();
			obj.crud(con, stmnt);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}		
}	