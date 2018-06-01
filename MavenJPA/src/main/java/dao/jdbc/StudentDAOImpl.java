package dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.StudentDAO;
import model.Student;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public ArrayList<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByNRIC(String nric) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createStudent(Student s) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// Step 1
		Class.forName("com.mysql.jdbc.Driver");
		// Step 2
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sa46?SSL=fa", "root", "password");
		// Step 3
		Statement statement = conn.createStatement();
		// Step 4
		int status = statement.executeUpdate("INSERT INTO sa46.student" + 
				"		VALUES ( \"" + s.getName() + "\", \"" + s.getNric() +
				"\", null , \"" + s.getNickName() + "\",  " + s.getMark() + ")");
		statement.close();
		conn.close();
		return status;
	}

	@Override
	public int updateStudent(Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeStudent(String nric) {
		// TODO Auto-generated method stub
		return 0;
	}

}
