/*NAME :- Shadulla khurshid alam shaikh
ROLL NO. :- 21CO51
BATCH :- 3

                    EXPERIMENT NO. 15

AIM :- PERFORMING DATABASE CONNECTIVITY USING JDBC AND DOING VARIOUS OPERATIONS ON MYSQL DATABASE LIKE DATA INSERTION,
DELETION, UPDATION AND ACCESSING

Theory :-
JDBC is an acronym for Java Database Connectivity. 
It's an advancement for ODBC ( Open Database Connectivity ). 
JDBC is a standard API specification developed in order to move data from frontend to the backend. 
This API consists of classes and interfaces written in Java. 
It basically acts as an interface (not the one we use in Java) or channel between your Java program and databases 
i.e it establishes a link between the two so that a programmer could send data from Java code and store it in the 
database for future use.
*/
import java.io.*;
import java.sql.*;//SQL PACKAGE

class database {
	public static void main(String[] args) throws Exception
	{
		String url= "jdbc:mysql://localhost:3306/demo1234"; // table details
		String username = "abc"; // MySQL USERNAME credentials
		String password = "Abcd@1234";//MYSQL PASSWORD 
		String query = "select * from teachers"; // query to be run
//String query2="insert into student values(4,'mno',15,'F')";
//String query2="delete from student where rollno=2";


//specifying which connector we are using                
Class.forName("com.mysql.jdbc.Driver");
		
       Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established successfully");
//st object will do the actual task of taking data and bringing data		
Statement st = con.createStatement();

ResultSet rs=st.executeQuery(query); // Execute query


	while(rs.next())//fetching data from rs object and displaying it
{System.out.println(); // Print result on console
		int id	= rs.getInt("tid"); // Retrieve name from db
		String name= rs.getString("name"); // Retrieve name from db		
                
System.out.print(" "+id); // Print result on console
System.out.print(" "+name); // Print result on console
}

	st.close(); // close statement
		con.close(); // close connection
		System.out.println("Connection Closed....");
	}
}