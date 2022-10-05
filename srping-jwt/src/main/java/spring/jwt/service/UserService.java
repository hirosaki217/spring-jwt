package spring.jwt.service;

import spring.jwt.auth.UserPrincipal;
import spring.jwt.entity.User;

public interface UserService {
	User createUser(User user);
	UserPrincipal findByUsername(String username);
}
