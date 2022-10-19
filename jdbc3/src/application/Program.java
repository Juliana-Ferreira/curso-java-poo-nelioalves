package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection connection = null;
		PreparedStatement st = null;
		try {
			connection = DB.getConnection();
	
			st = connection.prepareStatement(
					"INSERT INTO coursejdbc.seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, "Daisy Yellow");
			st.setString(2, "daisy@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("15/02/1996").getTime()));
			st.setDouble(4, 1800.0);
			st.setInt(5, 2);
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet resultSet = st.getGeneratedKeys();
				
				while(resultSet.next()) {
					int id = resultSet.getInt(1);
					System.out.println("Done! ID = " + id);
				}
			}
			else {
				System.out.println("No rows affected.");
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
