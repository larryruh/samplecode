package com.lynda.javatraining.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lynda.javatraining.db.tables.States;

public class Main {

	public static void main(String[] args) throws Exception {

		try (Connection conn = DBUtil.getConnection(DBType.MYSQL);
				Statement stmt = conn.createStatement(
						ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery(
						"SELECT stateId, stateName FROM states");   	
				) {

			States.displayData(rs);
			rs.last();
			System.out.println("Number of Rows: " + rs.getRow());
			
			rs.first();
			System.out.println("The First State Is: " + rs.getString("stateName"));

			rs.last();
			System.out.println("The Last State Is: " + rs.getString("stateName"));
			
			rs.absolute(32);
			System.out.println("The 32nd State Is: " + rs.getString("stateName"));
			
		} catch (SQLException e) {
			System.err.println(e);
		}
	}

}
