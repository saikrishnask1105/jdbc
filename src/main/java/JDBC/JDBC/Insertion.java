package JDBC.JDBC;

import java.sql.*;

public class Insertion {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
         
	  String url = "jdbc:postgresql://localhost:5432/sai";
	  String user = "postgres";
	  String pass = "postgres";
	  
	 // String query = "insert into public.employee(empname , empsal) values('adams' , '45000')" ;
	  
	 // String query = "update employee set empname = 'clark' where empid = '103' " ;
	  
	//  String query = "delete from employee where empid = '104' " ;
	  
	  String query = "select * from employee where empid = '101 '" ;
	  
	  
	  Class.forName("org.postgresql.Driver") ;
	  
	  Connection con = DriverManager.getConnection(url,user,pass) ;
	  
	  Statement st = con.createStatement();
	  
	  //int c = st.executeUpdate(query) ;
	  
	  
	  ResultSet rs = st.executeQuery(query) ;
	  rs.next();
	  String name = rs.getString("empsal") ;
	  System.out.println(name);
	  
	  
	  System.out.println("done!!");
	  
	  con.close();
	  
	  
	  
	  
	  
	  
  }
}
