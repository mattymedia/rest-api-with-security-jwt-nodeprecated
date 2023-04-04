package co.com.studentregistration.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.com.studentregistration.security.entity.CurrentUser;
import co.com.studentregistration.security.entity.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getByUsername(username).get();
        
		return CurrentUser.buildCurrentUser(user);
	}

}
