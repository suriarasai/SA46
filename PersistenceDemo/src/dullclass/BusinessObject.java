package dullclass;

import java.sql.SQLException;

import dao.DAOFactory;
import dao.StudentDAO;
import model.Student;

public class BusinessObject {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Student studentOne = new Student("TestJPA", null, "S1234578E", "In JPA", 78);
		Student studentTwo = new Student("TestJDBC", null, "S1234579K", "In JDBC", 67);
		StudentDAO sdao1 = DAOFactory.getStudentDAO(1);
		sdao1.createStudent(studentOne);
		sdao1 = DAOFactory.getStudentDAO(0);
		sdao1.createStudent(studentTwo);
	}
}
