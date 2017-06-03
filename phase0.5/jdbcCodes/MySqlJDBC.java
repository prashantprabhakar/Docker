package jdbcCodes;

import java.sql.*;

public class MySqlJDBC {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			// here testEmp is DB name and prsingh is user and Gemini@123 is password
			Connection con = DriverManager.getConnection("jdbc:mysql://10.10.20.173:3306/testDBByPrashant","prsingh","Gemini@123");
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from testTableByPrashant");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));			
			}
			con.close();			
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
