package dao.jpa;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.StudentDAO;
import model.Student;
import util.PersistenceManager;

public class StudentDAOImpl implements StudentDAO {

	public StudentDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	public StudentDAOImpl(Student s1) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Student> findAll() {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		Query query = em.createQuery("FROM Student");
		ArrayList<Student> result = (ArrayList<Student>)query.getResultList();
		return result;
        
	}

	@Override
	public Student findByNRIC(String nric) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createStudent(Student s) throws ClassNotFoundException, SQLException {
		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
		em.persist(s);
		em.close();
		return 0;
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
