package dullclass;

import dao.StudentDAO;
import dao.jpa.StudentDAOImpl;
import model.Student;

public class TestDAOJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StudentDAO sdao = new StudentDAOImpl();
        
        
        for (Student student : sdao.findAll()) {
			System.out.println(student.toString());
		}
	}

}
