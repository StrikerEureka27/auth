package auth.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import auth.domain.User;
import auth.domain.repository.User_repository;
import auth.domain.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/alive")
	public String authTestAlive() {
		return "alive";
	}
	
	@PostMapping(path= "/signin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public User signInUser(@RequestBody User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getUserLastName());
		System.out.println(user.getUserFirstName());
		System.out.println(user.getUserPassword());
		System.out.println(user.getRoleId());
		return userService.signUpUser(user);
	}
	
	
}
