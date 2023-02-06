package auth.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import auth.domain.User;
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
	
	@PostMapping(path= "/signin")
	public User signInUser(@RequestBody User user) {
		System.out.println(user.getUserName());
		System.out.println(user.getUserLastName());
		System.out.println(user.getUserFirstName());
		System.out.println(user.getUserPassword());
		System.out.println(user.getRoleId());
		return userService.signUpUser(user);
	}

	@GetMapping(path = "/getUser/{id}")
	public User getUserByIdentifier(@PathVariable("id") int id){
		return userService.getUserByIdentifier(id);
	}
	
	
}
