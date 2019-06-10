

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String USERNAME = "lruh";
	private static final String PASSWORD = "Asdfasdf1";	
	private static final String M_CONN_STRING = "jdbc:mysql://localhost:8889/jobsearch_dev";
	
	//Class.forName("com.mysql.jdbc.Driver");
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);
	}
	
	public static void processException(SQLException e) {
		System.err.println("Error message: " + e.getMessage());
		System.err.println("Error code: " + e.getErrorCode());
		System.err.println("SQL state: " + e.getSQLState());
	}
	
}
