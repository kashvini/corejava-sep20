
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String URL = "jdbc:mysql://localhost:3306/ecommerce";
		String Username = "root";
		String Password = "root";
		
		DBConnection dbObj = new DBConnection(URL,Username, Password);
		
		Statement statement = dbObj.getConnection().createStatement();
		
		ResultSet result = statement.executeQuery("select * from eproduct");
		
		while(result.next()) {
			
			System.out.println("Name: " + result.getString("name"));
			
		}

	}

}