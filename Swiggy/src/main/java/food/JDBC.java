package food;
import java.sql.Connection;
import java.sql.DriverManager;


public class JDBC {
	
	static String Driver="com.mysql.cj.jdbc.Drivre";
	static String url="jdbc:mysql://localhost:3306/food_delivery";
	static String username="root";
	static String password="Naresh@1998";
	public static Connection getcon() throws Exception
	
	{
		Class.forName(Driver);
		Connection con=DriverManager.getConnection(url,username,password);
		
		return con;
	}
	

}
