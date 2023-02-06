package auth.domain.repository;


import auth.domain.User;

public interface User_repository {
	
	// Sign UP 
	User createNewUser(User user);
	void deleteUser(int userId);
	User getUserByIdentifier(int id);
	// Sign IN
	// User SignInUser(int userId, String guidCode, String password);
	
}
