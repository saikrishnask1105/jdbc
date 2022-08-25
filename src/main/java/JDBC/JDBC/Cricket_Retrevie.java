package JDBC.JDBC;
import java.sql.*;

public class Cricket_Retrevie {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sai", "postgres", "postgres");
		
		Statement st = con.createStatement() ;
		
		ResultSet rs = st.executeQuery("select * from public.cricket") ;
		
		while(rs.next())
		{
			System.out.println(rs.getInt("id") + "  " + rs.getString("firstname"));
		}
		con.close();
		
		

	}

}
