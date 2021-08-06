package Banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_con {
	
	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","root");
			Statement stmnt=con.createStatement();
			ResultSet rs=stmnt.executeQuery("select * from customer_details");
			System.out.println("Customer Details:");
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
			rs=stmnt.executeQuery("select * from account_details");
			System.out.println("\nAccount Details: ");
				while(rs.next())
					System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getString(3));
			
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
