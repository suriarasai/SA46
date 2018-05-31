package dullclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Student;

public class PleaseSmile {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Step 1
		Class.forName("com.mysql.jdbc.Driver");
		// Step 2
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sa46","root","password");
	    // Strep 3
		Statement statement = connection.createStatement();
		// Step 4 
		ResultSet rs = statement.executeQuery("SELECT * FROM sa46.student;");
		// Step 5
		while (rs.next()) {
			Student s = new Student();
            s.setNric(rs.getString("nric"));
            s.setName(rs.getString("name"));
            s.setNickName(rs.getString("nick_name"));
            s.setMark(rs.getInt("mark"));
            System.out.println(s.toString());
		}
		// Step 6 
		statement.close();
		connection.close();
	}

}
