package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class nonSelectQueryExecution {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//step 1: Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver class loaded");
		
		//Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware","root", "Apple@99l3123");
		
		System.out.println("i got the connection");
		
		// Step 3: Create a statement object
		Statement statement = connection.createStatement();
		
		
		// use executeUpdate() method to execute non-select queries
		
		// Inserting into no primary key table employees
		//int x = statement.executeUpdate("insert into employees values('Rese','Raju','reeseraju@gmail.com','2024-10-01','8606391899')");
		
		// Inserting into Student table where stid is the primary key
		int x = statement.executeUpdate("insert into student values(105, 'Rahul')");
		
		System.out.println(x + "row(s) inserted");
		
		
        // Step 6: Close the connection
		connection.close();
				
	}
}
