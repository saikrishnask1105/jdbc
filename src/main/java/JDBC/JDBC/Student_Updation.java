package JDBC.JDBC;
import java.sql.*;
public class Student_Updation {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sai" , "postgres" , "postgres");
		
		Statement st = con.createStatement();
		
		st.executeUpdate("update student set age = '20' where rollno = '2' ");
		
		System.out.println("updated");
		
		con.close();
		

	}

}
