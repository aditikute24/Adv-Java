package crudop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
	
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/demodb";
		String username = "postgres";
		String password = "root";

		try {
			// step 1 : Load the driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded ");

			// step 2 : Establish the connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection is created");

			// step 3 : Create a Statement
			Statement stm = con.createStatement();
			System.out.println("statement is created");

			String query = "Select * from Students";
			
			ResultSet rs = stm.executeQuery("SELECT * FROM students");

			while (rs.next()) {
			    System.out.println(rs.getInt("sid"));
			    System.out.println(rs.getString("sname"));
			    System.out.println(rs.getString("email"));
			    System.out.println(rs.getString("phoneno"));

			}

			// step 4 : Execute the query
			stm.execute(query);
			System.out.println("Fetch Data Successfully !!");

			// step 5 : Close the connection
			con.close();
			System.out.println("Connection is closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
