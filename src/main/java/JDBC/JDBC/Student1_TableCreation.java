package JDBC.JDBC;
import java.sql.*;
import java.util.ArrayList;

public class Student1_TableCreation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
		
		Class.forName("org.postgresql.Driver");
		
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sai" , "postgres" , "postgres");
	
	    Statement st = con.createStatement();
	    
	    //st.executeUpdate("Create Table student1 (rollno int primary key , name varchar, age int)");
	    
	  //  st.executeUpdate("insert into student1(rollno , name , age) values('1' , 'smith' , '20')");
	  //  st.executeUpdate("insert into student1(rollno , name , age) values('2' , 'scott' , '19')");
	   // st.executeUpdate("insert into student1(rollno , name , age) values('3' , 'clark' , '20')");
	   // st.executeUpdate("insert into student1(rollno , name , age) values('4' , 'adams' , '21')");
	 //   st.executeUpdate("insert into student1(rollno , name , age) values('5' , 'john' ,  '22')");
	 //   st.executeUpdate("insert into student1(rollno , name , age) values('6' , 'david' , '19')");
	 //   st.executeUpdate("insert into student1(rollno , name , age) values('7' , 'wade' , '20')");
	    
	    
	   ResultSet rs =  st.executeQuery("select * from student1");
	   while(rs.next())
	   {
		   list.add(rs.getString("name"));
	   }
	   
	  
	   for(String i : list)
	   {
		  String s =  i.toUpperCase();
		  st.executeUpdate("insert into student1(name) values('"+s+"')");
		  
	   }
	 
	   
	   
	    
	 
	   con.close(); 
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
	}

}
