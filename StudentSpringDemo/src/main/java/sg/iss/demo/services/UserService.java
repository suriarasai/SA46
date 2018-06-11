package sg.iss.demo.services;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

import sg.iss.demo.model.User;

public interface UserService {

	ArrayList<User> findAllUsers();

	User createUser(User u);

	User updateUser(User u);

	void removeUser(User u);

	User findUser(Long id);
	
	boolean doesUserExist(User user);
	
	void deleteAllUsers();

}