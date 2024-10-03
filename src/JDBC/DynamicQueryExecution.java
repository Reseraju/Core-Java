package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicQueryExecution {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded");
		
		// Establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "Apple@99l3123");
		System.out.println("Connection established");
		
		// statement object is created when we are using static queries like --> INSERT INTO student VALUES(108, 'Anjaly') there we use createStatement()
		// but to pass dynamic queries we need to call prepareStatement() method whose return type is PreparedStatement
		PreparedStatement ps = connection.prepareStatement("INSERT INTO student VALUES(?, ?)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id: ");
		int stid = sc.nextInt();
		System.out.println("Enter student name: ");
		String stname = sc.next();
		
		ps.setInt(1, stid);
		ps.setString(2, stname);
		
		int result = ps.executeUpdate();
		
		System.out.println(result + " row(s) inserted");
		
		connection.close();
	}

}
