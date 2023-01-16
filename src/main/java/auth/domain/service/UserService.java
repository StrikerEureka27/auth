package auth.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import auth.domain.User;
import auth.domain.repository.User_repository;

@Service
public class UserService {
	
	@Autowired
	private User_repository userRepo;
	
	public User signUpUser(User user) {
		return userRepo.createNewUser(user);
	}
	
	public void signDownUser(int userId) {
		userRepo.deleteUser(userId);
	}
	
	
}
