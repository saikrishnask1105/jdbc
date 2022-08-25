package JDBC.JDBC;
import java.sql.*;

public class Student_Delection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sai" , "postgres" , "postgres") ;
		
		Statement st = con.createStatement();
		
		st.executeUpdate("delete from student where rollno = '3' ") ;
		System.out.println("deleted");
		con.close();
		
		

	}

}
