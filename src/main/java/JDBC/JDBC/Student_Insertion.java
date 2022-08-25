package JDBC.JDBC;
import java.sql.*;
public class Student_Insertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sai", "postgres", "postgres") ;
		
		Statement st = con.createStatement() ;
		
		st.executeUpdate("insert into student(name , age , address) values('rahul' , '19' , 'bang') ");
		
		System.out.println("inserted");
		con.close();
		

	}

}
