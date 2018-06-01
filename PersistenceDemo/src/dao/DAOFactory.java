package dao;

public class DAOFactory {
	
	private static int DATA_SCORE = 1;
	
	public static StudentDAO getStudentDAO(int i) {
		if (i>=0 ) DATA_SCORE = i;
		if (DATA_SCORE == 1)
			return new dao.jpa.StudentDAOImpl();
		else
			return new dao.jdbc.StudentDAOImpl();
	}

}
