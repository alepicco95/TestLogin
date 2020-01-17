package logic;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider {
	
	private static String PASS = "pinno.99";
    private static String USER = "postgres";
    private static String DB_URL = "jdbc:postgresql://localhost:5432/loginDB";
    
	static Connection con;
	
	private MyConnectionProvider() {
		//
	}
	
	public static Connection getCon() {
		
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(DB_URL,USER,PASS);
		
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
	}
}
