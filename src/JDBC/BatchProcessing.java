package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "Apple@99l3123");
		
		Statement statement = connection.createStatement();
		
		// 		NOTE : 
		// ------------------------------
		// instead of passing one query at a time execute multiple queries as a batch from java application to the db. 
		// this will increase the performance
		// DRAWBACK ----> only NON-SELECT operations can be performed as a batch because,
		//			the select operation is performed using executeQuery() method and the return type of this method is ResultSet.
		//			while the non-select operations are executed using executeUpdate() method whose return type is int
		//          which can be accommodated by the executBatch() method whose return type is int[] array.
		//          therefore not allowing to use the SELECT operation is the drawback of Batch processing
		//----------------------------------
		
		statement.addBatch("INSERT INTO student VALUES(109, 'Chandler')");
		statement.addBatch("UPDATE student SET stname = 'James' WHERE stid = 107");
		statement.addBatch("DELETE FROM student WHERE stid = 105");
		
		int x[] = statement.executeBatch();
		
		System.out.println(x[0] + " rows inserted");
		System.out.println(x[1] + " rows updated");
		System.out.println(x[2] + " rows deleted");
	}

}
