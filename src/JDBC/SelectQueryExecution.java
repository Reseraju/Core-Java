package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryExecution {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1: Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver class loaded");
		
		//Step 2: Get the Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware","root", "Apple@99l3123");
		
		System.out.println("i got the connection");
		
		// Step 3: Create a statement object
		Statement statement = connection.createStatement();
		
		
		// Step 4: Execute a SELECT query
		// use executeQuery() method to execute select queries
		
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
        
        
        // Step 5: Process the ResultSet and display the data
        
        while(resultSet.next()) {
        	System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
        }
        
        // Step 6: Close the connection
		connection.close();

	}

}
