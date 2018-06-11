package sg.iss.demo.services;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.iss.demo.model.User;
import sg.iss.demo.repo.UserRepository;

@Service
public class UserServicesImpl implements UserService {

	@Resource
	UserRepository userRepo;

	public UserServicesImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public ArrayList<User> findAllUsers() {
		return (ArrayList<User>) userRepo.findAll();
	}

	@Override
	@Transactional
	public User findUser(Long id) {
		System.out.println("ID" + id);
		User user = userRepo.findOne(id);
		System.out.println(user.toString());
		return user;

	}

	@Override
	@Transactional
	public User createUser(User u) {
		return userRepo.saveAndFlush(u);
	}

	@Override
	@Transactional
	public User updateUser(User u) {
		return userRepo.saveAndFlush(u);
	}

	@Override
	@Transactional
	public void removeUser(User u) {
		userRepo.delete(u);
	}
	
	public boolean doesUserExist(User user) {
		User user2 = userRepo.findOne(user.getId());
		if (user2 != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void deleteAllUsers() {
		userRepo.deleteAll();
	}

}
