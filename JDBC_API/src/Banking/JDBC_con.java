package Banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_con {
	
	public static void main(String[] args) {
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost","root","root");
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
			Statement stmnt=con.createStatement();
			Statement st=con1.createStatement();
			customer_details obj=new customer_details();
			//obj.createDB(con, stmnt);
			//obj.createCustomer_Details(con1, st);
			obj.insertCustomer_Details(con1, st);
			obj.selectCustomer_Details(con1, st);
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
