package dullclass;

import java.sql.SQLException;

import dao.StudentDAO;
import dao.jdbc.StudentDAOImpl;
import model.Student;

public class TestDAOJDBC {

	public static void main(String[] args) throws  SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		StudentDAO sdao = new StudentDAOImpl();
		Student s = new Student("JACK", null, "S1234565E", "HUNGRY", 78);
		System.out.println("Before DAO");
		sdao.createStudent(s);
		System.out.println("Run to queue in biz canteen");
        
	}

}
