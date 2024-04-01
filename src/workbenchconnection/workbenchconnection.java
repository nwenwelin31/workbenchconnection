package workbenchconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class workbenchconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String url = "jdbc:mysql://localhost:3306/sqlconnection";
		String username = "root";
		String password = "";
		try {
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("not connect");
			e.printStackTrace();
		}

	}

}
