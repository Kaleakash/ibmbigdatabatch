package shopping.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
private static Connection con;	
	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system", "tiger");
		} catch (Exception e) {
			System.err.println("Db Connection Error "+e);
		}
		
	}
	public static Connection getDbConnection() {
		return con;
	}
}
