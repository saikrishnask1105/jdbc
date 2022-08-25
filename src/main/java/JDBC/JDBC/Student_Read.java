package JDBC.JDBC;
import java.sql.*;
public class Student_Read {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sai" , "postgres" , "postgres");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt("rollno") + " " + rs.getString("name") + " " + rs.getInt("age") + " " + rs.getString("address"));
		}
		con.close();
		
		
	}

	
}


