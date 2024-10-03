package JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class DBIndependentJDBC {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Eclipse\\Practice\\src\\JDBC\\db.properties");
		properties.load(fis);
		
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");
		String driver = properties.getProperty("jdbc.driver");
		
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = connection.prepareStatement("INSERT INTO student VALUES(?, ?)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student id: ");
		int stdid = sc.nextInt();
		System.out.println("Enter the student name: ");
		String stname = sc.next();
		ps.setInt(1, stdid);
		ps.setString(2, stname);
		int x = ps.executeUpdate();
		System.out.println(x + " rows inserted");
		connection.close();
	}

}
