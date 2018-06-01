package dullclass;

import java.sql.SQLException;

import dao.StudentDAO;
import dao.jpa.StudentDAOImpl;
import model.Student;

public class TestDAOJPA {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        StudentDAO sdao = new StudentDAOImpl();
        for (Student student : sdao.findAll()) {
			System.out.println(student.toString());
		}
        //Student s1 = new Student("Test", null, "S1234564J", "Test", 56);
        //sdao.createStudent(s1);
	}

}
