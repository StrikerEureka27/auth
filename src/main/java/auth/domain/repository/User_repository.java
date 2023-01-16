package auth.domain.repository;

import java.util.List;

import auth.domain.User;
import auth.persistence.entity.AdmUser;

public interface User_repository {
	
	// Sign UP 
	User createNewUser(User user);
	void deleteUser(int userId);
	// Sign IN
	// User SignInUser(int userId, String guidCode, String password);
	
}
