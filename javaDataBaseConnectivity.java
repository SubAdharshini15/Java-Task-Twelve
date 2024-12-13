package SeleniumPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class javaDataBaseConnectivity {
	public static void main(String[] args) {

		Connection connection = null; 

		try {
			String dbUrl = "jdbc:sqlite:D:\\DataBasePractice.db";
			connection = DriverManager.getConnection(dbUrl);

			System.out.println("Connection to SQLite has been established.");

			Statement statement = connection.createStatement();
			
			String query = "CREATE TABLE Employee ("
					+ "  empcode INTEGER ,"
					+ "  empname TEXT NOT NULL,"
					+ "  empage INTEGER NOT NULL,"
					+ "  esalary NUMERIC NOT NULL"
					+ ");";
			
			statement.execute(query);

			query = "INSERT INTO Employee VALUES (101, 'Jenny', 25, 10000);";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES (102, 'Jacky', 30, 20000);";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES (103, 'Joe', 20, 40000);";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES (104, 'John', 40, 80000);";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES (105, 'Shameer', 25, 90000);";
			statement.executeUpdate(query);
			
			
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}
	
	public static void waitForFixTime(int Time) {
		try {
			Thread.sleep(Time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
