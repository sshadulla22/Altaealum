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
import java.sql.*;

class GFG {
	public static void main(String[] args) throws Exception
	{
		String url= "jdbc:mysql://localhost:3306/demo12"; // table details
		String username = "amaanrs786"; // MySQL credentials
		String password = "nahimalum";
		String query = "select *from students"; // query to be run
Class.forName("com.mysql.jdbc.Driver");		
//Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established successfully");
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery(query); // Execute query
		rs.next();
		String name	= rs.getString("name"); // Retrieve name from db
		System.out.println(name); // Print result on console
		st.close(); // close statement
		con.close(); // close connection
		System.out.println("Connection Closed....");
	}
}
