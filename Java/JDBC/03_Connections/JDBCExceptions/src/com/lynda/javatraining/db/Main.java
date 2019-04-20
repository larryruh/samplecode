package com.lynda.javatraining.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		//declare and set to null (in Java 6 or lower
		//Connection conn = null;
		//Statement stmt = null;
		//ResultSet rs = null;
		
		//Try with resources 
		try(
				Connection conn = DBUtil.getConnection(DBType.MYSQL);
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery("SELECT * FROM states");
			) {
			
			
			rs.last();
			System.out.println("Number of rows: " + rs.getRow());
			
		} catch (SQLException e) {
			DBUtil.processException(e);
		} 
		//Can remove finally in Java 7 and above due to the try with resources
		//Anything declared in that statement is close automatically
		/*finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}*/
		
	}

}
