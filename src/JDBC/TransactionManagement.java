package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "Apple@99l3123");
		
		Statement statement = connection.createStatement();
		connection.setAutoCommit(false);
		statement.addBatch("UPDATE dasan SET balance = balance - 10000 where accNo = 1000");
		statement.addBatch("UPDATE vijayan SET balance = balance + 10000 where accNo = 2000");
		
		int x[] = statement.executeBatch();
		
		if(x[0] > 0 && x[1] > 0) {
			connection.commit();
			System.out.println("Fund transferred");
		}
		else {
			connection.rollback();
			System.out.println("Transaction failed!! Something went Wrong :( ");
		}

	}

}
