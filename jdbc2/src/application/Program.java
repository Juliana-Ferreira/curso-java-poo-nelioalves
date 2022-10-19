package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try {
			connection = DB.getConnection();
			statement = connection.createStatement();
			result = statement.executeQuery("select * from coursejdbc.department");
			
			while (result.next()) {
				System.out.println(result.getInt("Id") + ", " + result.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(result);
			DB.closeStatement(statement);
			DB.closeConnection();
		}
	}
}
