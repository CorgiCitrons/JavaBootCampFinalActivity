package sef.ATestTask.FirstActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class FirstActivityInsert {
	
		public static void main(String[] args) {
			Connection con = createConnection();
			System.out.println(con);
		

			
			Employee e1 = new Employee ("Elina","Sala", 31, 11, "test automation engeneer", "Accenture", 2100);
			Employee e7 = new Employee ("Ana", "Corgi", 45, 12, "manager", "Accenture", 4000);
			Employee e3 = new Employee ("Marcis", "Kalnins", 27, 13, "ScrumMaster", "Accenture", 4500);
			Employee e4 = new Employee ("Helga", "Lapina", 17, 50, "KAM", "Accenture", 3500);
			Employee e5 = new Employee ("John", "Pumpkin", 45, 36, "developer", "Accenture", 3700);
			Employee e6 = new Employee ("Martin", "Knor", 45, 21, "intern", "Accenture", 1000);
			
		}
		private static void insertEmployee(Employee e1) {
			// TODO Auto-generated method stub
			
		}
		public static Connection createConnection()	
		
		{
			Connection con=null;
			String url = "jdbc:mysql://localhost/activity?serverTimezone=UTC";
	
			String user = "root";
			String pass = "corgi";

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, user, pass);
				System.out.println("Connection successfully established!");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con; }
}
