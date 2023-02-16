import java.sql.*;
//or you can keep the following instead
//import java.sql.DriverManager;
//import java.sql.Connection;
//import java.sql.SQLException;
import java.util.Scanner;
 
public class OracleJDBC {
 
	public static void main(String[] argv) {
 
		System.out.println("-------- Oracle JDBC Connection Testing ------");
 
		try {
 
			Class.forName("oracle.jdbc.driver.OracleDriver");
 
		} catch (ClassNotFoundException e) {
 
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
 
		}
 
		System.out.println("Oracle JDBC Driver Registered!");
 
		Connection connection = null;
 
		try {
 
 //below include your login and your password
            connection = DriverManager.getConnection("jdbc:oracle:thin:@acaddbprod.uta.edu:1523/pcse1p.data.uta.edu", "nhd7037", "qazwsxed94Aqaz");
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
 
		}
 
		if (connection != null) {
			System.out.println("You made it, take control of your database now!\n");
            System.out.println("Printing most preferred courses by the users");
		} else {
			System.out.println("Failed to make connection!");
		}
        try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter x rankings you want to see: ");
			String searchTerm = s.nextLine();
            Statement stmt = connection.createStatement();
	       ResultSet rs = stmt.executeQuery("SELECT c.Title,c.Course_level,o.Org_name,COUNT(User_ID) AS Num_of_users FROM Fall22_S003_11_Enrolls e,Fall22_S003_11_Courses c,Fall22_S003_11_Courses_offeredby o WHERE e.Course_ID = c.Course_ID AND   e.Course_ID = o.Course_ID GROUP BY c.Title,c.Course_level,o.Org_name HAVING COUNT(User_ID) >= 4 ORDER BY COUNT(User_ID) DESC FETCH FIRST "+searchTerm+"ROWS ONLY");
	       while (rs.next())
	         System.out.println(rs.getString("TITLE")+" "+rs.getString("COURSE_LEVEL")+" "+rs.getString("ORG_NAME")+" "+rs.getString("NUM_OF_USERS"));
			 rs.close();
	       stmt.close();
            connection.close();
        }
        catch (SQLException e) {
 
			System.out.println("erro in accessing the relation");
			e.printStackTrace();
			return;
 
		}    
	}
 
}
